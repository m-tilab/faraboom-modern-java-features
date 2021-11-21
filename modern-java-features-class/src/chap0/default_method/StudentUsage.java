package chap0.default_method;

import java.util.Calendar;

public class StudentUsage {

    public static void main(String[] args) {

        Student student = new Student();

        Calendar cal = Calendar.getInstance();
        cal.set(1987, 7, 29);

        student.setBirthday(cal.getTime());

        System.out.println(student.age());
    }
}
