//Leetcode question - Find Minimum in Rotated Sorted Array

class Solution {
    public int findMin(int[] nums) {
        //here pivot + 1 is times the array is rotated
        int pivotIndex = findPivot(nums);
        return nums[pivotIndex];
    }

    public int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1;
        if(nums.length == 1) {
            return 0;
        } else if(nums.length == 2) {
            return (nums[0] < nums[1] ? 0 : 1);
        } else if(nums[0] < nums[nums.length - 1]){
            return 0;    
        } else {
            while(start < end) {
                int mid = start + (end - start) / 2;
                if(nums[mid] > nums[mid + 1]) {
                    return mid + 1;
                } else if(nums[mid] < nums[mid - 1]) {
                    return mid;
                } else if(nums[start] > nums[mid]){
                    end = mid;
                } else {
                    start = mid;
                }
            }
        }
        return start;
    }
}
