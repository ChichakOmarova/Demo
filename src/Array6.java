import java.util.Arrays;
public class Array6 {
    public static void main(String[] args) {
        int[] list1 = {101, 102, 103};
        int[] list2 = Arrays.copyOf(list1, list1.length);
        System.out.println( Arrays.toString(list2));

    }
}
