//Leetcode question - Find First and Last Position of Element in Sorted Array

class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }
        int[] ans = {-1, -1};
        ans[0] = find(nums, target, true);
        if(ans[0] != -1) {
            ans[1] = find(nums, target, false);
        }
        return ans;
    }
    public int find(int[] nums, int target, boolean isStart) {
        int start = 0, end = nums.length - 1, ans = -1;;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]){
                start = mid + 1;
            } else {
                ans = mid;
                if(isStart) {
                    end = mid - 1; 
                } else {
                    start = mid + 1;
                }
            } 
        }
        return ans;
    }
}
