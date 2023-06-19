// generated with ast extension for cup
// version 0.8
// 20/5/2023 1:48:18


package rs.ac.bg.etf.pp1.ast;

public class FormParsDerived1 extends FormPars {

    private Type Type;
    private Brackets Brackets;
    private BracketList BracketList;

    public FormParsDerived1 (Type Type, Brackets Brackets, BracketList BracketList) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.Brackets=Brackets;
        if(Brackets!=null) Brackets.setParent(this);
        this.BracketList=BracketList;
        if(BracketList!=null) BracketList.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public Brackets getBrackets() {
        return Brackets;
    }

    public void setBrackets(Brackets Brackets) {
        this.Brackets=Brackets;
    }

    public BracketList getBracketList() {
        return BracketList;
    }

    public void setBracketList(BracketList BracketList) {
        this.BracketList=BracketList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(Brackets!=null) Brackets.accept(visitor);
        if(BracketList!=null) BracketList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(Brackets!=null) Brackets.traverseTopDown(visitor);
        if(BracketList!=null) BracketList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(Brackets!=null) Brackets.traverseBottomUp(visitor);
        if(BracketList!=null) BracketList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FormParsDerived1(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Brackets!=null)
            buffer.append(Brackets.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(BracketList!=null)
            buffer.append(BracketList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FormParsDerived1]");
        return buffer.toString();
    }
}
