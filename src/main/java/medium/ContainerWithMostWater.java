package medium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int res = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r) {
            int value = (r - l) * Math.min(height[l], height[r]);
            res = Math.max(res, value);

            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return res;
    }
}
