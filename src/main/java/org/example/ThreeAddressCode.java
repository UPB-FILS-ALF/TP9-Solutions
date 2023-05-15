package org.example;

import org.example.nodes.*;

import javax.swing.plaf.nimbus.State;
import java.util.ArrayList;

public class ThreeAddressCode {
    static int variable_id = 0;
    ArrayList<String> results = new ArrayList<>();
    public String nextVarName(){
        return "var" + variable_id++;
    }
    public ArrayList<String> writeThreeAddressCode(ASTNode node){
        if(node instanceof StatementsNode) {
            for(ASTNode statement : ((StatementsNode) node).statements){
                writeThreeAddressCode(statement);
            }
        } else if (node instanceof ValueNode ) {
            /** TODO 4: Push the value on stack */
            results.add("push " + ((ValueNode) node).value + "\n");
        } else if (node instanceof VariableNode) {
            /** TODO 4: Push the variable name on stack */
            results.add("push " + ((VariableNode) node).variableName + "\n");
        }
        else if(node instanceof ExpressionNode) {
            if(((ExpressionNode) node).left != null && ((ExpressionNode) node).right != null ) {
                writeThreeAddressCode(((ExpressionNode) node).left);
                writeThreeAddressCode(((ExpressionNode) node).right);
                /** TODO 4:
                 * Write T.A.C recursively for both sides of expression
                 * Log the specific stack T.A.C operator according to the token operator value */
                if(((ExpressionNode) node).op.equals("+")){
                    results.add("add" + "\n");
                }
                else if(((ExpressionNode) node).op.equals("-")){
                    results.add("sub" + "\n");
                }
                else if(((ExpressionNode) node).op.equals("*")){
                    results.add("mul" + "\n");
                }
                else if(((ExpressionNode) node).op.equals("/")){
                    results.add("div" + "\n");
                }

            }
        } else if(node instanceof AttributionNode) {
            /** TODO 6: Write T.A.C using stack format */
            writeThreeAddressCode(((AttributionNode) node).value);
            results.add("pop "+ ((AttributionNode) node).variable + "\n");
        } else if(node instanceof FunctionCallNode) {
            /** TODO 5&7:
             * Update the Alf.g4 grammar to make it accept function calls inside expressions
             * Update index Visitor functions to visit function calls used in expressions
             * Write T.A.C recursively for each parameter
             * Log the T.A.C using stack format
             */
            for(ASTNode parameter : ((FunctionCallNode)node).parameters) {
                writeThreeAddressCode(parameter);
                results.add("param" + "\n");
            }
            results.add("push " + ((FunctionCallNode) node).parameters.size() +"\n");
            results.add("push " + ((FunctionCallNode) node).functionName + "\n");
            results.add("call" + "\n");
        } else if (node instanceof FunctionNode) {
            /** TODO 8: Write T.A.C using stack format */
            results.add("push start\ngoto\n");
            results.add("push " + ((FunctionNode) node).functionName + "\nlabel\n");
            for(int i = 0; i < ((FunctionNode) node).instructions.statements.size(); i++) {
                writeThreeAddressCode(((FunctionNode) node).instructions.statements.get(i));
            }
            writeThreeAddressCode(((FunctionNode) node).returnNode);
        } else if (node instanceof ReturnNode){
            writeThreeAddressCode(((ReturnNode) node).statement);
            results.add("return\n");
        }
        return results;
    }
}
