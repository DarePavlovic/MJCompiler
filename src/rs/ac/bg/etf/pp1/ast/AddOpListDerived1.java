// generated with ast extension for cup
// version 0.8
// 20/5/2023 1:48:18


package rs.ac.bg.etf.pp1.ast;

public class AddOpListDerived1 extends AddOpList {

    private AddOpList AddOpList;
    private Addop Addop;
    private Term Term;

    public AddOpListDerived1 (AddOpList AddOpList, Addop Addop, Term Term) {
        this.AddOpList=AddOpList;
        if(AddOpList!=null) AddOpList.setParent(this);
        this.Addop=Addop;
        if(Addop!=null) Addop.setParent(this);
        this.Term=Term;
        if(Term!=null) Term.setParent(this);
    }

    public AddOpList getAddOpList() {
        return AddOpList;
    }

    public void setAddOpList(AddOpList AddOpList) {
        this.AddOpList=AddOpList;
    }

    public Addop getAddop() {
        return Addop;
    }

    public void setAddop(Addop Addop) {
        this.Addop=Addop;
    }

    public Term getTerm() {
        return Term;
    }

    public void setTerm(Term Term) {
        this.Term=Term;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(AddOpList!=null) AddOpList.accept(visitor);
        if(Addop!=null) Addop.accept(visitor);
        if(Term!=null) Term.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(AddOpList!=null) AddOpList.traverseTopDown(visitor);
        if(Addop!=null) Addop.traverseTopDown(visitor);
        if(Term!=null) Term.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(AddOpList!=null) AddOpList.traverseBottomUp(visitor);
        if(Addop!=null) Addop.traverseBottomUp(visitor);
        if(Term!=null) Term.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("AddOpListDerived1(\n");

        if(AddOpList!=null)
            buffer.append(AddOpList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Addop!=null)
            buffer.append(Addop.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Term!=null)
            buffer.append(Term.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [AddOpListDerived1]");
        return buffer.toString();
    }
}
