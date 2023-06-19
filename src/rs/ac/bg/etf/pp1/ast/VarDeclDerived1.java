// generated with ast extension for cup
// version 0.8
// 20/5/2023 1:48:18


package rs.ac.bg.etf.pp1.ast;

public class VarDeclDerived1 extends VarDecl {

    private Type Type;
    private BracketList BracketList;
    private NewBracketList NewBracketList;

    public VarDeclDerived1 (Type Type, BracketList BracketList, NewBracketList NewBracketList) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.BracketList=BracketList;
        if(BracketList!=null) BracketList.setParent(this);
        this.NewBracketList=NewBracketList;
        if(NewBracketList!=null) NewBracketList.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public BracketList getBracketList() {
        return BracketList;
    }

    public void setBracketList(BracketList BracketList) {
        this.BracketList=BracketList;
    }

    public NewBracketList getNewBracketList() {
        return NewBracketList;
    }

    public void setNewBracketList(NewBracketList NewBracketList) {
        this.NewBracketList=NewBracketList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(BracketList!=null) BracketList.accept(visitor);
        if(NewBracketList!=null) NewBracketList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(BracketList!=null) BracketList.traverseTopDown(visitor);
        if(NewBracketList!=null) NewBracketList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(BracketList!=null) BracketList.traverseBottomUp(visitor);
        if(NewBracketList!=null) NewBracketList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("VarDeclDerived1(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(BracketList!=null)
            buffer.append(BracketList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(NewBracketList!=null)
            buffer.append(NewBracketList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [VarDeclDerived1]");
        return buffer.toString();
    }
}
