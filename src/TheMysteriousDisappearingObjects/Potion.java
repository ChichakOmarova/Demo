package TheMysteriousDisappearingObjects;

import java.util.Random;

public class Potion extends MagicItem {
    public Potion(String name) {
        super(name);
    }

    @Override
    public void useMagic() {
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println(this.getClass().getSimpleName() + " " + name + " bubbles and glows!");
        } else {
            throw new RuntimeException(this.getClass().getSimpleName() + " " + name + " explodes!");
        }
    }
}