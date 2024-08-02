//Leetcode question - Rearrange Array Elements by Sign

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] a = new int[nums.length];
        int j = 0, k = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                a[j] = nums[i];
                j += 2;
            } else {
                a[k] = nums[i];
                k += 2;
            }
        }
        return a;
    }
}