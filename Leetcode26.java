public class Leetcode26 {
    public static void main(String[] args) {
        judge(new int[] {1, 1, 2}, new int[] {1, 2});
        judge(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new int[] {0, 1, 2, 3, 4});
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int slow = 1;

        for (int fast = 1; fast < nums.length; fast++) {
            // If we find a new unique element
            if (nums[fast] != nums[fast - 1]) {
                // Move it to the position indicated by the slow pointer
                nums[slow] = nums[fast];
                // Move the slow pointer forward
                slow++;
            }
        }

        // The length of the unique elements
        return slow;
    }

    public static void judge(int[] numss, int[] expectedNumss) {
        int[] nums = numss; // Input array
        int[] expectedNums = expectedNumss; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
            System.out.println(nums[i] == expectedNums[i]);
        }
    }
}
