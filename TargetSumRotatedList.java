// To Find targated sum in rotated and sorted List

import java.util.ArrayList;

public class TargetSumRotatedList {
    public static boolean TargetSum(ArrayList<Integer> Numbers, int target) {
        // int lp=0;
        // int rp=Numbers.size()-1;
        int lp = 0, rp = 0;
        // Finding Pivot element
        for (int i = 0; i < Numbers.size() - 1; i++) {
            if (Numbers.get(i) > Numbers.get(i + 1)) {
                rp = i;
                lp = i + 1;
            }
        }
        while(lp!=rp){
            //Modular Arithematic for Rotated List :
            // Traverse index from left to right or smaller to greater: lp=(lp+1)%n , n is size of list.
            // Traverse index from right to left or greater to smaller: rp=(n+rp-1)%n
             if (Numbers.get(lp) + Numbers.get(rp) == target) {
                return true;
            }
            if (Numbers.get(lp) + Numbers.get(rp) < target) {
                lp=(lp+1)%Numbers.size();
            }
            if (Numbers.get(lp) + Numbers.get(rp) > target) {
                rp=(Numbers.size()+rp-1)%Numbers.size();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int target = 16;
        ArrayList<Integer> Numbers = new ArrayList<>();
        Numbers.add(11);
        Numbers.add(15);
        Numbers.add(6);
        Numbers.add(8);
        Numbers.add(9);
        Numbers.add(10);
        Boolean result = TargetSum(Numbers, target);
        System.out.println(result);
    }

}
