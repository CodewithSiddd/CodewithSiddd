//Leetcode question - Sort Colors

class Solution {
    public void sortColors(int[] nums) {
        // Brute force approach --> 
        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i + 1; j < nums.length; j++) {
        //         if(nums[j] < nums[i]) {
        //             int temp = nums[i];
        //             nums[i] = nums[j];
        //             nums[j] = temp;
        //         }
        //     }
        // }

/////////////////////////////////////////////////////////////////////////////////////////////

        // Better approach -->
        int c0 = 0, c1 = 0, c2 = 0;
        for(int i : nums) {
            if(i == 0) c0++;
            else if(i == 1) c1++;
            else c2++;
        }
        for (int i = 0; i < nums.length;  i++) {
            if (c0 != 0) {
                nums[i] = 0;
                c0--;
            } else if (c1 != 0) {
                nums[i] = 1;
                c1--;
            } else {
                nums[i] = 2;
                c2--;
            }
        }
    }
    //     int low = 0, mid = 0, high = nums.length - 1;
    //     while(mid <=  high) {
    //         if(nums[mid] == 0) {
    //             swap(nums, low, mid);
    //             mid++;
    //             low++;
    //         } else if(nums[mid] == 1) {
    //             mid++;
    //         } else {
    //             swap(nums, low, mid);
    //             high--;
    //         }
    //     }


    // }

    // void swap(int[] nums, int first, int second) {
    //     int temp = nums[first];
    //     nums[first] = nums[second];
    //     nums[second] = temp;
    // }
}
