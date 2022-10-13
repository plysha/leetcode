package easy;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int i = 0;
        int k = 0;
        for (int j = 0; i < nums.length; ) {
            nums[k] = nums[j];
            while (j < nums.length && nums[i] == nums[j]) {
                j++;
            }
            k++;
            i = j;
        }

        return k;
    }
}
