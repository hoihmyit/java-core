package com.jc.hm.OCP;

/**
 * Open-Closed Principle (OCP) – Nguyên lý đóng mở
 * <p>
 * Có thể thoải mái mở rộng 1 class, nhưng không được sửa đổi bên trong class đó.
 * <p>
 * Objects or entities should be open for extension, but closed for modification.
 */
public class OpenClosedPrinciple {
    public static void main(String[] args) {
        System.out.println("Open-Closed Principle!");
    }

    /**
     * nếu các thao tác validation để cùng với logic thì chúng ta có thể gặp vấn đề sau:
     * - Thêm một validation mới chúng ta phải trực tiếp sửa code bằng if-else condition.
     * - Sửa code nếu validation bị thay đổi logic.
     * - Testing khó khăn, chúng ta phải test cả phần thực hiện logic và validation.
     *
     * Bây giờ, nếu chúng ta chuyển các thao tác validation sang các lớp khác để xử lý. Cách giải quyết này được gọi là Dependence Injection.
     * Nếu chúng ta muốn thay đổi cách validate khác cho user, chỉ cần thay đổi class validator truyền vào.
     *
     * Thực hiện theo cách này chúng ta đã hoàn thành nguyên tắc Single responsibility principle (chúng ta đã chuyển trách nhiệm bổ sung sang một class khác).
     * Bây giờ, chúng ta không phải sửa đổi class gốc nếu chúng ta muốn thêm một class khác để validate dữ liệu.
     * Chúng ta chỉ cần tạo một class thích hợp mới và gọi nó là tham số trong trường hợp phù hợp.
     *
     * Nguyên lý Open-Closed cũng có thể đạt được bằng nhiều cách khác, bao gồm cả việc sử dụng thừa kế (inheritance)
     * hoặc thông qua các mẫu thiết kế tổng hợp (compositional design patterns) như Strategy pattern.
     */
}
