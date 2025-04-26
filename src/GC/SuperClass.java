package GC;

class SuperClass {
    void displayInfo() {
        System.out.println("SuperClass Object Created.");
    }
    @Override
    protected void finalize() throws Exception{
        System.out.println("SuperClass Object is being collected by GC.");
    }
}




