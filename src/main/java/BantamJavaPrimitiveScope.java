import org.antlr.symtab.*;

public class BantamJavaPrimitiveScope extends org.antlr.symtab.PredefinedScope {
    /*

     */
    public BantamJavaPrimitiveScope(){

        //Create Type Objects

        PrimitiveType typeInt = new PrimitiveType("int");
        PrimitiveType typeBoolean = new PrimitiveType("boolean");
        PrimitiveType typeVoid = new PrimitiveType("void");


        //Create Class Object
        ClassSymbol Object = new ClassSymbol("Object");
        Object.setEnclosingScope(this);
        MethodSymbol ObjectClone = new MethodSymbol("clone");
        ObjectClone.setEnclosingScope(Object.getScope());
        //TODO set to Object type

        MethodSymbol ObjectEquals = new MethodSymbol("equals");
        ObjectEquals.setEnclosingScope(Object.getScope());
        ObjectEquals.setType(typeBoolean);

        MethodSymbol ObjectToString = new MethodSymbol("toString");
        ObjectToString.setEnclosingScope(Object.getScope());
        //TODO Set to String type

        this.define(Object);


        ClassSymbol Sys = new ClassSymbol("Sys");
        Sys.setEnclosingScope(this);
        MethodSymbol SysExit = new MethodSymbol("exit");
        SysExit.setEnclosingScope(Sys.getScope());
        SysExit.setType(typeVoid);
        ParameterSymbol SysExitStatus = new ParameterSymbol("status");
        SysExitStatus.setType(typeInt);
        //ObjectExitStatus.setScope(ObjectExit.getScope());
        MethodSymbol SysTime = new MethodSymbol("time");
        SysTime.setEnclosingScope(Sys.getScope());
        SysTime.setType(typeInt);
        MethodSymbol SysRandom = new MethodSymbol("random");
        SysRandom.setEnclosingScope(Sys.getScope());
        SysRandom.setType(typeInt);

        ClassSymbol String = new ClassSymbol("String");
        String.setEnclosingScope(this);

        MethodSymbol StringLength = new MethodSymbol("length");
        StringLength.setEnclosingScope(String.getScope());
        StringLength.setType(typeInt);

        MethodSymbol StringEquals = new MethodSymbol("equals");
        StringEquals.setEnclosingScope(String.getScope());
        StringEquals.setType(typeBoolean);
        ParameterSymbol StringEqualS = new ParameterSymbol("s");
        //TODO set to type Object
        MethodSymbol StringToString = new MethodSymbol("toString");
        StringToString.setEnclosingScope(String.getScope());
        //TODO set to type String

        MethodSymbol StringSubstring = new MethodSymbol("substring");
        StringSubstring.setEnclosingScope(String.getScope());
        //TODO set to type String
        ParameterSymbol StringSubstringBeginIndex = new ParameterSymbol("beginIndex");
        StringSubstringBeginIndex.setType(typeInt);
        ParameterSymbol StringSubstringEndIndex = new ParameterSymbol("endIndex");
        StringSubstringEndIndex.setType(typeInt);

        MethodSymbol StringConcat = new MethodSymbol("concat");
        StringConcat.setEnclosingScope(String.getScope());
        //TODO type string
        ParameterSymbol StringConcatS = new ParameterSymbol("s");
        //TODO type String


        ClassSymbol TextIO = new ClassSymbol("TextIO");
        TextIO.setEnclosingScope(this);

        MethodSymbol TextIOReadFile = new MethodSymbol("readFile");
        TextIOReadFile.setEnclosingScope(TextIO.getScope());
        TextIOReadFile.setType(typeVoid);
        ParameterSymbol TextIOReadFileFName = new ParameterSymbol("filename");
        //TODO type string
        MethodSymbol TextIOWriteFile = new MethodSymbol("writeFile");
        TextIOWriteFile.setEnclosingScope(TextIO.getScope());
        TextIOWriteFile.setType(typeVoid);
        ParameterSymbol TextIOWriteFileFName = new ParameterSymbol("filename");
        //TODO type string

        MethodSymbol TextIOReadStdin = new MethodSymbol("readStdin");
        TextIOReadStdin.setEnclosingScope(TextIO.getScope());
        TextIOReadStdin.setType(typeVoid);

        MethodSymbol TextIOWriteStdout = new MethodSymbol("writeStdout");
        TextIOWriteStdout.setEnclosingScope(TextIO.getScope());
        TextIOWriteStdout.setType(typeVoid);

        MethodSymbol TextIOWriteStderr = new MethodSymbol("writeStderr");
        TextIOWriteStderr.setEnclosingScope(TextIO.getScope());
        TextIOWriteStderr.setType(typeVoid);

        MethodSymbol TextIOGetString = new MethodSymbol("getString");
        TextIOGetString.setEnclosingScope(TextIO.getScope());
        //TODO type string

        MethodSymbol TextIOGetInt = new MethodSymbol("getInt");
        TextIOGetInt.setEnclosingScope(TextIO.getScope());
        TextIOGetInt.setType(typeInt);

        MethodSymbol TextIOPutString = new MethodSymbol("putString");
        TextIOPutString.setEnclosingScope(TextIO.getScope());
        TextIOPutString.setType(typeVoid);
        ParameterSymbol TextIOPutStringS = new ParameterSymbol("s");
        //TODO type string

        MethodSymbol TextIOPutInt = new MethodSymbol("putInt");
        TextIOPutInt.setEnclosingScope(TextIO.getScope());
        TextIOPutInt.setType(typeVoid);
        ParameterSymbol TextIOPutIntI = new ParameterSymbol("i");
        TextIOPutIntI.setType(typeInt);
    }
}