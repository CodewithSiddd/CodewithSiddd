//Leetcode question - Find Numbers with Even Number of Digits
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int index : nums){
            if(index > 0){
                int countOfDigit = 0;
                while(index > 0){
                    index = index/10;
                    countOfDigit++;
                }
                if(countOfDigit % 2 == 0){
                 count++;   
                }
            }
        }
        return count;
    }
    
}
