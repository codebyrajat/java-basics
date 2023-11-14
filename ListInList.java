import java.util.ArrayList;

public class ListInList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> List1  = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
       
        List1.add(1);
        List1.add(2);
        List1.add(3);

        List2.add(4);
        List2.add(5);
        List2.add(6);

        MainList.add(List1);
        MainList.add(List2);

        for (int i=0; i<MainList.size(); i++){
            System.out.println(MainList.get(i));
        }
        //or 
        // for (int i=0; i<MainList.size(); i++){
        //     ArrayList<Integer> CurrentList = MainList.get(i);
        //     for(int j=0; j<CurrentList.size(); j++){
        //         System.out.print(CurrentList.get(j)+" ");
        //     }
        //     System.out.println();
        // }



    }
}
