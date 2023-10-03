package oop.heap_stack;

public class Car {
    private String name;
    private String color;
    private int year;
    public Car(String name, String color, int year){
        this.name = name;
        this.color = color;
        this.year = year;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setYear(int year){
        this.year = year;
    }
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    public int getYear(){
        return this.year;
    }
    protected  void print(){
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Year: " + this.year);
    }
    public void printCar(){
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Year: " + this.year);
    }

}
