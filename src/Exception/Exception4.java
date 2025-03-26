package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers you want to enter:");
        try{
            int a = Integer.parseInt(String.valueOf(sc.nextInt()));
        }catch(InputMismatchException e){
            System.out.println("Invalid number format!");
        }finally {
            System.out.println("Execution completed!");
        }

    }
}
