package Clases.test;


import Clases.*;

public class test {


    public static void main(String[] args) {
        Jefe jefe1 = new Jefe("Luis", "Hernandez", 67, 6000000, 500000);
        Desarrollador dev1 = new Desarrollador("Yo", "Yo", 20, 800000, 800);
        
        System.out.println(dev1 +"\n" + jefe1);
    }
    
}
