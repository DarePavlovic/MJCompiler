// generated with ast extension for cup
// version 0.8
// 20/5/2023 1:48:18


package rs.ac.bg.etf.pp1.ast;

public class StatementDerived5 extends Statement {

    private ExprBrackets ExprBrackets;

    public StatementDerived5 (ExprBrackets ExprBrackets) {
        this.ExprBrackets=ExprBrackets;
        if(ExprBrackets!=null) ExprBrackets.setParent(this);
    }

    public ExprBrackets getExprBrackets() {
        return ExprBrackets;
    }

    public void setExprBrackets(ExprBrackets ExprBrackets) {
        this.ExprBrackets=ExprBrackets;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ExprBrackets!=null) ExprBrackets.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ExprBrackets!=null) ExprBrackets.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ExprBrackets!=null) ExprBrackets.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDerived5(\n");

        if(ExprBrackets!=null)
            buffer.append(ExprBrackets.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDerived5]");
        return buffer.toString();
    }
}
