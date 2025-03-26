public class Newbugs {
    public static void main(String[] args) {
        int number = 7;

        // Fix: Use == for comparison instead of =
        if (number == 5) {
            System.out.println("Number is 5");
        } else if (number > 5 && number < 10) {
            System.out.println("Number is between 5 and 10");
        } else {
            System.out.println("Number is something else");
        }

        int day = 3;

        // Fix: Add 'break' statements to prevent fall-through in switch cases
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            default:
                System.out.println("Invalid day");
        }

        int count = 5;

        // Fix: Change 'count++' to 'count--' to avoid infinite loop
        while (count > 0) {
            System.out.println("Count: " + count);
            count--;
        }

        // Fix: Correct array size to avoid ArrayIndexOutOfBoundsException
        int[] numbers = new int[4]; // Changed size to 4
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;

        int x = 10;
        int y = 20;

        // Fix: Use Math.min() to find the minimum value
        int min = Math.min(x, y);
        System.out.println("Minimum value: " + min);
    }
}