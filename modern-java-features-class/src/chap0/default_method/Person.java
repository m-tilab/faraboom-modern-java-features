package chap0.default_method;

import java.util.Date;

public interface Person {

    Date getBirthday();

    default int age() {

        long diff = new Date().getTime() - getBirthday().getTime();

        return (int) (diff / (1000L * 60 * 60 * 24 * 365));
    }
}
