//Leetcode question - Capacity To Ship Packages Within D Days

class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start = 0, end = 0;
        for(int i = 0; i < weights.length; i++) {
            start = Math.max(start, weights[i]);
            end += weights[i];
        }

        while(start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
            for(int weight : weights) {
                if(sum + weight > mid) {
                    sum = weight;
                    pieces ++;
                } else {
                    sum += weight;
                }
            }
            if(pieces > days) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }
}
