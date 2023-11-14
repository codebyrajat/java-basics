public class IsEven {

    public static boolean Even(int n){
        int lastdigit = n%10;
        if ((lastdigit/2)==0){
            return true;
        }
        return false;
    }
    public static void main (String args[]){
        boolean x = Even(10);
        System.out.println(x);
    }

}
