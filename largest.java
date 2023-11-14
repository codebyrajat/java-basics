
public class largest {
    public static int GetLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest <= numbers[i]) {
                largest = numbers[i];
            }

        }
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = { 10, 20, 35, 50, 12, 18, 31 , 80};
        int result = GetLargest(numbers);
        System.out.println("Largest value is : "+result);
    }
}
