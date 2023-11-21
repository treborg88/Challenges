import java.util.HashMap;
public class MostFrequentElement {

    public static int mostFrequent(int[] arr) {
        int maxCount = 0;
        int elementWithMaxCount = arr[0];
        HashMap<Integer, Integer> counts = new HashMap<>();

        for (int element : arr) {
            if (counts.containsKey(element)) {
                int currentCount = counts.get(element) + 1;
                counts.put(element, currentCount);
            } else {
                counts.put(element, 1);
            }

            if (counts.get(element) > maxCount) {
                maxCount = counts.get(element);
                elementWithMaxCount = element;
            }
        }

        return elementWithMaxCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1};
        int mostFrequentElement = mostFrequent(arr);
        System.out.println("The most frequent element in the array is: " + mostFrequentElement);
    }
}
