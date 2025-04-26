package TheMysteriousDisappearingObjects;

public class MagicWand extends MagicItem {
    public MagicWand(String name) {
        super(name);
    }

    @Override
    public void useMagic() {
        System.out.println(this.getClass().getSimpleName() + " " + name + " casts a spell!");
    }
}