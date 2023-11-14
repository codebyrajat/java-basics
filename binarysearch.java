public class binarysearch {
    public static int search(int arr[], int key) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == arr[mid]) 
            {
                return mid;
            }
            if (key < arr[mid]) 
            {
                high = mid - 1;
            } 
            else
            {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        int key = 40;
        System.out.println("Element is found at : "+search(arr, key));
        
    }
}
