package TheMysteriousDisappearingObjects;

public class MagicItem {
    protected String name;

    public MagicItem(String name) {
        this.name = name;
    }

    public void useMagic() {
        System.out.println(name + " is used!");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + " is being garbage collected!");
        super.finalize();
    }
}