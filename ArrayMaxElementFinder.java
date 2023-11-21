public class ArrayMaxElementFinder {

    public static int findMaxElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int maxElement = array[0]; // Assume the first element is the maximun

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        return maxElement;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 8, 4, 6};
        int maxElement = findMaxElement(numbers);
        System.out.println("The largest element in the array is: "+maxElement);
    }
    
}