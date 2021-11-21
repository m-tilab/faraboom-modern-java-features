package chap01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterApples {

    public static void main(String[] args) {

        List<Apple> inventory = Arrays.asList(
                new Apple(80, "green"),
                new Apple(155, "green"),
                new Apple(120, "red")
        );
        // [Apple{weight=80, color='green'}, Apple{weight=155, color='green'}]
        List<Apple> greenApplesTrad = filterGreenApple(inventory);
        System.out.println(greenApplesTrad);

        // [Apple{weight=155, color='green'}]
        List<Apple> heavyApplesTrad = filterHeavyApple(inventory);
        System.out.println(heavyApplesTrad);

        // Modern
        // [Apple{weight=80, color='green'}, Apple{weight=155, color='green'}]
        List<Apple> greenApples = filterApple(inventory, FilterApples::isGreenApple);
        System.out.println(greenApples);

        // [Apple{weight=155, color='green'}]
        List<Apple> heavyApples = filterApple(inventory, FilterApples::isHeavyApple);
        System.out.println(heavyApples);

        // [Apple{weight=80, color='green'}, Apple{weight=155, color='green'}]
        List<Apple> greenApples2 = filterApple(inventory,  a -> "green".equals(a.getColor()));
        System.out.println(greenApples2);

        List<Apple> heavyApples2 = filterApple(inventory, (Apple a) -> a.getWeight() > 150);
        System.out.println(heavyApples2);

        // []
        List<Apple> weirdApples = filterApple(inventory, (Apple a) -> a.getWeight() < 80 || a.getColor().equals("brown"));
        System.out.println(weirdApples);

    }

    private static boolean isHeavyApple(Apple apple) {

        return apple.getWeight() > 150;
    }

    private static List<Apple> filterApple(List<Apple> inventory, Predicate<Apple> predicate) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {

            if (predicate.test(apple))
                result.add(apple);
        }

        return result;
    }

    public static boolean isGreenApple(Apple apple) {

        return apple.getColor().equals("green");
    }

    private static List<Apple> filterGreenApple(List<Apple> inventory) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple :
                inventory) {

            if (apple.getColor().equals("green"))
                result.add(apple);
        }

        return result;
    }

    private static List<Apple> filterHeavyApple(List<Apple> inventory) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple :
                inventory) {

            if (apple.getWeight() > 150)
                result.add(apple);
        }

        return result;
    }


    public static class Apple {

        private int weight = 0;
        private String color;

        public Apple(int wight, String color) {
            this.color = color;
            this.weight = wight;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "weight=" + weight +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}


