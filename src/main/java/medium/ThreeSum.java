package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }

            //solution similar to 2sum II
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                int threeSum = nums[i] + nums[l] + nums[r];

                if (threeSum > 0) {
                    r -= 1;
                } else if (threeSum < 0) {
                    l += 1;
                } else {
                    res.add(List.of(nums[i], nums[l], nums[r]));
                    l += 1;
                    //to avoid similar sum
                    while (nums[l] == nums[l - 1] && l < r) {
                        l += 1;
                    }
                }
            }
        }

        return res;
    }
}
