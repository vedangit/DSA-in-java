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

class Design1 extends Design{
    double height;

    public Design1(){
        super();
        height = 0.0;
    }

    public Design1(double height){
        super(radius;);
        this.height = height;
    }

    @Override
    public void setRadius(double radius) {
        // TODO Auto-generated method stub
        super.setRadius(radius);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double volume() {
        double vol = PI*radius*radius*height;
        return vol;
        
    }

    }

public class cylinder {
    
}
