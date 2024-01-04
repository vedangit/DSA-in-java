package OOP;
import java.util.Scanner;
import java.util.Set;

import static java.lang.Math.PI;
class Design{
    double radius;
    String colour;

//constructors
    Design()
    {
        radius = 0.0;
        colour = "default";

    }

    Design(double radius){
        this.radius = radius;
        colour = "default";

    }

    Design(double radius, String colour){
        this.radius = radius;
        this.colour = colour;
    }

    //methods
    public double circumference(){
        double circ = 2*PI*radius;
        return circ;
    }

    public double area(){
        double area = PI*radius*radius;
        return area;
    }

//getters and setters
    //to set radius to smth else after the parameter has alr been passed
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //to set colour to smth else 
    public void setColour(String colour) {
        this.colour = colour;
    }

    //to get the set values
    public double getRadius() {
        return radius;
    }

    public String getColour() {
        return colour;
    }

 
}

public class circle {
    public static void main(String[] args) {

        Design c1 = new Design();
        System.out.println(c1.radius + " " + c1.colour); //0.0 default

        //testing getters and setters
        c1.setColour("Red");
        c1.setRadius(3.0);
        System.out.println(c1.getRadius() + " " + c1.getColour()); //3.0 Red
        System.out.println(c1.radius + " " + c1.colour); //3.0 Red


        Design c2 = new Design(3.0);

        //testing methods
        System.out.println("Circumference of a circle with radius " + c1.radius + " is " + c1.circumference()); //prints circ
        System.out.println("Area of a circle with radius " + c1.radius + " is " + c1.area()); //prints area

        Design c3 = new Design(3.0, "red");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the colour of your circle = ");
        String col = input.nextLine();
        c3.setColour(col);
        System.out.println("Colour of the circle is " + c3.getColour()); //Colour of the circle is green
    }
}


