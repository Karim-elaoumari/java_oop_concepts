package oop.destructor;

public class Dest {

    public String name;
    public String color;
    public int year;
    public Dest(String name, String color, int year){
        this.name = name;
        this.color = color;
        this.year = year;
    }
    public static void printer(){
        System.out.println("This is a static method from parent ");
    }
    @Override
    public void finalize(){
        System.out.println("This is a finalizer method executed before garbage collection");
    }
}
