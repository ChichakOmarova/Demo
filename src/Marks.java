import java.util.Arrays;
import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[5];
        System.out.println("5 fənn üzrə qiymətləri daxil edin (0 ilə 100 arasında):");
        for (int i = 0; i < grades.length; i++) {
            while (true) {
                System.out.print((i + 1) + ". fənnin qiyməti: ");
                double grade = scanner.nextDouble();
                if (grade >= 0 && grade <= 100) {
                    grades[i] = grade;
                    break;
                } else {
                    System.out.println("Xəta: Qiymət 0 ilə 100 arasında olmalıdır!");
                }
            }
        }


        double average = calculateAverage(grades);
        double highest = findHighestGrade(grades);
        double lowest = findLowestGrade(grades);
        Arrays.sort(grades);
        System.out.println("\n--- Nəticələr ---");
        System.out.println("Daxil edilən qiymətlər: " + Arrays.toString(grades));
        System.out.println("Orta qiymət: " + average);
        System.out.println("Ən yüksək qiymət: " + highest);
        System.out.println("Ən aşağı qiymət: " + lowest);
        System.out.println("Qiymətlərin artan sırası: " + Arrays.toString(grades));

        scanner.close();
    }

    public static double calculateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
    //Arrays.stream(grades).min().getAsInt(); bu formada yazdım səhv oldu zəhmət olmasa o formada düzəliş edə bilərsiz?
    public static double findHighestGrade(double[] grades) {
        double highest = grades[0];
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static double findLowestGrade(double[] grades) {
        double lowest = grades[0];
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}