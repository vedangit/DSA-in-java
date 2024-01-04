import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = input.nextInt();
        int index = marks/10;
        String grade;
        switch(index)
        {
            case 10:
            grade = "honours";
            break;

            case 9:
            grade = "first";
            break;

            case 8:
            grade = "second";
            break;

            default:
            grade = "good";
        }
        System.out.println(grade);
    }
}
