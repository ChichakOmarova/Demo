package Citymanagementsystem;

public abstract class Person {
    String name;
    int age;
    String occupation;
    public Person(String name, int age , String occupation){
        this.name=name;
        this.age=age;
        this.occupation=occupation;
    }
    public abstract void introduce();

    public void doWork() {
        System.out.println(name + " is doing some generic work.");
    }

    public void rest() {
        System.out.println(name + " is resting.");
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("🗑️ Finalizing: " + name + " the " + occupation);
    }



}
