package com.jc.hm;

/**
 * Static keyword in Java:
 * <p>
 * The static keyword in Java is mainly used for memory management.
 * The static keyword in Java is used to share the same variable or method of a given class.
 * The users can apply static keywords with variables, methods, blocks, and nested classes.
 * The static keyword belongs to the class than an instance of the class.
 * The static keyword is used for a constant variable or a method that is the same for every instance of a class.
 * <p>
 * The static keyword is a non-access modifier in Java that is applicable for the following:
 * 1. Blocks
 * 2. Variables
 * 3. Methods
 * 4. Classes
 * <p>
 * Characteristics of static keyword:
 * 1. Shared memory allocation
 * 2. Accessible without object instantiation
 * 3. Associated with class, not objects
 * 4. Cannot access non-static members
 * 5. Can be overloaded, but not overridden
 */
public class StaticKeyword {
    //Static blocks
    public static class StaticBlocks {
        // static variable
        static int a = 10;
        static int b;

        // static block
        static {
            System.out.println("Static block initialized.");
            b = a * 2;
        }

        public static void main(String[] args) {
            System.out.println("from main");
            System.out.println("Value of a : " + a);
            System.out.println("Value of b : " + b);
            //Static block initialized.
            //from main
            //Value of a : 10
            //Value of b : 20
        }
    }

    //Static variables
    public static class StaticVariables {
        // static variable
        static int a = m1();

        // static block
        static {
            System.out.println("Inside static block");
        }

        // static method
        static int m1() {
            System.out.println("from m1");
            return 20;
        }

        public static void main(String[] args) {
            System.out.println("Value of a : " + a);
            System.out.println("from main");
            //from m1
            //Inside static block
            //Value of a : 20
            //from main
        }
    }

    //Static methods
    public static class StaticMethods {
        // static variable
        static int a = 10;

        // instance variable
        int b = 20;

        // static method
        static void m1() {
            a = 20;
            System.out.println("from m1");

            // Cannot make a static reference to the non-static field b
            //b = 10; // compilation error

            // Cannot make a static reference to the
            // non-static method m2() from the type Test
            //m2();  // compilation error

            //  Cannot use super in a static context
            //System.out.println(super.a); // compiler error
        }

        // instance method
        void m2() {
            System.out.println("from m2");
        }

        public static void main(String[] args) {
            // main method
        }
        //D:\learning\hoihmyit\java-core\core\src\main\java\com\jc\hm\StaticKeyword.java:89:13
        //java: non-static variable b cannot be referenced from a static context
        //D:\learning\hoihmyit\java-core\core\src\main\java\com\jc\hm\StaticKeyword.java:93:13
        //java: non-static method m2() cannot be referenced from a static context
        //D:\learning\hoihmyit\java-core\core\src\main\java\com\jc\hm\StaticKeyword.java:96:32
        //java: non-static variable super cannot be referenced from a static context
        //D:\learning\hoihmyit\java-core\core\src\main\java\com\jc\hm\StaticKeyword.java:96:37
        //java: cannot find symbol
        //  symbol: variable a
    }

    //Static Classes
    public static class StaticClass {
        private static String str = "Static Classes!!!";

        // Static class
        static class NestedClass {

            // non-static method
            public void nonStaticMethod() {
                System.out.println(str);
            }
        }

        public static void main(String[] args) {
            //StaticClass.NestedClass object = new StaticClass.NestedClass();
            StaticClass.NestedClass object = new NestedClass();
            object.nonStaticMethod();
        }
        //Static Classes!!!
    }
}
