//Leetcode question - Max Consecutive Ones

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i : nums) {
            if(i == 1) {
                max = max + 1;
            } else {
                list.add(max);
                max = 0;
            }
            list.add(max);
        }
        max = 0;
        for(Integer i : list) {
            if(max < i) {
                max = i;
            }
        }
        return max;
    }
}
