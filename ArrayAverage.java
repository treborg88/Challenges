public class ArrayAverage {

    public static double calculateAverage (int[] array){
        double sum = 0;
        for (int element: array){
            sum += element;
        }
        double average = sum / array.length;
        return average;

    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5,};
        double average = calculateAverage(numbers);
        System.out.println("The average of the array is: " + average);
    }
}