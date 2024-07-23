//Leetcode question - Richest Customer Wealth

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] array : accounts){
            int m = 0;
            for(int index : array){
                m = index + m;
            }
            if(m>max){
                max = m;
            }
            
        }
        return max;
    }
}
