
import java.util.*;

public class MaxinArrayList {
    public static void main (String args[]){
    //Integer.MIN_VALUE equals to minus infinity
    ArrayList<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(9);
    list.add(8);

    int max = Integer.MIN_VALUE;
    for(int i=0 ; i<list.size() ; i++){
        if (max<list.get(i))
        {
            max = list.get(i);
            
        }
        // OR instead of if statement
            // max = Math.max(max, list.get(i));
    }
    System.out.println(max);
    
    }
}

