package oop.inheritance;

public class Viecule {
    public String name;
    public String color;
    public int year;
    Dacia dacia = new Dacia();
    static {
        System.out.println("This is a static block from parent");
    }
    public Viecule(String name, String color, int year){
        this.name = name;
        this.color = color;
        this.year = year;
    }
    public Viecule(){

    }

    public static void printer(){
        System.out.println("This is a static method from parent ");
    }
    public void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Year: " + this.year);
    }

}
