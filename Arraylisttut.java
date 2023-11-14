import java.util.ArrayList;
// or
// import java.util.*;

public class Arraylisttut {
    public static void main(String args[]){
        // Classname<DatatypeClass> Objectname = new ClassName<>();
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list1 = new ArrayList<>();
        // ArrayList<Boolean> list2 = new ArrayList<>();

        //Add operation
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        //list = [1,2,3]

        //Add value at index
        list.add(1,10);
        System.out.println(list);
        // list = [1,10,2,3]

        //Get operation
        int x = list.get(2);
        System.out.println(x);

        //Remove op
        list.remove(1);
        System.out.println(list);
        list.add(5);

        //Change value at index : Set op.
        list.set(0,15);
        System.out.println(list);

        // Present in arraylist or not : Contains op.
        System.out.println(list.contains(15));
        System.out.println(list.contains(14));

        //return size of list 
        System.out.println(list.size());

    }
}

// Arraylist as Vectors in C++
// Dynamic Size & 
// Primitive Datatypes can't 
// be stored directly

// Operations on Arraylist: Time compx.
// Add Element O(1) 
// Get Element O(1)
// Remove Element O(n)
// Set Element at index  O(n)
// Contains Element O(n)