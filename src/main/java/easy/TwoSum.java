package easy;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.get(diff) != null) {
                result[0] = map.get(diff);
                result[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }

        return result;
    }
}
