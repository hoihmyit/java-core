package com.jc.hm.ISP;

/**
 * Interface Segregation Principle (ISP) – Nguyên lý phân tách
 * <p>
 * Thay vì dùng 1 interface lớn, ta nên tách thành nhiều interface nhỏ, với nhiều mục đích cụ thể.
 * <p>
 * Many client-specific interfaces are better than one general-purpose interface.
 */
public class InterfaceSegregationPrinciple {
    public static void main(String[] args) {
        System.out.println("Interface Segregation Principle!");
    }

    /**
     * Nguyên lý này khá dễ hiểu. Hãy tưởng tượng chúng ta có 1 interface lớn, khoảng 100 methods.
     * Việc implements sẽ khá cực khổ, ngoài ra còn có thể dư thừa vì 1 class không cần dùng hết 100 method.
     * Khi tách interface ra thành nhiều interface nhỏ, gồm các method liên quan tới nhau, việc implement và quản lý sẽ dễ hơn.
     */
}
