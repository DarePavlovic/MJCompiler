// generated with ast extension for cup
// version 0.8
// 20/5/2023 1:48:18


package rs.ac.bg.etf.pp1.ast;

public class StatementDerived8 extends Statement {

    private Expr Expr;
    private NumConstBrack NumConstBrack;

    public StatementDerived8 (Expr Expr, NumConstBrack NumConstBrack) {
        this.Expr=Expr;
        if(Expr!=null) Expr.setParent(this);
        this.NumConstBrack=NumConstBrack;
        if(NumConstBrack!=null) NumConstBrack.setParent(this);
    }

    public Expr getExpr() {
        return Expr;
    }

    public void setExpr(Expr Expr) {
        this.Expr=Expr;
    }

    public NumConstBrack getNumConstBrack() {
        return NumConstBrack;
    }

    public void setNumConstBrack(NumConstBrack NumConstBrack) {
        this.NumConstBrack=NumConstBrack;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Expr!=null) Expr.accept(visitor);
        if(NumConstBrack!=null) NumConstBrack.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Expr!=null) Expr.traverseTopDown(visitor);
        if(NumConstBrack!=null) NumConstBrack.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Expr!=null) Expr.traverseBottomUp(visitor);
        if(NumConstBrack!=null) NumConstBrack.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("StatementDerived8(\n");

        if(Expr!=null)
            buffer.append(Expr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(NumConstBrack!=null)
            buffer.append(NumConstBrack.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [StatementDerived8]");
        return buffer.toString();
    }
}
