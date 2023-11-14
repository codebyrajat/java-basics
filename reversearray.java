public class reversearray {
    public static void reverse(int arr[]){
        int low =0 , high = arr.length-1;
        while(low<high)
        {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for (int i=0 ; i<=arr.length-1 ; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main ( String args[]){
        int arr [] = {10,20,30,40,50,60};
        reverse (arr);
    }
}
