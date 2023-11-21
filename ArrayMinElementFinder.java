public class ArrayMinElementFinder {

    public static int findMinElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int minElement = array[0]; // Assume the first element is the minimum

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i]; // Update minElement if a smaller element is found
            }
        }

        return minElement;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 8, 4, 6};
        int minElement = findMinElement(numbers);
        System.out.println("The smallest element in the array is: " + minElement);
    }
}
