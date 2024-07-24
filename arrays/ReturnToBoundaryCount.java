//Leetcode question - Ant on the Boundary

class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int antPosition = 0;
        int count = 0;
        for(int i : nums) {
            antPosition = i + antPosition;
            if(antPosition == 0) {
                count++;
            }
        }
        return count;
    }
}
