//Leetcode question - Build an Array With Stack Operations

class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack s = new Stack();
        int len = target.length - 1;
        int j = 0;
        for(int i = 1; i <= n; i++) {
            s.push("Push");
            if(i != target[j]) {
                s.push("Pop");
            } else {
                j++;
            }
            if(len < j) {
                break;
            }
        }
        return s;
    }
}
