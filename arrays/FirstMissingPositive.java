//Leetcode question - First Missing Positive

class Solution {
    public int firstMissingPositive(int[] nums) {
            int n = nums.length;
	        int i = 0;
	        while(i < n) {
	            if(nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] -1]) {
	                swap(nums, i, nums[i] - 1);
	            } else {
	                i++;
	            }
	        }
	        for(int ii = 0; ii < n; ii++) {
	            if(nums[ii] != ii + 1) {
	                return ii + 1;
	            } 
	        }
	        return nums.length + 1;
    }

     public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
