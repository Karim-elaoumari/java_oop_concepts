package declarative_imperative.combination_patern;

import java.util.Objects;

public class Phone {
    private String name;
    private String color;
    private int year;

    public Phone(String name, String color, int year){
        this.name = name;
        this.color = color;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
