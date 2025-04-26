package TestExc;
    public class GCExample {

        public static void main(String[] args) {
            ClassB obj = new ClassB();
            obj.displayInfo();
            obj = null;
            System.gc();
        }
    }




