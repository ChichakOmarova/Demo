package Exception;



public class Exception3 {
    public static void main(String[] args) {
        try {
            int[] num =null;
            System.out.println(num[7]);


        } catch (NullPointerException | IndexOutOfBoundsException e )
            {
                System.out.println("Error: Array index out of bounds.");
            }
    }
}
