package Exceptionhometasks;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Faiz dərəcəsini daxil edin (%): ");
            String faizInput = scanner.nextLine();

            // String'i double-ə çevirməyə cəhd edirik
            double faizDerecesi = Double.parseDouble(faizInput);

            // Əgər çevrilmə uğurlu oldusa, hesablama aparırıq
            double mebleg = 1000.0; // Nümunə məbləğ
            double faizMeblegi = mebleg * (faizDerecesi / 100);

            System.out.printf("%.2f AZN məbləğ üzrə %.2f%% faiz: %.2f AZN%n",
                    mebleg, faizDerecesi, faizMeblegi);

        } catch (NumberFormatException e) {
            System.out.println("Yanlış faiz dərəcəsi formatı!");
        } finally {
            System.out.println("Faiz hesablaması tamamlandı.");
            scanner.close();
        }
    }
}