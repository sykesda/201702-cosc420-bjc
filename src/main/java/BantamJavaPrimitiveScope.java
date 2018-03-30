import org.antlr.symtab.*;

public class BantamJavaPrimitiveScope extends org.antlr.symtab.PredefinedScope {
    /*

     */
    public BantamJavaPrimitiveScope(){

        //Create Type Objects

        PrimitiveType typeInt = new PrimitiveType("int");
        PrimitiveType typeBoolean = new PrimitiveType("boolean");
        PrimitiveType typeVoid = new PrimitiveType("void");
        this.define(typeInt);
        this.define(typeBoolean);
        this.define(typeVoid);


        //Create Class Objects
        ClassSymbol Object = new ClassSymbol("Object");
        Object.setEnclosingScope(this);
        this.define(Object);

        ClassSymbol Sys = new ClassSymbol("Sys");
        Sys.setEnclosingScope(this);
        Sys.setSuperClass("Object");
        this.define(Sys);

        ClassSymbol String = new ClassSymbol("String");
        String.setEnclosingScope(this);
        String.setSuperClass("Object");
        this.define(String);

        ClassSymbol TextIO = new ClassSymbol("TextIO");
        TextIO.setEnclosingScope(this);
        TextIO.setSuperClass("Object");
        this.define(TextIO);


        //Object Methods
        MethodSymbol ObjectClone = new MethodSymbol("clone");
        ObjectClone.setEnclosingScope(Object.getScope());
        ObjectClone.setType(Object);
        this.define(ObjectClone);

        MethodSymbol ObjectEquals = new MethodSymbol("equals");
        ObjectEquals.setEnclosingScope(Object.getScope());
        ObjectEquals.setType(typeBoolean);
        this.define(ObjectEquals);

        MethodSymbol ObjectToString = new MethodSymbol("toString");
        ObjectToString.setEnclosingScope(Object.getScope());
        ObjectToString.setType(String);
        this.define(ObjectToString);


        //Sys Methods
        MethodSymbol SysExit = new MethodSymbol("exit");
        SysExit.setEnclosingScope(Sys.getScope());
        SysExit.setType(typeVoid);
        this.define(SysExit);
        ParameterSymbol SysExitStatus = new ParameterSymbol("status");
        SysExitStatus.setType(typeInt);
        this.define(SysExitStatus);
        //TODO figure out if anything more needs to be done with parameters

        MethodSymbol SysTime = new MethodSymbol("time");
        SysTime.setEnclosingScope(Sys.getScope());
        SysTime.setType(typeInt);
        this.define(SysTime);

        MethodSymbol SysRandom = new MethodSymbol("random");
        SysRandom.setEnclosingScope(Sys.getScope());
        SysRandom.setType(typeInt);
        this.define(SysRandom);


        //String Methods
        MethodSymbol StringLength = new MethodSymbol("length");
        StringLength.setEnclosingScope(String.getScope());
        StringLength.setType(typeInt);
        this.define(StringLength);

        // ***** Problem with this.define(StringEquals);
        MethodSymbol StringEquals = new MethodSymbol("equals");
        StringEquals.setEnclosingScope(String.getScope());
        StringEquals.setType(typeBoolean);
        this.define(StringEquals);
        ParameterSymbol StringEqualsS = new ParameterSymbol("s");
        StringEqualsS.setType(Object);
        this.define(StringEqualsS);

        MethodSymbol StringToString = new MethodSymbol("toString");
        StringToString.setEnclosingScope(String.getScope());
        StringToString.setType(String);
        this.define(StringToString);

        MethodSymbol StringSubstring = new MethodSymbol("substring");
        StringSubstring.setEnclosingScope(String.getScope());
        StringSubstring.setType(String);
        this.define(StringSubstring);
        ParameterSymbol StringSubstringBeginIndex = new ParameterSymbol("beginIndex");
        StringSubstringBeginIndex.setType(typeInt);
        this.define(StringSubstringBeginIndex);
        ParameterSymbol StringSubstringEndIndex = new ParameterSymbol("endIndex");
        StringSubstringEndIndex.setType(typeInt);
        this.define(StringSubstringEndIndex);

        MethodSymbol StringConcat = new MethodSymbol("concat");
        StringConcat.setEnclosingScope(String.getScope());
        StringConcat.setType(String);
        this.define(StringConcat);
        ParameterSymbol StringConcatS = new ParameterSymbol("s");
        StringConcatS.setType(String);
        this.define(StringConcatS);


        //TextIO methods
        MethodSymbol TextIOReadFile = new MethodSymbol("readFile");
        TextIOReadFile.setEnclosingScope(TextIO.getScope());
        TextIOReadFile.setType(typeVoid);
        this.define(TextIOReadFile);
        ParameterSymbol TextIOReadFileFName = new ParameterSymbol("filename");
        TextIOReadFileFName.setType(String);
        this.define(TextIOReadFileFName);

        MethodSymbol TextIOWriteFile = new MethodSymbol("writeFile");
        TextIOWriteFile.setEnclosingScope(TextIO.getScope());
        TextIOWriteFile.setType(typeVoid);
        this.define(TextIOWriteFile);
        ParameterSymbol TextIOWriteFileFName = new ParameterSymbol("filename");
        TextIOWriteFileFName.setType(String);
        this.define(TextIOWriteFileFName);

        MethodSymbol TextIOReadStdin = new MethodSymbol("readStdin");
        TextIOReadStdin.setEnclosingScope(TextIO.getScope());
        TextIOReadStdin.setType(typeVoid);
        this.define(TextIOReadStdin);

        MethodSymbol TextIOWriteStdout = new MethodSymbol("writeStdout");
        TextIOWriteStdout.setEnclosingScope(TextIO.getScope());
        TextIOWriteStdout.setType(typeVoid);
        this.define(TextIOWriteStdout);

        MethodSymbol TextIOWriteStderr = new MethodSymbol("writeStderr");
        TextIOWriteStderr.setEnclosingScope(TextIO.getScope());
        TextIOWriteStderr.setType(typeVoid);
        this.define(TextIOWriteStderr);

        MethodSymbol TextIOGetString = new MethodSymbol("getString");
        TextIOGetString.setEnclosingScope(TextIO.getScope());
        TextIOGetString.setType(String);
        this.define(TextIOGetString);

        MethodSymbol TextIOGetInt = new MethodSymbol("getInt");
        TextIOGetInt.setEnclosingScope(TextIO.getScope());
        TextIOGetInt.setType(typeInt);
        this.define(TextIOGetInt);

        MethodSymbol TextIOPutString = new MethodSymbol("putString");
        TextIOPutString.setEnclosingScope(TextIO.getScope());
        TextIOPutString.setType(typeVoid);
        this.define(TextIOPutString);
        ParameterSymbol TextIOPutStringS = new ParameterSymbol("s");
        TextIOPutStringS.setType(String);
        this.define(TextIOPutStringS);

        MethodSymbol TextIOPutInt = new MethodSymbol("putInt");
        TextIOPutInt.setEnclosingScope(TextIO.getScope());
        TextIOPutInt.setType(typeVoid);
        this.define(TextIOPutInt);
        ParameterSymbol TextIOPutIntI = new ParameterSymbol("i");
        TextIOPutIntI.setType(typeInt);
        this.define(TextIOPutIntI);
    }
}