package easy;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res ^= i;
            res ^= nums[i];
        }

        return res;
    }

    //[0,2]
    //00 01 11
    //00 11

    //11
    //11
    //01
    //00
    //--
    //01
}
