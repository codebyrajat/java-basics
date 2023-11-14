import java.util.*;
public class decreasingorder {
    public static void main (String args [])
    {
        int x=10;
        printt(x);
    }
    public void printt (int n)
    {   while(n>0){
        System.out.print(n);
        printt(n-1);
    }
    }
}