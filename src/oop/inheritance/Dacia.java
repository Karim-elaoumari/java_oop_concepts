package oop.inheritance;

public class Dacia extends Viecule {
    public  String version;
    Viecule viecule ;
    public Dacia(String name, String color, int year, String version){
        super(name, color, year);
        this.version = version;
    }

    public Dacia(){

    }
    public Dacia(String name, String color, int year, String version,Viecule viecule){
        super(name, color, year);
        this.version = version;
        this.viecule = viecule;
    }
    public static void printer(){
        System.out.println("This is a static method from child");
    }

    public void getversion(){
        System.out.println("Version: " + this.version);
    }
}
