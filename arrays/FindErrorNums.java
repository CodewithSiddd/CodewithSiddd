//Leetcode question - Set Mismatch

class Solution {
    public int[] findErrorNums(int[] nums) {
	        int[] arr = new int[2];
            int n = nums.length;
	        int i = 0;
	        while(i < n) {
	            if(nums[i] != nums[nums[i] - 1]) {
	                swap(nums, i, nums[i] - 1);
	            } else {
	                i++;
	            }
	        }
            
	        for(int ii = 0; ii < n; ii++) {
	            if(nums[ii] != ii + 1) {
	                arr[0] = nums[ii];
                    arr[1] = ii + 1;
	            } 
	        }
	        return arr;
    }

     public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
