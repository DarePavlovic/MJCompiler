// generated with ast extension for cup
// version 0.8
// 20/5/2023 1:48:18


package rs.ac.bg.etf.pp1.ast;

public class CondTermDerived1 extends CondTerm {

    private CondFact CondFact;
    private FactList FactList;

    public CondTermDerived1 (CondFact CondFact, FactList FactList) {
        this.CondFact=CondFact;
        if(CondFact!=null) CondFact.setParent(this);
        this.FactList=FactList;
        if(FactList!=null) FactList.setParent(this);
    }

    public CondFact getCondFact() {
        return CondFact;
    }

    public void setCondFact(CondFact CondFact) {
        this.CondFact=CondFact;
    }

    public FactList getFactList() {
        return FactList;
    }

    public void setFactList(FactList FactList) {
        this.FactList=FactList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(CondFact!=null) CondFact.accept(visitor);
        if(FactList!=null) FactList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(CondFact!=null) CondFact.traverseTopDown(visitor);
        if(FactList!=null) FactList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(CondFact!=null) CondFact.traverseBottomUp(visitor);
        if(FactList!=null) FactList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("CondTermDerived1(\n");

        if(CondFact!=null)
            buffer.append(CondFact.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(FactList!=null)
            buffer.append(FactList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [CondTermDerived1]");
        return buffer.toString();
    }
}
