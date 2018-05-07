import org.antlr.symtab.*;


public class BantamJavaPrimitiveScope extends org.antlr.symtab.PredefinedScope {
    /*
        This scope defines the built-in classes [see pp. 54ff of the Lab Manual]
     */
    public BantamJavaPrimitiveScope(){

        // Create Type Objects
        PrimitiveType typeInt = new PrimitiveType("int");
        PrimitiveType typeBoolean = new PrimitiveType("boolean");
        PrimitiveType typeVoid = new PrimitiveType("void");
        this.define(typeInt);
        this.define(typeBoolean);
        this.define(typeVoid);


        // Create Class Objects
        ClassSymbol objectClassSymbol = new ClassSymbol("Object");
        this.define(objectClassSymbol);

        ClassSymbol sysClassSymbol = new ClassSymbol("Sys");
        sysClassSymbol.setSuperClass("Object");
        this.define(sysClassSymbol);

        ClassSymbol stringClassSymbol = new ClassSymbol("String");
        stringClassSymbol.setSuperClass("Object");
        this.define(stringClassSymbol);

        ClassSymbol textIOClassSymbol = new ClassSymbol("TextIO");
        textIOClassSymbol.setSuperClass("Object");
        this.define(textIOClassSymbol);


        // Object Methods: clone(), equals(s), toString()
        MethodSymbol objectCloneMethodSymbol = new MethodSymbol("clone");
        objectCloneMethodSymbol.setType(objectClassSymbol);
        objectClassSymbol.define(objectCloneMethodSymbol);

        MethodSymbol objectEqualsMethodSymbol = new MethodSymbol("equals");
        objectEqualsMethodSymbol.setType(typeBoolean);
        {
            ParameterSymbol s = new ParameterSymbol("s");
            s.setType(objectClassSymbol);
            objectEqualsMethodSymbol.define(s);
        }
        objectClassSymbol.define(objectEqualsMethodSymbol);

        MethodSymbol objectToStringMethodSymbol = new MethodSymbol("toString");
        objectToStringMethodSymbol.setType(stringClassSymbol);
        objectClassSymbol.define(objectToStringMethodSymbol);


        //Sys Methods: exit(status), time(), and random()
        MethodSymbol sysExitMethodSymbol = new MethodSymbol("exit");
        sysExitMethodSymbol.setType(typeVoid);
        {
            ParameterSymbol status = new ParameterSymbol("status");
            status.setType(typeInt);
            sysExitMethodSymbol.define(status);
        }
        sysClassSymbol.define(sysExitMethodSymbol);

        MethodSymbol sysTimeMethodSymbol = new MethodSymbol("time");
        sysTimeMethodSymbol.setType(typeInt);
        sysClassSymbol.define(sysTimeMethodSymbol);

        MethodSymbol sysRandomMethodSymbol = new MethodSymbol("random");
        sysRandomMethodSymbol.setType(typeInt);
        sysClassSymbol.define(sysRandomMethodSymbol);


        //String Methods: length(), equals(s), toString(),
        //                substring(beginIndex, endIndex), concat(s)
        MethodSymbol stringLengthMethodSymbol = new MethodSymbol("length");
        stringLengthMethodSymbol.setType(typeInt);
        stringClassSymbol.define(stringLengthMethodSymbol);

        MethodSymbol stringEqualsMethodSymbol = new MethodSymbol("equals");
        stringEqualsMethodSymbol.setType(typeBoolean);
        {
            ParameterSymbol s = new ParameterSymbol("s");
            s.setType(objectClassSymbol);
            stringEqualsMethodSymbol.define(s);
        }
        stringClassSymbol.define(stringEqualsMethodSymbol);

        MethodSymbol stringToStringMethodSymbol = new MethodSymbol("toString");
        stringToStringMethodSymbol.setType(stringClassSymbol);
        stringClassSymbol.define(stringToStringMethodSymbol);

        MethodSymbol stringSubstringMethodSymbol = new MethodSymbol("substring");
        stringSubstringMethodSymbol.setType(stringClassSymbol);
        {
            ParameterSymbol beginIndex = new ParameterSymbol("beginIndex");
            beginIndex.setType(typeInt);
            stringSubstringMethodSymbol.define(beginIndex);
            ParameterSymbol endIndex = new ParameterSymbol("endIndex");
            endIndex.setType(typeInt);
            stringSubstringMethodSymbol.define(endIndex);
        }
        stringClassSymbol.define(stringSubstringMethodSymbol);

        MethodSymbol stringConcatMethodSymbol = new MethodSymbol("concat");
        stringConcatMethodSymbol.setType(stringClassSymbol);
        {
            ParameterSymbol s = new ParameterSymbol("s");
            s.setType(stringClassSymbol);
            stringConcatMethodSymbol.define(s);
        }
        stringClassSymbol.define(stringConcatMethodSymbol);


        //TextIO methods: readFile(filename), writeFile(filename), getString(),
        //                readStdin(), writeStdout(), writeStderr(),
        //                getString(), getInt(), putString(s), putInt(i)
        MethodSymbol textIOReadFileMethodSymbol = new MethodSymbol("readFile");
        textIOReadFileMethodSymbol.setType(typeVoid);
        {
            ParameterSymbol filename = new ParameterSymbol("filename");
            filename.setType(stringClassSymbol);
            textIOReadFileMethodSymbol.define(filename);
        }
        textIOClassSymbol.define(textIOReadFileMethodSymbol);

        MethodSymbol textIOWriteFileMethodSymbol = new MethodSymbol("writeFile");
        textIOWriteFileMethodSymbol.setType(textIOClassSymbol);
        {
            ParameterSymbol filename = new ParameterSymbol("filename");
            filename.setType(stringClassSymbol);
            textIOWriteFileMethodSymbol.define(filename);
        }
        textIOClassSymbol.define(textIOWriteFileMethodSymbol);

        MethodSymbol textIOReadStdinMethodSymbol = new MethodSymbol("readStdin");
        textIOReadStdinMethodSymbol.setType(textIOClassSymbol);
        textIOClassSymbol.define(textIOReadStdinMethodSymbol);

        MethodSymbol textIOWriteStdoutMethodSymbol = new MethodSymbol("writeStdout");
        textIOWriteStdoutMethodSymbol.setType(textIOClassSymbol);
        textIOClassSymbol.define(textIOWriteStdoutMethodSymbol);

        MethodSymbol textIOWriteStderrMethodSymbol = new MethodSymbol("writeStderr");
        textIOWriteStderrMethodSymbol.setType(textIOClassSymbol);
        textIOClassSymbol.define(textIOWriteStderrMethodSymbol);

        MethodSymbol textIOGetStringMethodSymbol = new MethodSymbol("getString");
        textIOGetStringMethodSymbol.setType(stringClassSymbol);
        textIOClassSymbol.define(textIOGetStringMethodSymbol);

        MethodSymbol textIOGetIntMethodSymbol = new MethodSymbol("getInt");
        textIOGetIntMethodSymbol.setType(typeInt);
        textIOClassSymbol.define(textIOGetIntMethodSymbol);

        MethodSymbol textIOPutStringMethodSymbol = new MethodSymbol("putString");
        textIOPutStringMethodSymbol.setType(textIOClassSymbol);
        {
            ParameterSymbol s = new ParameterSymbol("s");
            s.setType(stringClassSymbol);
            textIOPutStringMethodSymbol.define(s);
        }
        textIOClassSymbol.define(textIOPutStringMethodSymbol);

        MethodSymbol textIOPutIntMethodSymbol = new MethodSymbol("putInt");
        textIOPutIntMethodSymbol.setType(textIOClassSymbol);
        {
            ParameterSymbol i = new ParameterSymbol("i");
            i.setType(typeInt);
            textIOPutIntMethodSymbol.define(i);
        }
        textIOClassSymbol.define(textIOPutIntMethodSymbol);
    }
}