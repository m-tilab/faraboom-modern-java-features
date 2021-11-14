package lambda_exp;

import default_method.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sample1Comparator {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("mehdi"),
                new Student("hamed"),
                new Student("Ali"));

        System.out.println(sort(students));
        System.out.println(sortJava8Lambda(students));
        System.out.println(sortJava8MethodRef(students));


    }

    private static List<Student> sortJava8Lambda(List<Student> students) {

        Comparator<Student> studentComparator = (f1, f2) -> f1.getFirstname().compareTo(f2.getFirstname());

        Collections.sort(students, studentComparator);

        return students;

    }

    private static List<Student> sortJava8MethodRef(List<Student> students) {

        Collections.sort(students, Comparator.comparing(Student::getFirstname));

        return students;

    }



    private static List<Student> sort(List<Student> students) {

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getFirstname().compareTo(o2.getFirstname());
            }
        });

        return students;
    }
}
