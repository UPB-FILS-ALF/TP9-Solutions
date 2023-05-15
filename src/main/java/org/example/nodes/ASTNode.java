package org.example.nodes;

public abstract class ASTNode {
    public String id;
    public String type;
    public int line;
    public NodeResult result;
    ASTNode(String id){
        this.id = id;
    }
}
