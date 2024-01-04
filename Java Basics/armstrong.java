import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(armstrong(n));
        for(int i = 100; i<=1000; i++){
            if(armstrong(i) == true){
                System.out.println(i);
            }
        }
    }

    static boolean armstrong(int n){
        int sum = 0;
        int original = n;

        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;

        }
        return sum == original;
    }
}
