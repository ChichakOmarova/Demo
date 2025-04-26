package Maps;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UniqueLotteryNumbers {
    private HashSet<Integer> numbers;
    private Scanner scanner;

    public UniqueLotteryNumbers() {
        this.numbers = new HashSet<>();
        this.scanner = new Scanner(System.in);
    }

    public void getNumbersFromUser() {
        System.out.println("Zəhmət olmasa, 6 unikal ədəd daxil edin:");
        while (this.numbers.size() < 6) {
            System.out.print("Ədəd " + (this.numbers.size() + 1) + ": ");
            try {
                int number = scanner.nextInt();
                if (!this.numbers.add(number)) {
                    System.out.println("Dublikat! Yenidən daxil edin.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Yanlış giriş! Zəhmət olmasa, tam ədəd daxil edin.");
                scanner.next(); // Təmizlə
            }
        }

        System.out.println("Seçdiyiniz unikal ədədlər: " + this.numbers);
        scanner.close();
    }
}
