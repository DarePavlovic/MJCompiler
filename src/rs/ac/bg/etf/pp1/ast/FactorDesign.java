// generated with ast extension for cup
// version 0.8
// 10/8/2023 22:20:19


package rs.ac.bg.etf.pp1.ast;

public class FactorDesign extends Factor {

    private Designator Designator;
    private ParenActPars ParenActPars;

    public FactorDesign (Designator Designator, ParenActPars ParenActPars) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.ParenActPars=ParenActPars;
        if(ParenActPars!=null) ParenActPars.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public ParenActPars getParenActPars() {
        return ParenActPars;
    }

    public void setParenActPars(ParenActPars ParenActPars) {
        this.ParenActPars=ParenActPars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(ParenActPars!=null) ParenActPars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(ParenActPars!=null) ParenActPars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(ParenActPars!=null) ParenActPars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FactorDesign(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(ParenActPars!=null)
            buffer.append(ParenActPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FactorDesign]");
        return buffer.toString();
    }
}
