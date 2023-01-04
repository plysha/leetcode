package medium;

public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) return nums[0];

        int res = nums[0];
        int max = 1;
        int min = 1;

        for (int n : nums) {
            int tmp = n * max;
            max = Math.max(n, Math.max(tmp, n * min));
            min = Math.min(n, Math.min(tmp, n * min));
            if (max > res) {
                res = max;
            }
        }

        return res;
    }
}
