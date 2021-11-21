package chap0.funcional_interface;

public class SumUsage {

    public static void main(String[] args) {

        SumFunctionalInterface sumFunctionalInterface = (a, b) -> a + b;
        // lambda expression without args
        //() -> a + b;

        // Lambda with one args
        // a -> a + b;

        // a -> {
        //  return a + b;
        // }

        System.out.println(sumFunctionalInterface.sum(10, 20));
    }
}
