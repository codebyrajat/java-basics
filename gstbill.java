import java.util.*;
public class gstbill {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter cost of Pencil");
            float a = sc.nextInt();
            System.out.println("Enter cost of Pen");
            float b = sc.nextInt();
            System.out.println("Enter cost of Notebook");
            float c = sc.nextInt();
            sc.close();
            float total = a+b+c;
            System.out.println("Total is : "+ total);
            float gst = (float)((total*18)/100);
            float bill = gst + total ;
            System.out.println("Total Bill is : "+ bill );
        }
    } 