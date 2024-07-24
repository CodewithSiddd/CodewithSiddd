//Leetcode question - Median of Two Sorted Arrays

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sort = new int[nums1.length + nums2.length];
        ///// Merging two sorted arrays /////
        int i = 0,j = 0,k = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] > nums2[j]) {
                sort[k++] = nums2[j++];
            } else {
                sort[k++] = nums1[i++];
            }
        }
        while(i < nums1.length) {
            sort[k++] = nums1[i++];
        }
        while(j < nums2.length) {
            sort[k++] = nums2[j++];
        }
        ///// End of merge logic /////
        
        if((nums1.length + nums2.length) % 2 == 0) {
            return ((float)(sort[((nums1.length + nums2.length) / 2)-1] + sort[((nums1.length + nums2.length) / 2)])) / 2;
        } else {
            return sort[(nums1.length + nums2.length) / 2];
        }
    }
}
