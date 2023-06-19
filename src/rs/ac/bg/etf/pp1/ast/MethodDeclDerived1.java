// generated with ast extension for cup
// version 0.8
// 20/5/2023 1:48:18


package rs.ac.bg.etf.pp1.ast;

public class MethodDeclDerived1 extends MethodDecl {

    private MethOnce MethOnce;
    private FormsParams FormsParams;
    private VarDeclList VarDeclList;
    private Statements Statements;

    public MethodDeclDerived1 (MethOnce MethOnce, FormsParams FormsParams, VarDeclList VarDeclList, Statements Statements) {
        this.MethOnce=MethOnce;
        if(MethOnce!=null) MethOnce.setParent(this);
        this.FormsParams=FormsParams;
        if(FormsParams!=null) FormsParams.setParent(this);
        this.VarDeclList=VarDeclList;
        if(VarDeclList!=null) VarDeclList.setParent(this);
        this.Statements=Statements;
        if(Statements!=null) Statements.setParent(this);
    }

    public MethOnce getMethOnce() {
        return MethOnce;
    }

    public void setMethOnce(MethOnce MethOnce) {
        this.MethOnce=MethOnce;
    }

    public FormsParams getFormsParams() {
        return FormsParams;
    }

    public void setFormsParams(FormsParams FormsParams) {
        this.FormsParams=FormsParams;
    }

    public VarDeclList getVarDeclList() {
        return VarDeclList;
    }

    public void setVarDeclList(VarDeclList VarDeclList) {
        this.VarDeclList=VarDeclList;
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
        if(VarDeclList!=null) VarDeclList.accept(visitor);
        if(Statements!=null) Statements.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethOnce!=null) MethOnce.traverseTopDown(visitor);
        if(FormsParams!=null) FormsParams.traverseTopDown(visitor);
        if(VarDeclList!=null) VarDeclList.traverseTopDown(visitor);
        if(Statements!=null) Statements.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethOnce!=null) MethOnce.traverseBottomUp(visitor);
        if(FormsParams!=null) FormsParams.traverseBottomUp(visitor);
        if(VarDeclList!=null) VarDeclList.traverseBottomUp(visitor);
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

        if(FormsParams!=null)
            buffer.append(FormsParams.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclList!=null)
            buffer.append(VarDeclList.toString("  "+tab));
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
