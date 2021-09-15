package OOPS;

// all final variables, especially static final variables are 
// named in all caps, since this is the widely used naming convention

class Final{
    final int INSTVAR;

    // initializer block. This block can also have conditions
    // final keyword can never be empty
    { INSTVAR = 80085; }
}

public class FinalKeyword {

    // this is a class variable, also called as a static variable
    // is can be accessed anywhere in this class and it's subclasses
    // as well without the need of creating an object
    static final int CLASSVAR;
    // static initializer block

    static { CLASSVAR = 69; }

    public static void main(String[] args) {

        // this is a local variable, it is created inside a method
        // and hence can be accessed only inside it
        final int LOCVAR;
        LOCVAR = 420;

        System.out.println("Final Local Variable is : " + LOCVAR);

        Final obj = new Final();
        System.out.println("Final Instance Variable is : " + obj.INSTVAR);

        System.out.println("Static/Class Variable is : " + CLASSVAR);

        // here we see that "dem" gets appended to the string sb
        // this happens because the sb is a Reference Variable
        // and final reference means that it cannot be bounded to a 
        // new reference, but the object it is referring to can be modified
        // here the object being "Man" hence no error occurs
        final StringBuffer sb = new StringBuffer("Man");
        sb.append("dem");
        System.out.println("The final String after appending is : " + sb);
    }
}
