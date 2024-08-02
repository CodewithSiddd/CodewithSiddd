//Leetcode question - Number of Steps to Reduce a Number to Zero

class Solution {
    public int numberOfSteps(int num) {
        return counting(num, 0);
    }

    int counting(int num, int count) {
        if(num == 0) {
            return count;
        } else if(num % 2 == 0) {
            return counting(num / 2, count + 1);
        } 
        return counting(num - 1, count + 1);
    }
}
