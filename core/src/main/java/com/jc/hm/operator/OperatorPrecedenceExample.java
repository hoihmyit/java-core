package com.jc.hm.operator;

/**
 * Operator precedence: Ưu tiên toán tử
 * The order of precedence: Left to Right Associative (L to R) and Right to Left Associative (R to L)
 * 1. R to L: ++ -- + - ~ ! (<data_type>)
 * 2. L to R: * / %
 * 3. L to R: + -
 * 4. L to R: << >> >>>
 * 5. L to R: < > <= >= instanceof
 * 6. L to R: == !=
 * 7. L to R: &
 * 8. L to R: ^
 * 9. L to R: |
 * 10. L to R: &&
 * 11. L to R: ||
 * 12. R to L: ?:
 * 13. R to L: = *= /= %= += -= <<= >>= >>>= &= ^= |=
 */
public class OperatorPrecedenceExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int c = 30;
//        int result = a + b * c / 10;
//        System.out.println("Result: " + result);
        //Result: 70

        int num1 = 5;
        int num2 = 2;
        int res = num1 % num2;
        System.out.println(res);
        //1

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 && b2);
        //false
    }
}
