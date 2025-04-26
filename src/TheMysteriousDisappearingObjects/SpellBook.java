package TheMysteriousDisappearingObjects;

public class SpellBook extends MagicItem {
    public SpellBook(String name) {
        super(name);
    }

    @Override
    public void useMagic() {
        System.out.println(this.getClass().getSimpleName() + " " + name + " reveals ancient secrets!");
    }
}
