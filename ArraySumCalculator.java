public class ArraySumCalculator {

    public static int calculateSum(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        int sum = 0;
        for (int element : array) {
            sum += element; // Add each element to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] numbers = {5, 12, 3, 8, 9, 4, 6};
        int sum = calculateSum(numbers);
        System.out.println("The sum of all elements in the array is: " + sum);
    }
}
