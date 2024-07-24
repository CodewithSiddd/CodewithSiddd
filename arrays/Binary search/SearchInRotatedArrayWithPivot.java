//Leetcode question - Search in Rotated Sorted Array

class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 1) {
            if(nums[0] == target) {
                return 0;
            } else {
                return -1;
            }
        }
        if(nums.length == 2) {
            if(nums[0] == target) {
                return 0;
            } else if(nums[1] == target){
                return 1;
            } else {
                return -1;
            }
        }
        int result = -1;
        if(nums[0] < nums[nums.length - 1]) {
            return searchInRotatedArrayWithPivot(nums, target, 0, nums.length - 1);
        } else {
            int pivotIndex = searchPivotedIndex(nums, target);
            result =  searchInRotatedArrayWithPivot(nums, target, 0, pivotIndex);
            if(result == -1) {
                result = searchInRotatedArrayWithPivot(nums, target, pivotIndex + 1, nums.length - 1);
            }
        }
        return result;
    }

    public int searchPivotedIndex(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[mid + 1]) {
            	return mid;
            } else if(nums[mid] < nums[mid - 1]) {
            	return mid - 1;
            }
            if(nums[mid] > nums[end]) {
               start = mid;
            } else if(nums[mid] < nums[start]) {
               end = mid;
            }
        }
        return -1;
    }

    public int searchInRotatedArrayWithPivot(int[] nums, int target, int start, int end) {
        if(nums[end] > target && nums[start] > target) {
            return -1;
        } else if(nums[end] < target && nums[start] < target) {
        	return -1;
        }
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] < target) {
                start = mid + 1;
            } else if(nums[mid] > target) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
