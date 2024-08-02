//Leetcode question - Majority Element

class Solution {
    public int majorityElement(int[] nums) {
        int majority = 0, vote = 0;
        //Moore's voting algorithm
        for(int i : nums) {
            if(majority == 0) {
                majority = i;
                vote++;
            } else if(majority == i) {
                vote++;
            } else if(vote == 0) {
                majority = i;
                vote++;
            } else {
                vote--;
            }
        }
        return majority;
    }
}
