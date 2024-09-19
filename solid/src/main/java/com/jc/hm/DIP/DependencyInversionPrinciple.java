package com.jc.hm.DIP;

/**
 * Dependency Inversion Principle (DIP) – Nguyên lý đảo ngược phụ thuộc
 * <p>
 * 1. Các module cấp cao không nên phụ thuộc vào các modules cấp thấp. Cả 2 nên phụ thuộc vào abstraction.
 * 2. Interface (abstraction) không nên phụ thuộc vào chi tiết, mà ngược lại. ( Các class giao tiếp với nhau thông qua interface, không phải thông qua implementation.)
 * <p>
 * 1. High-level modules should not depend on low-level modules. Both should depend on abstractions.
 * 2. Abstractions should not depend upon details. Details should depend upon abstractions.
 */
public class DependencyInversionPrinciple {
    public static void main(String[] args) {
        System.out.println("Dependency Inversion Principle!");
    }

    /**
     * Với cách code thông thường, các module cấp cao sẽ gọi các module cấp thấp. Module cấp cao sẽ phụ thuộc và module cấp thấp, điều đó tạo ra các dependency.
     * Khi module cấp thấp thay đổi, module cấp cao phải thay đổi theo. Một thay đổi sẽ kéo theo hàng loạt thay đổi, giảm khả năng bảo trì của code.
     *
     * Nếu tuân theo Dependendy Inversion principle, các module sẽ cùng phụ thuộc vào một interface không đổi.
     * Nghĩa là thay vì để các module cấp cao sử dụng các interface do các module cấp thấp định nghĩa và thực thi,
     * thì nguyên lý này chỉ ra rằng các lớp module cấp cao sẽ định nghĩa ra các interface,
     * sau đó các lớp module cấp sẽ thực thi các interface đó. Khi đó, ta có thể dễ dàng thay thế,
     * sửa đổi module cấp thấp mà không ảnh hưởng gì tới module cấp cao.
     */
}
