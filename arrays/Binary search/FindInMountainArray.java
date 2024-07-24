//Leetcode question - Find in Mountain Array

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
       int peak = peakIndex(mountainArr);
       int firstTry = search(mountainArr, target, 0, peak);
       if(firstTry == -1) {
           int secondTry = search(mountainArr, target, peak + 1, mountainArr.length() - 1);
           return secondTry;
       }
       return firstTry;
    }

    public int peakIndex(MountainArray mountainArr) {
        int start = 0, end = mountainArr.length() - 1;
        while(start < end) {
           int mid = start + (end - start) / 2;
           if(mountainArr.get(mid) > mountainArr.get(mid + 1)) {
               end = mid;
           } else {
               start = mid + 1;
           }
       }
       return end;
    }

    public int search(MountainArray mountainArr, int target, int start, int end) {
        boolean isAsc = mountainArr.get(start) < mountainArr.get(end);
        while(start <= end) {
            int mid = start + (end - start) / 2;
            int midValue = mountainArr.get(mid);
            if(midValue == target) {
                return mid;
            }
            if(isAsc) {
                if(target < midValue) {
                    end = mid - 1;
                } else if(midValue == target) {
                    return mid;
                } else {
                    start = mid + 1;
                }
            } else {
                if(target < midValue) {
                    start = mid + 1;
                } else if(midValue == target) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
