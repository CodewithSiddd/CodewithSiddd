//Leetcode question - Missing Number

class Solution {
    public static int missingNumber(int[] nums) {
	        
	        int n = nums.length;
	        int i = 0;
	        while(i < n) {
	            if(nums[i] < n && nums[i] != nums[nums[i]]) {
	                swap(nums, i, nums[i]);
	            } else {
	                i++;
	            }
	        }

	        for(int ii = 0; ii < n; ii++) {
	            if(nums[ii] != ii) {
	                return ii;
	            } 
	        }
	        return n;
	    }


	private static void swap(int[] nums, int first, int second) {
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
	}
    
}
