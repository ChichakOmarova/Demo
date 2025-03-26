//
//
//import java.util.Scanner;
//
//public class Findbugs1 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String students = {"Alice", "Bob", "Charlie", "David"};
//
//        System.out.println("Enter student index (0-3): ");
//        int index = scanner.nextInt();
//
//        if (index > 0 && index < 3) {
//            System.out.println("Student: " + students[index]);
//        } else if (index = 3) {
//            System.out.println("Student: " + students[index]);
//        } else {
//            System.out.println("Invalid index!");
//        }
//
//        System.out.println("Enter grade (A, B, C, D, F): ");
//        char grade = scanner.next().charAt(0);
//
//        switch (grade) {
//            case 'A':
//                System.out.println("Excellent!");
//            case 'B':
//                System.out.println("Good job!");
//            case 'C':
//                System.out.println("Average.");
//                break;
//            case 'D':
//                System.out.println("Pass");
//                break;
//            default:
//                System.out.println("Fail");
//                break;
//        }
//
//        Object[][] studentScores = new Object[3][2];
//        studentScores[0] = {"Alice", 90};
//        studentScores[1] = {"Bob", "85"};
//        studentScores[2] = {"Charlie", 78};
//
//        for (int i = 0; i <= 3; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.println("Student: " + studentScores[i][0] + ", Score: " + studentScores[i][1]);
//            }
//        }
//
//        scanner.close();
//    }
//}
