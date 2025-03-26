package Exceptionhometasks;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double[] balanslar = {1200.50, 3500.75, 800.00, 1500.25, 200.00};

        // İstifadəçi daxilindən oxumaq üçün Scanner obyekti
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Hesab nömrəsini daxil edin (1-5): ");
            int hesabNomresi = input.nextInt();

            try {
                // Massivdən balansı oxuyuruq (indeks = nömrə-1)
                double balans = balanslar[hesabNomresi - 1];
                System.out.printf(hesabNomresi + " nömrəli hesabın balansı: "+ balans+" AZNdir");
            } catch (ArrayIndexOutOfBoundsException e) {
                // Əgər daxil edilən nömrə 1-5 aralığında deyilsə
                System.out.println("Yanlış hesab nömrəsi! Zəhmət olmasa yenidən cəhd edin.");
            }

        } catch (java.util.InputMismatchException e) {
            // Əgər rəqəm deyil, mətn və ya simvol daxil edilibsə
            System.out.println("Xəta: Zəhmət olmasa düzgün rəqəm daxil edin!");
        } finally {
            // Scanner obyektini bağlayırıq
            input.close();
        }


    }
}




