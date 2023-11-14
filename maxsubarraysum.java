public class maxsubarraysum {
    public static void subarrays(int arr[]) {
        int sum = 0, largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = 0;
                for (int k = start; k <= end; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k]);
                }
                if (sum >= largest) {
                    largest = sum;

                }
                System.out.println("\tSum : " + sum);
            }
        }
        System.out.println("\tLargest is :" + largest);
    }

    public static void main(String args[]) {
        int arr[] = { -2 , -3 , 4 , -1 , -9 ,15 , -3};
        subarrays(arr);
    }
}
