public class subarray {
    public static void subarrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i ; j < arr.length; j++) {
                int end = j , sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k]);
                }
                System.out.println("\tSum : "+sum);
            }
        }
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        subarrays(arr);
    }
}
