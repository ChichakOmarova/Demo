public class Maininheritance {
    public static void main(String[] args) {
        Parent parent = new Parent("AD",18);
        Parent Employee= new Employee(600,2356789,30,"AD");
        Parent Manager = new Manager("AD",21,"YeniProyekt");
        Employee.work();
        parent.work();
        Manager.work();
    }
}
