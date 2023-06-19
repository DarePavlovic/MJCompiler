// generated with ast extension for cup
// version 0.8
// 20/5/2023 1:48:18


package rs.ac.bg.etf.pp1.ast;

public class BracketListDerived1 extends BracketList {

    private BracketList BracketList;
    private Brackets Brackets;

    public BracketListDerived1 (BracketList BracketList, Brackets Brackets) {
        this.BracketList=BracketList;
        if(BracketList!=null) BracketList.setParent(this);
        this.Brackets=Brackets;
        if(Brackets!=null) Brackets.setParent(this);
    }

    public BracketList getBracketList() {
        return BracketList;
    }

    public void setBracketList(BracketList BracketList) {
        this.BracketList=BracketList;
    }

    public Brackets getBrackets() {
        return Brackets;
    }

    public void setBrackets(Brackets Brackets) {
        this.Brackets=Brackets;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(BracketList!=null) BracketList.accept(visitor);
        if(Brackets!=null) Brackets.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(BracketList!=null) BracketList.traverseTopDown(visitor);
        if(Brackets!=null) Brackets.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(BracketList!=null) BracketList.traverseBottomUp(visitor);
        if(Brackets!=null) Brackets.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("BracketListDerived1(\n");

        if(BracketList!=null)
            buffer.append(BracketList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Brackets!=null)
            buffer.append(Brackets.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [BracketListDerived1]");
        return buffer.toString();
    }
}
