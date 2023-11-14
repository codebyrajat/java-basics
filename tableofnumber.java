import java.util.Scanner;

public class tableofnumber {
    public static void main(String args[] ){
        System.out.println("Enter Number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int entry;
        for (int i=1; i<=10 ; i++)
        {
            entry = n*i;
            System.out.println(n + " * " + i + " = " + entry);
            
        }


    }
}
