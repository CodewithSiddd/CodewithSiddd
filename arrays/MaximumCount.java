//Leetcode question - Maximum Count of Positive Integer and Negative Integer

class Solution {
    public int maximumCount(int[] nums) {
        int countOfPositiveIntegers = 0;
        int countOfNegativeIntegers = 0;
        for(int i : nums) {
            if(i < 0) {
                countOfNegativeIntegers++;
            } else if(i > 0) {
                countOfPositiveIntegers++;
            }
        }
        if(countOfPositiveIntegers > countOfNegativeIntegers) {
            return countOfPositiveIntegers;
        } else {
            return countOfNegativeIntegers;
        }
    }
}
