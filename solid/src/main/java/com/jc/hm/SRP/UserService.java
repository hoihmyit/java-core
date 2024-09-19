package com.jc.hm.SRP;

public class UserService {

    // Get data from database
    public User getUser() {
        return null;
    }

    // Check validation
    public boolean isValid() {
        return true;
    }

    // Show Notification
    public void showNotification() {

    }

    // Logging
    public void logging() {
        System.out.println("logging ^^");
    }

    // Parsing
    public User parseJson(String json) {
        return null;
    }

    /**
     * Như bạn thấy, class này thực hiện rất nhiều trách nhiệm khác nhau: lấy dữ liệu từ DB, validate, thông báo, ghi log, xử lý dữ liệu, ...
     * Khi chỉ cần ta thay đổi cách lấy dữ liệu DB, thay đổi cách validate, ... ta sẽ phải sửa đổi class này, càng về sau class sẽ càng phình to ra.
     * Rất khó khăn khi maintain, upgrade, fix bug, test, ...
     *
     * Theo đúng nguyên tắc này, ta phải tách class này ra làm nhiều class riêng, mỗi class chỉ làm một nhiệm vụ duy nhất.
     * Tuy số lượng class nhiều hơn những việc sửa chữa sẽ đơn giản hơn, dễ dàng tái sử dụng hơn, class ngắn hơn nên cũng ít bug hơn.
     *
     * Chẳng hạn, với chương trình trên chúng ta có thể tách thành các class: UserRepository, UserValidator, SystemLogger, JsonConverter, ...
     *
     * Một số ví dụ về SRP cần xem xét có thể cần được tách riêng bao gồm: Persistence, Validation, Notification, Error Handling, Logging, Class Instantiation, Formatting, Parsing, Mapping, ...
     */
}
