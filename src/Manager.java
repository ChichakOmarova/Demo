public class Manager extends Parent implements Workable {
    @Override
    public void work2() {
        System.out.println("workers can work");
    }

    String project;


    public void work() {
        System.out.println("Project " + project);


    }

    public Manager(String name, int age, String project) {
        super(name, age);
        this.project = project;
    }

    public String getProject() {
        return project;
    }
    public void setProject(String project) {
        this.project = project;
    }



}
