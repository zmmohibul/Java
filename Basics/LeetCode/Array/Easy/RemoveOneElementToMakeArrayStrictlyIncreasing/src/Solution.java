public class Solution {
    public boolean canBeIncreasing(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }

        int count = 0;
        int i = 0;
        int j = 1;
        int k = 2;
        while (j < nums.length) {
            if (k < nums.length) {
                if (nums[j] <= nums[i] || nums[j] >= nums[k]) {
                    count += 1;
                    nums[j] = nums[i];
                }
            } else {
                if (nums[j] <= nums[i]) {
                    count += 1;
                }
            }

            if (count > 1) {
                return  false;
            }

            i += 1;
            j += 1;
            k += 1;
        }

        return true;
    }
}
