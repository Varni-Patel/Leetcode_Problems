class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;

        for(char a : s.toCharArray())   res ^= a;
        for(char b : t.toCharArray())   res ^= b;

        return res;
    }
}