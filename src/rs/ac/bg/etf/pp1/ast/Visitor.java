// generated with ast extension for cup
// version 0.8
// 22/5/2023 0:41:17


package rs.ac.bg.etf.pp1.ast;

public interface Visitor { 

    public void visit(Mulop Mulop);
    public void visit(MethodDecl MethodDecl);
    public void visit(BracketMinus BracketMinus);
    public void visit(Relop Relop);
    public void visit(Assignop Assignop);
    public void visit(VarDeclL VarDeclL);
    public void visit(AddOpList AddOpList);
    public void visit(CondList CondList);
    public void visit(ActParams ActParams);
    public void visit(Addop Addop);
    public void visit(NewBracketList NewBracketList);
    public void visit(MulList MulList);
    public void visit(NumConstBrack NumConstBrack);
    public void visit(AssList AssList);
    public void visit(Factor Factor);
    public void visit(CondTerm CondTerm);
    public void visit(FactList FactList);
    public void visit(RelBrackets RelBrackets);
    public void visit(DeclList DeclList);
    public void visit(Designator Designator);
    public void visit(Term Term);
    public void visit(Condition Condition);
    public void visit(ParenActPars ParenActPars);
    public void visit(Statements Statements);
    public void visit(VarDList VarDList);
    public void visit(ConstDeclList ConstDeclList);
    public void visit(BracketList BracketList);
    public void visit(FormsParams FormsParams);
    public void visit(Label Label);
    public void visit(Brackets Brackets);
    public void visit(ConstLiteral ConstLiteral);
    public void visit(ExprList ExprList);
    public void visit(VarDeclList VarDeclList);
    public void visit(Expr Expr);
    public void visit(ActPars ActPars);
    public void visit(DesignatorStatement DesignatorStatement);
    public void visit(ExpList ExpList);
    public void visit(Statement Statement);
    public void visit(VarDecl VarDecl);
    public void visit(Type Type);
    public void visit(ConstDecl ConstDecl);
    public void visit(CondFact CondFact);
    public void visit(MethodDeclList MethodDeclList);
    public void visit(Program Program);
    public void visit(FormPars FormPars);
    public void visit(ElseBracket ElseBracket);
    public void visit(ExprBrackets ExprBrackets);
    public void visit(ConstLiteralList ConstLiteralList);
    public void visit(MethOnce MethOnce);
    public void visit(ElseBracketDerived2 ElseBracketDerived2);
    public void visit(ElseBracketDerived1 ElseBracketDerived1);
    public void visit(LabelDerived1 LabelDerived1);
    public void visit(RelopDerived6 RelopDerived6);
    public void visit(RelopDerived5 RelopDerived5);
    public void visit(RelopDerived4 RelopDerived4);
    public void visit(RelopDerived3 RelopDerived3);
    public void visit(RelopDerived2 RelopDerived2);
    public void visit(RelopDerived1 RelopDerived1);
    public void visit(RelBracketsDerived2 RelBracketsDerived2);
    public void visit(RelBracketsDerived1 RelBracketsDerived1);
    public void visit(CondFactDerived1 CondFactDerived1);
    public void visit(CondTermDerived2 CondTermDerived2);
    public void visit(CondTermDerived1 CondTermDerived1);
    public void visit(ConditionDerived2 ConditionDerived2);
    public void visit(ConditionDerived1 ConditionDerived1);
    public void visit(AssignopDerived1 AssignopDerived1);
    public void visit(AssListDerived4 AssListDerived4);
    public void visit(AssListDerived3 AssListDerived3);
    public void visit(AssListDerived2 AssListDerived2);
    public void visit(AssListDerived1 AssListDerived1);
    public void visit(DesignatorStatementDerived1 DesignatorStatementDerived1);
    public void visit(ActParsDerived2 ActParsDerived2);
    public void visit(ActParsDerived1 ActParsDerived1);
    public void visit(ActParamsDerived2 ActParamsDerived2);
    public void visit(ActParamsDerived1 ActParamsDerived1);
    public void visit(ParenActParsDerived2 ParenActParsDerived2);
    public void visit(ParenActParsDerived1 ParenActParsDerived1);
    public void visit(DesignatorDerived2 DesignatorDerived2);
    public void visit(DesignatorDerived1 DesignatorDerived1);
    public void visit(FactorDerived7 FactorDerived7);
    public void visit(FactorDerived6 FactorDerived6);
    public void visit(FactorDerived5 FactorDerived5);
    public void visit(FactorDerived4 FactorDerived4);
    public void visit(FactorDerived3 FactorDerived3);
    public void visit(FactorDerived2 FactorDerived2);
    public void visit(FactorDerived1 FactorDerived1);
    public void visit(AddOpListDerived3 AddOpListDerived3);
    public void visit(AddOpListDerived2 AddOpListDerived2);
    public void visit(AddOpListDerived1 AddOpListDerived1);
    public void visit(MulopDerived3 MulopDerived3);
    public void visit(MulopDerived2 MulopDerived2);
    public void visit(MulopDerived1 MulopDerived1);
    public void visit(MulListDerived2 MulListDerived2);
    public void visit(MulListDerived1 MulListDerived1);
    public void visit(TermDerived1 TermDerived1);
    public void visit(ExprDerived2 ExprDerived2);
    public void visit(ExprDerived1 ExprDerived1);
    public void visit(ExprBracketsDerived2 ExprBracketsDerived2);
    public void visit(ExprBracketsDerived1 ExprBracketsDerived1);
    public void visit(NumConstBrackDerived2 NumConstBrackDerived2);
    public void visit(NumConstBrackDerived1 NumConstBrackDerived1);
    public void visit(StatementDerived10 StatementDerived10);
    public void visit(StatementDerived9 StatementDerived9);
    public void visit(StatementDerived8 StatementDerived8);
    public void visit(StatementDerived7 StatementDerived7);
    public void visit(StatementDerived6 StatementDerived6);
    public void visit(StatementDerived5 StatementDerived5);
    public void visit(StatementDerived4 StatementDerived4);
    public void visit(StatementDerived3 StatementDerived3);
    public void visit(StatementDerived2 StatementDerived2);
    public void visit(StatementDerived1 StatementDerived1);
    public void visit(StatementsDerived2 StatementsDerived2);
    public void visit(StatementsDerived1 StatementsDerived1);
    public void visit(FormParsDerived2 FormParsDerived2);
    public void visit(FormParsDerived1 FormParsDerived1);
    public void visit(FormsParamsDerived2 FormsParamsDerived2);
    public void visit(FormsParamsDerived1 FormsParamsDerived1);
    public void visit(MethOnceDerived2 MethOnceDerived2);
    public void visit(MethOnceDerived1 MethOnceDerived1);
    public void visit(VarDeclLDerived3 VarDeclLDerived3);
    public void visit(VarDeclLDerived2 VarDeclLDerived2);
    public void visit(VarDeclLDerived1 VarDeclLDerived1);
    public void visit(VarDListDerived2 VarDListDerived2);
    public void visit(VarDListDerived1 VarDListDerived1);
    public void visit(MethodDeclDerived1 MethodDeclDerived1);
    public void visit(MethodDeclListDerived2 MethodDeclListDerived2);
    public void visit(MethodDeclListDerived1 MethodDeclListDerived1);
    public void visit(ConstLiteralDerived3 ConstLiteralDerived3);
    public void visit(ConstLiteralDerived2 ConstLiteralDerived2);
    public void visit(ConstLiteralDerived1 ConstLiteralDerived1);
    public void visit(ConstDeclDerived1 ConstDeclDerived1);
    public void visit(ConstDeclListDerived2 ConstDeclListDerived2);
    public void visit(ConstDeclListDerived1 ConstDeclListDerived1);
    public void visit(BracketsDerived2 BracketsDerived2);
    public void visit(BracketsDerived1 BracketsDerived1);
    public void visit(TypeDerived1 TypeDerived1);
    public void visit(VarDeclDerived1 VarDeclDerived1);
    public void visit(VarDeclListDerived2 VarDeclListDerived2);
    public void visit(VarDeclListDerived1 VarDeclListDerived1);
    public void visit(DeclListDerived3 DeclListDerived3);
    public void visit(DeclListDerived2 DeclListDerived2);
    public void visit(DeclListDerived1 DeclListDerived1);
    public void visit(ProgramDerived1 ProgramDerived1);

}
