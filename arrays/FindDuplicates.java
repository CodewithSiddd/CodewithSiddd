//Leetcode question - Find All Duplicates in an Array

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        int i = 0;
        while(i < nums.length) {
            if(nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != j + 1) {
               list.add(nums[j]);
            }
        }
        return list;
    }
     public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
