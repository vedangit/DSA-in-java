//compute power of 2 usinf for loop
import java.util.Scanner;
import java.math.MathContext;
public class For{
    public static void main(String[] args) {
        int pow = 0;
        System.out.println("Enter the number till which the power of 2 needs to be calculated");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i<=n; ++i)
        {
            if(n == 0)
                pow = 1;
            
            else
            
                
                System.out.println(n + " " + pow);
            
            
        }
    }
}
