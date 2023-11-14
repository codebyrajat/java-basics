import java.util.ArrayList;
import java.util.Collections;

public class SortArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<>();
        Numbers.add(3);
        Numbers.add(2);
        Numbers.add(1);
        Numbers.add(4);
        System.out.println(Numbers);
        Collections.sort(Numbers); //Ascending Order
        System.out.println(Numbers);

        //Descending order
        Collections.sort(Numbers, Collections.reverseOrder());
        // Collections.reverseOrder is a COMPARATOR  
        // Comparators are functions that has inbuild defined logic 
        System.out.println(Numbers);
    }
}
