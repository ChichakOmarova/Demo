package Inheritance;

public class Maininheritancecar {
    public static void main(String[] args) {
        Vehicle vehicle = new Bmw("");


       Vehicle Bmw= new Bmw("ad");


       if(vehicle instanceof  Bmw) {
           System.out.println("yes it is");
       }
    }


}


