public class prefixSum {
    public static void prefixadd(int arr[]) {
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 0; i < arr.length; i++) {
            prefix[i] = i == 0 ? arr[0] : prefix[i - 1] + arr[i];
            System.out.println("Sum till index " + i + " is : " + prefix[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            int start = i, result = 0;
            for (int j = i + 1; j < arr.length; j++) {
                int end = j;
                result = prefix[end] - prefix[start];
                if (result >= max) {
                    max = result;
                }
            }

        }
        System.out.println("Max sum of digits of Subarrays is : " + max);

    }

    public static void main(String args[]) {
        int arr[] = { 1, -2, 6, -1, 3 };
        prefixadd(arr);
    }
}
