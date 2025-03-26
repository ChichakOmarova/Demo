package Exceptionhometasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task5 {
    public static void main(String[] args) {
        // Faylın yolu (nümunə)
        String faylYolu = "hesab_melumatlari.txt";
        BufferedReader oxuyucu = null;

        try {
            oxuyucu = new BufferedReader(new FileReader(faylYolu));
            System.out.println("Hesab məlumatları:");

            String setir;
            while ((setir = oxuyucu.readLine()) != null) {
                System.out.println(setir);
            }

        } catch (IOException e) {
            System.out.println("Xəta: Hesab məlumatları faylı tapılmadı!");
        } finally {
            try {
                if (oxuyucu != null) {
                    oxuyucu.close();
                }
            } catch (IOException e) {
                System.out.println("Fayl bağlanarkən xəta baş verdi.");
            }
            System.out.println("Proqram davam edir...");
        }
    }
}