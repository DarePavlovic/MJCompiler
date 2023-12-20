// generated with ast extension for cup
// version 0.8
// 10/8/2023 22:20:19


package rs.ac.bg.etf.pp1.ast;

public class NoMultiplicativeList extends MulList {

    public NoMultiplicativeList () {
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
        buffer.append("NoMultiplicativeList(\n");

        buffer.append(tab);
        buffer.append(") [NoMultiplicativeList]");
        return buffer.toString();
    }
}
