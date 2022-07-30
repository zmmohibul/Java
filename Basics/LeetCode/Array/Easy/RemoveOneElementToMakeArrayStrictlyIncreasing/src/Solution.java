public class Solution {
    public boolean canBeIncreasing(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }

        int count = 0;
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] > nums[i + 1]) {
                count += 1;
                i += 1;
            }

            if (count > 1) {
                return false;
            }

            i += 1;
        }

        return  true;
    }
}
