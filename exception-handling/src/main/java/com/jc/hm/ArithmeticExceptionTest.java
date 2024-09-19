package com.jc.hm;

/**
 * Nếu chúng ta chia bất kỳ số nào cho số 0, xảy ra ngoại lệ ArithmeticException.
 */
public class ArithmeticExceptionTest {
    public static void main(String[] args) {
        try {
            int zero = 0;
            int average = 10 / zero;
            System.out.println("Average = " + average);
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        }

        System.out.println("Finished!");
    }

    //java.lang.ArithmeticException: / by zero
    //Finished!
}
