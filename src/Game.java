import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int health = 100;
        boolean hasKey = false;
        int safeCode = 768;
        int attempts = 3;
        System.out.println("Welcome to The Quest for the Golden Key!");
        System.out.println("Find the Golden Key to escape the mysterious castle!");
        System.out.println("You start with " + health + " health points.");
        System.out.println("You stand before two paths: a door and a dark corridor. Choose wisely!");
        System.out.println("1. Open the door");
        System.out.println("2. Enter the dark corridor");
        int firstChoice = scanner.nextInt();
        if (firstChoice == 1) {
            System.out.println("You encounter a guard! Choose a weapon:");
            System.out.println("1. Sword");
            System.out.println("2. Bow");
            System.out.println("3. Nothing");
            int weaponChoice = scanner.nextInt();

            switch (weaponChoice) {
                case 1:
                    System.out.println("You defeat the guard with the sword!");
                    break;
                case 2:
                    System.out.println("You shoot the guard with the bow!");
                    break;
                case 3:
                    System.out.println("You chose nothing and lose 20 health points!");
                    health -= 20;
                    break;
                default:
                    System.out.println("Invalid choice. You lose 20 health points!");
                    health -= 20;
                    break;
            }
        } else if (firstChoice == 2) {
            // Dark Corridor Path
            System.out.println("You are bitten by spiders and lose 10 health points!");
            health -= 10;
        } else {
            System.out.println("Invalid choice. You lose 10 health points!");
            health -= 10;
        }


        System.out.println("You find a safe with a three-digit code. You have " + attempts + " attempts to open it.");
        while (attempts > 0 && !hasKey) {
            System.out.print("Enter the code: ");
            int guess = scanner.nextInt();
            if (guess == safeCode) {
                System.out.println("The safe opens! You find the Golden Key!");
                hasKey = true;
            } else {
                attempts--;
                System.out.println("Incorrect code. You have " + attempts + " attempts left.");
            }
        }


        System.out.println(hasKey ? "Congratulations! You escape with the Golden Key!" : "You are trapped forever!");

        scanner.close();
    }
}