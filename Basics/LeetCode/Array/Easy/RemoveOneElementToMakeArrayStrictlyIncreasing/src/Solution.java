public class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int i = nums.length - 1;
        int count = 0;
        while (i >= 1) {
            if (nums[i] <= nums[i - 1]) {
                count += 1;
            }

            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}
