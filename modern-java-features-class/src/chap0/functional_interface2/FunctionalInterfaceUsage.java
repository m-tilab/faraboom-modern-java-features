package chap0.functional_interface2;

import chap0.default_method.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionalInterfaceUsage {

    public static void main(String[] args) {


        Consumer<Integer> consumer = (value) -> System.out.println(value + 1);

        List l = new ArrayList();

        Predicate checkForNull = value -> value != null;

        System.out.println(checkForNull.test(l));

        UnaryOperator<Integer> increment = integer -> integer + 1;

        UnaryOperator<Student> appendFistName = person -> {

            person.setFirstname("MR " + person.getFirstname());
            return person;
        };

        BinaryOperator<Integer> sum = (a, b) -> a + b;

        DoubleSupplier randomNumber = () -> Math.random();

        System.out.println(randomNumber.getAsDouble());





    }
}
