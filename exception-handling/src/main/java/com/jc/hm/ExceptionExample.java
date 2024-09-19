package com.jc.hm;

public class ExceptionExample {
    public static void main(String[] args) {
        tryBlockNested();

        catchBlockNested();

        ExampleUsingFinallyBlock_Where_Exception_DoesNot_Occur();

        ExampleUsingFinallyBlock_Where_Exception_Occurs_But_Not_Handled();

        ExampleUsingFinallyBlock_Where_Exception_Occurs_And_Handled();

        ExampleUsing_System_exit_To_Not_ExecuteFinallyBlock();

        ExampleFinallyBlock_is_Still_Executed_Despite_Calling_Return();
    }

    private static void ExampleFinallyBlock_is_Still_Executed_Despite_Calling_Return() {
        System.out.println("getValueAtIndex5() = " + getValueAtIndex5());

        //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //The finally block is always executed
        //getValueAtIndex5() = 0
    }

    public static int getValueAtIndex5() {
        try {
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);
            return 1;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
            return 0; // Return the result but still execute the finally block
        } finally {
            System.out.println("The finally block is always executed");
        }
    }

    private static void ExampleUsing_System_exit_To_Not_ExecuteFinallyBlock() {
        try {
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
            System.exit(0); // The finally block won't be executed
        } finally {
            System.out.println("The finally block is always executed");
        }

        System.out.println("Finished!");

        //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    }

    private static void ExampleUsingFinallyBlock_Where_Exception_Occurs_And_Handled() {
        try {
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);
        } catch (NullPointerException ex) {
            System.out.println(ex);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("The finally block is always executed");
        }

        System.out.println("Finished!");

        //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //The finally block is always executed
        //Finished!
    }

    private static void ExampleUsingFinallyBlock_Where_Exception_Occurs_But_Not_Handled() {
        try {
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);
        } catch (NullPointerException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("The finally block is always executed");
        }

        System.out.println("Finished!");

        //The finally block is always executed
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //	at com.jc.hm.ExceptionExample.ExampleUsingFinallyBlock_Where_Exception_Occurs_But_Not_Handled(ExceptionExample.java:18)
        //	at com.jc.hm.ExceptionExample.main(ExceptionExample.java:12)
    }

    private static void ExampleUsingFinallyBlock_Where_Exception_DoesNot_Occur() {
        try {
            int res = 10 / 2;
            System.out.println("10/2 = " + res);
        } finally {
            System.out.println("The finally block is always executed");
        }

        System.out.println("Finished!");

        //10/2 = 5
        //The finally block is always executed
        //Finished!
    }

    private static void catchBlockNested() {
        try {
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);

            int zero = 0;
            int average = 10 / zero;
            System.out.println("Average = " + average);

            String obj = null;
            System.out.println(obj.length());
        } catch (NullPointerException ex) {
            System.out.println(ex);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }

        System.out.println("Finished!");

        //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //Finished!
    }

    private static void tryBlockNested() {
        try {
            try {
                int zero = 0;
                int average = 10 / zero;
                System.out.println("Average = " + average);
            } catch (ArithmeticException ex) {
                System.out.println(ex);
            }

            System.out.println("Continue...");
            int arr[] = new int[5];
            arr[5] = 4;
            System.out.println("arr[5] = " + arr[5]);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex);
        }

        System.out.println("Finished!");

        //java.lang.ArithmeticException: / by zero
        //Continue...
        //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //Finished!
    }
}
