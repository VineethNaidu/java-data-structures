package org.example.java.encapsulation;

public class Encapsulation {

    //Instance variables
    public String publicVariable = "Public";
    private String privateVariable = "Private";
    protected String protectedVariable = "Protected";
    String defaultVariable = "PackagePrivate";

    public String getPrivateVariable() {
        return privateVariable;
    }

}

/*
Two Level of access control
1. Top Level (Class Level) -> public or package-private(default)
2. Member Level (Variable or Methods) -> public, private, protected or package-private(default)
3. Constants -> public static final int PI = 3.14;

Class Encapsulation:
1. Base/SuperClass Class always be public
2. Apart from Base Class multiple classes in same file.java won't be public. it is default
3. If a class has no modifier (the default, also known as package-private),
   it is visible only within its own package.

Member Encapsulation:
1. public, private, protected or default(no access modifier)

Modifier	Class  Package  Subclass                                      World
public	      Y	      Y	       Y	                                        Y
protected	  Y       Y	       Y(subclass of same/different package)	    N
no modifier	  Y	      Y	       N(subclass of same package)	                N
private	      Y	      N	       N	                                        N

When to use?
🔥 Best Practices
✔ Use private for instance variables → Ensures encapsulation.
✔ Use protected only if subclass needs access → Keeps API clean.
✔ Use public cautiously → Exposes code globally.
✔ Avoid default (package-private) unless working within a package.

 */