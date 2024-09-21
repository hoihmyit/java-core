package com.jc.hm.operator;

/**
 * Ternary operators: Toán tử bậc ba (also known as the conditional operator)
 */
public class TernaryOperatorsExample {
    public static void main(String[] args) {
        boolean isAuthenticated = true;

        if (isAuthenticated) {
            System.out.println("User is authenticated");
        } else {
            System.out.println("User is not authenticated");
        }

        String result = isAuthenticated ? "Authenticated" : "Not authenticated";
        System.out.println(result);
        //User is authenticated
        //Authenticated
    }
}
