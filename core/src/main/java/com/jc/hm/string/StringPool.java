package com.jc.hm.string;

public class StringPool {

    public static void main(String[] args) {

        /**
         * String pool là một vùng nhớ đặc biệt nằm trong vùng nhớ Heap (Heap memory),
         * dùng để lưu trữ các biến được khai báo theo kiểu String.
         * String pool giúp tối ưu hoá việc lưu trữ và sử dụng vùng nhớ khi khai báo biến String,
         * giúp hạn chế tình trạng tràn bộ nhớ Java Heap Space.
         *
         * String là một immutable class. Vậy immutable class là gì ?
         * Immutable class là là một lớp bất biến, các thuộc tính của nó không bao giờ bị thay đổi
         * và chỉ có thể thiết lập lúc khởi tạo.
         * Có 2 cách để khai báo biến kiểu String:
         */

        // Cách 1
        String way1 = "abcde";

        String str3 = "abcde";

        // Cách 2
        String way2 = new String("abcde");

        boolean b1 = way1 == way2; // false
        System.out.println(b1);

        boolean b2 = way1 == str3; //true
        System.out.println(b2);

        /**
         * Khi khai báo bằng cách 1: Java sẽ truy cập vào String Pool, rồi tìm ở trong Pool ô nhớ nào có cùng giá trị với nó,
         * nếu tìm thấy thì sẽ tham chiếu đến địa chỉ của ô nhớ đó, còn không thì nó sẽ tạo ô nhớ mới ở trong Pool rồi sẽ thực hiện việc tham chiếu.
         *
         * Vì way1 và str3 cùng tham chiếu đến cùng một địa chỉ ô nhớ vùng nhớ heap nến way1 == str3
         */

        /**
         * Khi khai báo biến cách 2: Java sẽ không tạo ô nhớ mới ở bộ nhớ String Pool mà sẽ tạo ở Java Heap Space. Và khi đó nó sẽ luôn luôn tạo ô nhớ mới cho dù đã có sẵn những ô nhớ khác có cùng giá trị.
         *
         * vì way1 và way2 ko tham chiếu đến cùng địa chỉ ô nhớ ở vùng nhớ heap nên way1 != way2
         */

        /**
         * Có 2 cách so sánh String: dùng toán tử == và phương thức equals().
         *
         * Toán tử == thì so sánh sự tham chiếu của đối tương, sự giống nhau về vùng nhớ.
         * Vì thế, nếu 2 đối tượng string a và b cùng tham chiếu đến một literal trong string pool,
         * hoặc cùng tham chiếu đến một object trong vùng nhớ heap thì a == b sẽ trả về true. Ngược lại, sẽ trả về false
         *
         * Phương thức equals() được override trong lớp String. Nó kiểm tra giá trị của chuỗi kí tự lưu trữ trong string object.
         * Vì thế, nếu a và b cùng chứa chuỗi kí tự như nhau thì a.equals(b) luôn trả về true, bất kể chúng có tham chiếu tới đâu đi nữa.
         */
    }
}
