// generated with ast extension for cup
// version 0.8
// 20/5/2023 1:48:18


package rs.ac.bg.etf.pp1.ast;

public class TypeDerived1 extends Type {

    public TypeDerived1 () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("TypeDerived1(\n");

        buffer.append(tab);
        buffer.append(") [TypeDerived1]");
        return buffer.toString();
    }
}