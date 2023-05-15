package org.example.nodes;

import java.util.ArrayList;

public class FunctionCallNode extends ASTNode {
    public String functionName;
    public ArrayList<ASTNode> parameters;

    public FunctionCallNode(String functionName, ArrayList<ASTNode> parameters, int line) {
        super("functionCall");
        this.functionName = functionName;
        this.parameters = parameters;
        this.line = line;
    }
}
