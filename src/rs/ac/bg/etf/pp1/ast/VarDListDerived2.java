// generated with ast extension for cup
// version 0.8
// 22/5/2023 0:41:17


package rs.ac.bg.etf.pp1.ast;

public class VarDListDerived2 extends VarDList {

    public VarDListDerived2 () {
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
        buffer.append("VarDListDerived2(\n");

        buffer.append(tab);
        buffer.append(") [VarDListDerived2]");
        return buffer.toString();
    }
}