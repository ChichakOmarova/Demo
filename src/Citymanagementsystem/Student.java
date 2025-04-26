package Citymanagementsystem;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age, "Doctor");
    }

    @Override
    public void introduce() {
        System.out.println("📚🖋️I am " + name + " the Student.");
    }

    @Override
    public void doWork() {
        System.out.println("📚🖋️" + name + " is studying for exams.");
    }
}