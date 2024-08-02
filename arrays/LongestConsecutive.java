//Leetcode question - Longest Consecutive Sequence

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int currentCount = 1;
        int start = nums[0];
        int maxCount = currentCount;
        for(int i = 1; i < nums.length; i++) {
            if(start + 1 == nums[i]) {
                start += 1;
                currentCount++;
            } else if(start == nums[i]) {
               continue;
            } else{
                if(maxCount < currentCount) {
                    maxCount = currentCount;
                }
                start = nums[i];
                currentCount = 1;
            }
        }
        if(maxCount < currentCount) {
            maxCount = currentCount;
        }
        return maxCount;
    }
}
