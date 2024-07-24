//Leetcode question - Rotate Array

class Solution {
    public void rotate(int[] nums, int k) {
        // This solution exceedes time for big data :)
        // int c = 0;
        // k %= nums.length; 
        // for(int i = 0; i < k; i++) {
        //     int last = nums[nums.length - 1];
        //     for(int j = 0; j < nums.length; j++) {
        //         int temp = nums[j];
        //         nums[j] = last;
        //         last = temp;
        //     }
        // }
        int[] a = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      a[(i + k) % nums.length] = nums[i];
    }
    for (int i = 0; i < nums.length; i++) {
      nums[i] = a[i];
    }
    }
}
