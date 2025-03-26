package Inheritance;

public class Bmw extends Vehicle implements Runnable,AutoCloseable {

    private final String color = "red";

    public Bmw(String name) {
        super(name);
    }

    @Override
    public void carmethod2() {
        System.out.println("cars can't fly");
    }


    @Override
    public void myCarSpeed() {

    }

    @Override
    public String toString() {
        return "Bmw{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

