public class Employee extends Parent implements Workable  {
    @Override
    public void work2() {
        System.out.println("Workers can work..");
    }

    int salary;
    int ID;
    public void work() {
        System.out.println("Salary " + salary);
        System.out.println("Worker ID " + ID);
    }

    public Employee(int salary, int ID, int age,  String name) {
        super(name, age);
        this.salary = salary;
        this.ID = ID;
    }

    public int getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

}





