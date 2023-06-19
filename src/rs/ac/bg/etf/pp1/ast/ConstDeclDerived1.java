// generated with ast extension for cup
// version 0.8
// 20/5/2023 1:48:18


package rs.ac.bg.etf.pp1.ast;

public class ConstDeclDerived1 extends ConstDecl {

    private Type Type;
    private ConstLiteral ConstLiteral;
    private ConstLiteralList ConstLiteralList;

    public ConstDeclDerived1 (Type Type, ConstLiteral ConstLiteral, ConstLiteralList ConstLiteralList) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.ConstLiteral=ConstLiteral;
        if(ConstLiteral!=null) ConstLiteral.setParent(this);
        this.ConstLiteralList=ConstLiteralList;
        if(ConstLiteralList!=null) ConstLiteralList.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public ConstLiteral getConstLiteral() {
        return ConstLiteral;
    }

    public void setConstLiteral(ConstLiteral ConstLiteral) {
        this.ConstLiteral=ConstLiteral;
    }

    public ConstLiteralList getConstLiteralList() {
        return ConstLiteralList;
    }

    public void setConstLiteralList(ConstLiteralList ConstLiteralList) {
        this.ConstLiteralList=ConstLiteralList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(ConstLiteral!=null) ConstLiteral.accept(visitor);
        if(ConstLiteralList!=null) ConstLiteralList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(ConstLiteral!=null) ConstLiteral.traverseTopDown(visitor);
        if(ConstLiteralList!=null) ConstLiteralList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(ConstLiteral!=null) ConstLiteral.traverseBottomUp(visitor);
        if(ConstLiteralList!=null) ConstLiteralList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ConstDeclDerived1(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstLiteral!=null)
            buffer.append(ConstLiteral.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ConstLiteralList!=null)
            buffer.append(ConstLiteralList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ConstDeclDerived1]");
        return buffer.toString();
    }
}
