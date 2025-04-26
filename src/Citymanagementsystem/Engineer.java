package Citymanagementsystem;

public class Engineer extends Person {
    public Engineer(String name, int age) {
        super(name, age, "Engineer");
    }

    @Override
    public void introduce() {
        System.out.println("🛠️🧱 I am " + name + " the Engineer.");
    }

    @Override
    public void doWork() {
        System.out.println("🛠️🧱 " + name + " is designing a building.");
    }
}