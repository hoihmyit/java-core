package com.jc.hm.LSP;

/**
 * Liskov Substitution Principle (LSP) – Nguyên lý thay thế
 * <p>
 * Trong một chương trình, các object của class con có thể thay thế class cha mà không làm thay đổi tính đúng đắn của chương trình.
 * <p>
 * Objects in a program should be replaceable with instances of their subtypes without altering the correctness of that program.
 */
public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        System.out.println("Liskov Substitution Principle!");
    }

    /**
     * Một số dấu hiệu điển hình có thể chỉ ra rằng LSP đã bị vi phạm:
     *
     * - Các lớp dẫn xuất có các phương thức ghi đè phương thức của lớp cha nhưng với chức năng hoàn toàn khác.
     * - Các lớp dẫn xuất có phương thức ghi đè phương thức của lớp cha là một phương thức rỗng.
     * - Các phương thức bắt buộc kế thừa từ lớp cha ở lớp dẫn xuất nhưng không được sử dụng.
     * - Phát sinh ngoại lệ trong phương thức của lớp dẫn xuất.
     *
     *  Đây là nguyên lý… dễ bị vi phạm nhất, nguyên nhân chủ yếu là do sự thiếu kinh nghiệm khi thiết kế class.
     *  Thuông thường, design các class dựa theo đời thật: hình vuông là hình chữ nhật, file nào cũng là file.
     *  Tuy nhiên, không thể bê nguyên văn mối quan hệ này vào code. Hãy nhớ 1 điều:
     *
     * - Trong thực tế, A là B (hình vuông là hình chữ nhật) không có nghĩa là class A nên kế thừa class B. Chỉ cho class A kế thừa class B khi class A thay thế được cho class B.
     * - File hệ thống cũng là file nhưng không thay thế được cho file, do đó ví dụ này vi phạm LSP.
     *
     * Nguyên lý này ẩn giấu trong hầu hết mọi đoạn code, giúp cho code linh hoạt và ổn định mà ta không hề hay biết.
     * Ví dụ như trong Java, ta có thể chạy hàm foreach với List, ArrayList, LinkedList bởi vì chúng cùng kế thừa interface Iterable.
     * Các class List, ArrayList, … đã được thiết kế đúng LSP, chúng có thể thay thế cho Iterable mà không làm hỏng tính đúng đắn của chương trình.
     */
}
