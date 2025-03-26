package Exceptionhometasks;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yas = 0;
        boolean etibarlidir = false;

        while (!etibarlidir) {
            try {
                System.out.print("Yaşınızı daxil edin: ");
                String istifadeciDaxili = scanner.nextLine();

                // Girişi tam ədədə çevirməyə çalışırıq
                yas = Integer.parseInt(istifadeciDaxili);

                // Əgər çevrilmə uğurlu oldusa, yaşın etibarlı olub olmadığını yoxlayırıq
                if (yas > 0 && yas < 120) {
                    etibarlidir = true;
                } else {
                    System.out.println("Xəta: Düzgün yaş daxil edin (1-119 arası).");
                }

            } catch (NumberFormatException e) {
                System.out.println("Xəta: Yanlış yaş formatı. Zəhmət olmasa yaşınızı rəqəmlə daxil edin.");
            }
        }

        System.out.println("Təşəkkürlər! Yaşınız: " + yas);
        scanner.close();
    }
}
