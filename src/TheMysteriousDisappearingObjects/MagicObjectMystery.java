package TheMysteriousDisappearingObjects;

public class MagicObjectMystery {

    public static void main(String[] args) {
        // 1. Polymorphism
        MagicItem wand = new MagicWand("SparkleStick");
        MagicItem potion = new Potion("ElixirOfDoom");
        MagicItem book = new SpellBook("Grimoire");

        wand.useMagic();
        potion.useMagic();
        book.useMagic();

        try {
            potion.useMagic();
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (int i = 0; i < 500; i++) {
            new MagicWand("Wand" + i);
            new Potion("Potion" + i);
            new SpellBook("Book" + i);
        }

        System.out.println("Objects created, now eligible for garbage collection.");

        System.gc();

        System.out.println("Garbage collection requested.");

        try {
            Thread.sleep(2000); // 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Program finished.");

    }
}
