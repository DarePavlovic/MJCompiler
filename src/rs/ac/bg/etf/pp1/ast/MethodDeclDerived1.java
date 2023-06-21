// generated with ast extension for cup
// version 0.8
// 22/5/2023 0:41:17


package rs.ac.bg.etf.pp1.ast;

public class MethodDeclDerived1 extends MethodDecl {

    private MethOnce MethOnce;
    private String I2;
    private FormsParams FormsParams;
    private VarDList VarDList;
    private Statements Statements;

    public MethodDeclDerived1 (MethOnce MethOnce, String I2, FormsParams FormsParams, VarDList VarDList, Statements Statements) {
        this.MethOnce=MethOnce;
        if(MethOnce!=null) MethOnce.setParent(this);
        this.I2=I2;
        this.FormsParams=FormsParams;
        if(FormsParams!=null) FormsParams.setParent(this);
        this.VarDList=VarDList;
        if(VarDList!=null) VarDList.setParent(this);
        this.Statements=Statements;
        if(Statements!=null) Statements.setParent(this);
    }

    public MethOnce getMethOnce() {
        return MethOnce;
    }

    public void setMethOnce(MethOnce MethOnce) {
        this.MethOnce=MethOnce;
    }

    public String getI2() {
        return I2;
    }

    public void setI2(String I2) {
        this.I2=I2;
    }

    public FormsParams getFormsParams() {
        return FormsParams;
    }

    public void setFormsParams(FormsParams FormsParams) {
        this.FormsParams=FormsParams;
    }

    public VarDList getVarDList() {
        return VarDList;
    }

    public void setVarDList(VarDList VarDList) {
        this.VarDList=VarDList;
    }

    public Statements getStatements() {
        return Statements;
    }

    public void setStatements(Statements Statements) {
        this.Statements=Statements;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MethOnce!=null) MethOnce.accept(visitor);
        if(FormsParams!=null) FormsParams.accept(visitor);
        if(VarDList!=null) VarDList.accept(visitor);
        if(Statements!=null) Statements.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethOnce!=null) MethOnce.traverseTopDown(visitor);
        if(FormsParams!=null) FormsParams.traverseTopDown(visitor);
        if(VarDList!=null) VarDList.traverseTopDown(visitor);
        if(Statements!=null) Statements.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethOnce!=null) MethOnce.traverseBottomUp(visitor);
        if(FormsParams!=null) FormsParams.traverseBottomUp(visitor);
        if(VarDList!=null) VarDList.traverseBottomUp(visitor);
        if(Statements!=null) Statements.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodDeclDerived1(\n");

        if(MethOnce!=null)
            buffer.append(MethOnce.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(" "+tab+I2);
        buffer.append("\n");

        if(FormsParams!=null)
            buffer.append(FormsParams.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDList!=null)
            buffer.append(VarDList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(Statements!=null)
            buffer.append(Statements.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodDeclDerived1]");
        return buffer.toString();
    }
}
