package Exception;

import java.lang.Exception;
import java.util.Scanner;

public class Exception2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      try {


          System.out.println("Enter Age:");
          int age = sc.nextInt();
      }
      catch (Exception e)
          {
          System.out.println("Invalid Age entered");
          }
    }



}
