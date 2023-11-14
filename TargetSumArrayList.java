import java.util.ArrayList;

public class TargetSumArrayList {

    // If given arraylist is sorted : 1 ,2,3,4,5,6

    public static boolean TargetSum(ArrayList<Integer> Numbers, int target) {
        int lp = 0;
        int rp = Numbers.size() - 1;
        while (lp < rp) {
            if (Numbers.get(lp) + Numbers.get(rp) == target) {
                return true;
            }
            else if (Numbers.get(lp) + Numbers.get(rp) < target) {
                lp++;
            }
            else if (Numbers.get(lp) + Numbers.get(rp) > target) {
                rp--;
            }

        }
        return false;
    }

    


    public static void main(String[] args) {
        int target = 5;
        ArrayList<Integer> Numbers = new ArrayList<>();
        Numbers.add(1);
        Numbers.add(2);
        Numbers.add(3);
        Numbers.add(4);
        Numbers.add(5);
        Numbers.add(6);
        Boolean result = TargetSum(Numbers, target);
        System.out.println(result);
    }
}
