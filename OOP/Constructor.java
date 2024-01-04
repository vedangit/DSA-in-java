package OOP;
//program to display the dimensions of a room

import java.util.Scanner;
class Dimensions
{
    float length;
    float breadth;

    Dimensions()
    {
        length = 0;
        breadth= 0;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }
    // Dimensions(float x, float y)
    // {
    //     length = x;
    //     breadth = y;
    // }
    Dimensions(float length, float breadth)
    {
        this.length = length;  //this keyword
        this.breadth = breadth;
    }

    void dim()
    {
        System.out.println("length is : " + length);
        System.out.println("breadth is : " + breadth);
    }

    void area()
    {
        float area = length*breadth;
        System.out.println("Area is : " + area);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length : ");
        float x = input.nextFloat();
        System.out.println("Enter breadth : ");
        float y = input.nextFloat();
        Dimensions d1 = new Dimensions();
        Dimensions d2 = new Dimensions(x, y);

        d1.dim();
        d2.dim();
        d1.area();
        d2.area();
    }
}


//void display()



//java.java skhfhsdhsd
//kjsdf
