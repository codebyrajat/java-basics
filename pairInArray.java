public class pairInArray {
    public static void pairs(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++)
         {
            for (int j = i; j <= arr.length - 1; j++) 
            {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        pairs(arr);
        
    }
}
