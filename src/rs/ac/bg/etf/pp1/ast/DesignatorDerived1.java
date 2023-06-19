// generated with ast extension for cup
// version 0.8
// 20/5/2023 1:48:18


package rs.ac.bg.etf.pp1.ast;

public class DesignatorDerived1 extends Designator {

    private ExpList ExpList;

    public DesignatorDerived1 (ExpList ExpList) {
        this.ExpList=ExpList;
        if(ExpList!=null) ExpList.setParent(this);
    }

    public ExpList getExpList() {
        return ExpList;
    }

    public void setExpList(ExpList ExpList) {
        this.ExpList=ExpList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ExpList!=null) ExpList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExpList!=null) ExpList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExpList!=null) ExpList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesignatorDerived1(\n");

        if(ExpList!=null)
            buffer.append(ExpList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesignatorDerived1]");
        return buffer.toString();
    }
}
