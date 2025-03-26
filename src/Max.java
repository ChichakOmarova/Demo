import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] numbers = {120, 50, 80, 200, 30};

        // AI dan kömək aldım
        Arrays.stream(numbers).min().ifPresent(min -> System.out.println("Minimum: " + min));
        Arrays.stream(numbers).max().ifPresent(max -> System.out.println("Maksimum: " + max));
    }
}