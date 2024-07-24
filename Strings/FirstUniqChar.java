//Leetcode question - First Unique Character in a String

class Solution {
    public int firstUniqChar(String s) {
        char[] c = s.toCharArray();
        for(int i = 0; i < c.length; i++) {
            int count = 0;
            for(int j = 0; j < c.length; j++) {
                if(i != j && c[i] == c[j]) {
                    count++;
                    break;
                }
            }
            if(count == 0) {
                return i;
            }
        }
        return -1;
    }
}
