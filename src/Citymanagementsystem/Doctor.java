package Citymanagementsystem;

public class Doctor extends Person {
    public Doctor(String name, int age) {
        super(name, age, "Doctor");
    }

    @Override
    public void introduce() {
        System.out.println("💉🩺I am " + name + " the Doctor.");
    }

    @Override
    public void doWork() {
        System.out.println("💉🩺 " + name + " is treating patients");
    }
}