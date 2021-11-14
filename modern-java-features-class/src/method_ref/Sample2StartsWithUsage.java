package method_ref;

import java.util.function.Function;

public class Sample2StartsWithUsage {

    public static void main(String[] args) {

        String name = "IRAN";

        System.out.println(startsWith(name));
        System.out.println(startsWithJava8CustomFunctionalInterface(name));
        System.out.println(startsWithJava8FunctionInterface(name));
        System.out.println(startsWithJava8Lambda(name));
        System.out.println(startsWithJava8MethodRef(name));
    }

    private static Character startsWith(String name) {

        return Sample2StringTools.startsWith(name);
    }

    private static Character startsWithJava8CustomFunctionalInterface(String name) {

        StartsWithFunctionalInterface<Integer, Character> StringCharAtFunction = name::charAt;

        return StringCharAtFunction.startsWith(0);
    }

    private static Character startsWithJava8FunctionInterface(String name) {

        Function<Integer, Character> StringCharAtFunction = name::charAt;

        return StringCharAtFunction.apply(0);
    }

    private static Character startsWithJava8Lambda(String name) {

        Function<Integer, Character> StringCharAtFunction = integer -> name.charAt(integer);

        return StringCharAtFunction.apply(0);
    }

    private static Character startsWithJava8MethodRef(String name) {

        Function<String, Character> StringCharAtFunction = Sample2StringTools::startsWith;

        return StringCharAtFunction.apply(name);
    }
}
