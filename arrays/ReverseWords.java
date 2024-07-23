//Leetcode question - Reverse Words in a String

class Solution {
    public String reverseWords(String s) {
        String[] array = s.trim().split(" +");
        Collections.reverse(Arrays.asList(array));
        return String.join(" ", array);
    }
}
