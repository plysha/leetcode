package easy;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int res = nums[0];
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (nums[l] < nums[r]) {
                res = Math.min(res, nums[l]);
                break;
            }

            int m = (l + r) / 2;
            res = Math.min(res, nums[m]);
            if (nums[m] >= nums[l]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return res;
    }
}
