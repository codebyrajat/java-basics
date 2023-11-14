import java.util.*;

public class ContainerWater {
    // public static int StoreWater(ArrayList<Integer> Heigths) {
    // int MaxWater=0;
    // //BruteForce code -O(n^2)
    // for(int i=0 ; i < Heigths.size(); i++ )
    // {
    // for (int j=i+1 ; j<Heigths.size(); j++)
    // {
    // int width = j-i;
    // int length = Math.min(Heigths.get(i),Heigths.get(j));
    // int CurrWater = width*length;
    // MaxWater = Math.max(MaxWater,CurrWater);
    // }
    // }
    // return MaxWater;
    // }

    // Two pointer Approach - Optimal - O(n)Complexity
    public static int StoreWater(ArrayList<Integer> Heigths) {
        int MaxWater = 0;
        int lp = 0;
        int rp = Heigths.size()-1;

        while (lp<rp) {

            int width = rp-lp;
            int length = Math.min(Heigths.get(lp), Heigths.get(rp));
            int CurrWater = width*length;
            MaxWater = Math.max(MaxWater, CurrWater);
            if (Heigths.get(lp) < Heigths.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return MaxWater;
    }

    public static void main(String[] args) {
        // 1,8,6,2,5,4,8,3,7
        ArrayList<Integer> Heigths = new ArrayList<>();
        Heigths.add(1);
        Heigths.add(8);
        Heigths.add(6);
        Heigths.add(2);
        Heigths.add(5);
        Heigths.add(4);
        Heigths.add(8);
        Heigths.add(3);
        Heigths.add(7);

        System.out.println("Maximum water stored is : " + StoreWater(Heigths));
        ;

    }
}
