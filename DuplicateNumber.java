import java.util.Set;
import java.util.HashSet;

public class DuplicateNumber {
    public static int findDuplicate(int[] nums) {
        // Use a hash set to store the seen numbers
        Set<Integer> seen = new HashSet<>();

        // Iterate through the array
        for (int num : nums) {
            // If the number is already in the set, it is a duplicate
            if (seen.contains(num)) {
                return num;
            }

            // Add the number to the set
            seen.add(num);
        }

        // If we reach here, there are no duplicates
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 2};
        int duplicateNumber = findDuplicate(nums);
        System.out.println("The duplicate number is: " + duplicateNumber);
    }
}
