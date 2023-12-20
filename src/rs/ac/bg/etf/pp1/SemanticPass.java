package rs.ac.bg.etf.pp1;

import org.apache.log4j.Logger;

import rs.ac.bg.etf.pp1.ast.*;
import rs.etf.pp1.symboltable.*;
import rs.etf.pp1.symboltable.concepts.Obj;
import rs.etf.pp1.symboltable.concepts.Struct;

public class SemanticPass extends VisitorAdaptor {

	int printCallCount = 0;
	int varDeclCount = 0;
	boolean errorDetected = false;
	Obj currentMethod = null;
	Logger log = Logger.getLogger(getClass());
	
	public void report_error(String message, SyntaxNode info) {
		errorDetected = true;
		StringBuilder msg = new StringBuilder(message);
		int line = (info == null) ? 0: info.getLine();
		if (line != 0)
			msg.append (" na liniji ").append(line);
		log.error(msg.toString());
	}

	public void report_info(String message, SyntaxNode info) {
		StringBuilder msg = new StringBuilder(message); 
		int line = (info == null) ? 0: info.getLine();
		if (line != 0)
			msg.append (" na liniji ").append(line);
		log.info(msg.toString());
	}
	
	public void visit(VarDeclarations varDecls) {
		
	}

	public void visit(VarDeclaration varDecl){
		
		varDeclCount++;
		VarDecl vardecl = varDecl.getVarDecl();
		Brackets brackets = vardecl.getBrackets();
		Type type = varDecl.getType();
		if(brackets instanceof ArrayBrackets) {
			Struct niz = new Struct(Struct.Array, type.struct);
			Obj varNode = Tab.insert(Obj.Var, vardecl.getVarName(), niz);
			report_info("Deklarisan niz " + vardecl.getVarName(), vardecl);

		}
		else {
			Obj varNode = Tab.insert(Obj.Var, vardecl.getVarName(), type.struct);
			report_info("Deklarisana promenljiva " + vardecl.getVarName(), vardecl);

		}
		//Obj varNode = Tab.insert(Obj.Var, vardecl.getVarName(), varDecl.getType().struct);

	}
	
	public void visit(VarDeclarationComma varDeclComma) {
		varDeclCount++;
		VarDecl vardecl = varDeclComma.getVarDecl();
		Brackets brackets = vardecl.getBrackets();
		Type type = varDeclComma.getType();
		if(brackets instanceof ArrayBrackets) {
			Struct niz = new Struct(Struct.Array, type.struct);
			Obj varNode = Tab.insert(Obj.Var, vardecl.getVarName(), niz);
			report_info("Deklarisan niz " + vardecl.getVarName(), vardecl);

		}
		else {
			Obj varNode = Tab.insert(Obj.Var, vardecl.getVarName(), type.struct);
			report_info("Deklarisana promenljiva " + vardecl.getVarName(), vardecl);

		}
	}
	
    public void visit(PrintStatement print) {
		printCallCount++;
	}
    
    
    
    
    public void visit(ProgName progName)
    {
    	progName.obj = Tab.insert(Obj.Prog, progName.getProgName(), Tab.noType);
    	Tab.openScope();
    }
    
    public void visit(Program program) {
    	Tab.chainLocalSymbols(program.getProgName().obj);
    	Tab.closeScope();
    }
    
    public void visit(Type type) {
    	Obj typeNode = Tab.find(type.getTypeName());
    	if(typeNode == Tab.noObj) {
    		report_error("Nije pronadjen tip " + type.getTypeName() + " u tabeli simbola!", null);
    		type.struct = Tab.noType;
    	}
    	else {
    		if(typeNode.getKind()==Obj.Type) {
    			type.struct = typeNode.getType();
    		}
    		else {
    			report_error("Greska: Ime " + type.getTypeName() + " ne predstavlja tip!", type);
    			type.struct = Tab.noType;
    		}
    	}
    }
}
