import java.util.Scanner;

public class Averageof3 {
    public static void main (String args[]){
        float result = average();
        System.out.println("Average is :"+result);
    }

    public static float average (){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        sc.close();
        float avg = (a+b+c)/3;
        return avg;

    }
}
