//Leetcode question - Squares of a Sorted Array

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        //Selection sort
        for(int i = 0; i < nums.length; i++) {
            int end = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, end);
            int temp = nums[maxIndex];
            nums[maxIndex] = nums[end];
            nums[end] = temp;
        }
        return nums;
    }
    public int getMaxIndex(int[] nums, int start, int end) {
        int maxIndex = start;
        for(int i = start; i <= end; i++) {
            if(nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
