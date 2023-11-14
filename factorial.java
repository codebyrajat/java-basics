import java.util.Scanner;

public class factorial {
    public static void main (String args[]){
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        for (int i=n; i>=1 ; i--)
        {
            factorial = factorial*i;
        }
        sc.close();
        System.out.println("Factorial of given number is : "+ factorial);
    }
}
