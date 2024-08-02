//Leetcode question - Single Number

class Solution {
    public int singleNumber(int[] nums) {
        //  int n = nums.length;
	    //     int i = 0;
	    //     while(i < n) {
	    //         if(nums[i] < n && nums[i] != nums[nums[i] -1]) {
	    //             swap(nums, i, nums[i] - 1);
	    //         } else {
	    //             i++;
	    //         }
	    //     }

	    //     for(int ii = 0; ii < n; ii = ii + 2) {
	    //         if(ii == n - 1) {
        //             return nums[ii];
        //         }
        //         else if(nums[ii] != nums[ii + 1]) {
	    //             return nums[ii];
	    //         } 
	    //     }
	    //     return n;

        int result=0;
        for(int i = 0; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
	    }
    

	// private static void swap(int[] nums, int first, int second) {
	// 	int temp = nums[first];
	// 	nums[first] = nums[second];
	// 	nums[second] = temp;
	// }
    
}
