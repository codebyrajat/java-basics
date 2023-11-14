public class kadanes {
    public static void maxsum(int arr[]) {
        int cs = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if (cs < 0) {
                cs = 0;
            }
            max = Math.max(max, cs);
        }
        System.out.println("Max is :" + max);
    }

    public static void main(String args[]) {
        int arr[] = { -2, -3, 4, -1, -9, 15, -3 };
        maxsum(arr);
    }
}
