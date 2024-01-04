import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks out of 40 : ");
        float a = input.nextFloat();
        float per = (a/40)*100;
        System.out.println("Percentage obtained : " + per + "%");
        if(per>=33)
        {
            System.out.println("null");
        }
        else
        {
            System.out.println("You've failed. ");
        }
    }


}
//nice.