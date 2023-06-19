// generated with ast extension for cup
// version 0.8
// 20/5/2023 1:48:18


package rs.ac.bg.etf.pp1.ast;

public class CondFactDerived1 extends CondFact {

    private Expr Expr;
    private RelBrackets RelBrackets;

    public CondFactDerived1 (Expr Expr, RelBrackets RelBrackets) {
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
        this.RelBrackets=RelBrackets;
        if(RelBrackets!=null) RelBrackets.setParent(this);
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public RelBrackets getRelBrackets() {
        return RelBrackets;
    }

    public void setRelBrackets(RelBrackets RelBrackets) {
        this.RelBrackets=RelBrackets;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Expr!=null) Expr.accept(visitor);
        if(RelBrackets!=null) RelBrackets.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
        if(RelBrackets!=null) RelBrackets.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        if(RelBrackets!=null) RelBrackets.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CondFactDerived1(\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(RelBrackets!=null)
            buffer.append(RelBrackets.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CondFactDerived1]");
        return buffer.toString();
    }
}
