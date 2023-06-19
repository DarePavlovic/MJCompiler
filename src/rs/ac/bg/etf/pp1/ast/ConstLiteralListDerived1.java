// generated with ast extension for cup
// version 0.8
// 20/5/2023 1:48:18


package rs.ac.bg.etf.pp1.ast;

public class ConstLiteralListDerived1 extends ConstLiteralList {

    private ConstLiteralList ConstLiteralList;
    private ConstLiteral ConstLiteral;

    public ConstLiteralListDerived1 (ConstLiteralList ConstLiteralList, ConstLiteral ConstLiteral) {
        this.ConstLiteralList=ConstLiteralList;
        if(ConstLiteralList!=null) ConstLiteralList.setParent(this);
        this.ConstLiteral=ConstLiteral;
        if(ConstLiteral!=null) ConstLiteral.setParent(this);
    }

    public ConstLiteralList getConstLiteralList() {
        return ConstLiteralList;
    }

    public void setConstLiteralList(ConstLiteralList ConstLiteralList) {
        this.ConstLiteralList=ConstLiteralList;
    }

    public ConstLiteral getConstLiteral() {
        return ConstLiteral;
    }

    public void setConstLiteral(ConstLiteral ConstLiteral) {
        this.ConstLiteral=ConstLiteral;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ConstLiteralList!=null) ConstLiteralList.accept(visitor);
        if(ConstLiteral!=null) ConstLiteral.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ConstLiteralList!=null) ConstLiteralList.traverseTopDown(visitor);
        if(ConstLiteral!=null) ConstLiteral.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ConstLiteralList!=null) ConstLiteralList.traverseBottomUp(visitor);
        if(ConstLiteral!=null) ConstLiteral.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstLiteralListDerived1(\n");

        if(ConstLiteralList!=null)
            buffer.append(ConstLiteralList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstLiteral!=null)
            buffer.append(ConstLiteral.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstLiteralListDerived1]");
        return buffer.toString();
    }
}
