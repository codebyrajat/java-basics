public class linearSearch {
    public static int Search(int arr[], int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int number = 1;
        int arr[] = { 5, 10, 2, 7, 1, 9, 1 };
        int result = Search(arr, number);
        if (result == 1) {
            System.out.println("Element found ");
        } else {
            System.out.println("Element not found");
        }
    }
}
