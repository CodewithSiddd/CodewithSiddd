//Leetcode question - Binary Search

class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, target);
    }
    public int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            // this formula because if big array then (s + e)/2 might cross int limit.
            int mid = start + (end - start)/2;
            if(target < nums[mid]) {
                end = end - 1;
            } else if(target > nums[mid]) {
                start = start + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
