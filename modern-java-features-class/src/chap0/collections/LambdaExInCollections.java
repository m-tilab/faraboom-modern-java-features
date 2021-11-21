package chap0.collections;

import java.util.ArrayList;
import java.util.List;

public class LambdaExInCollections {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        List<Integer> increasedIntegers = increaseListNumbers(integers);

        System.out.println(increasedIntegers);

        increaseListNumbersjava8Lambda(integers);

    }

    private static List<Integer> increaseListNumbers(List<Integer> integers) {
        List<Integer> increasedIntegers = new ArrayList<>();

        for (int i :
                integers) {

            increasedIntegers.add(increment(i));
        }
        return increasedIntegers;
    }

    private static void increaseListNumbersjava8Lambda(List<Integer> integers) {


        integers.forEach(integer -> System.out.println(increment(integer)));
    }

    private static Integer increment(Integer i) {

        return i + 1;
    }
}
