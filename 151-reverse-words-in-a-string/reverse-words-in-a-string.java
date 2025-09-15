class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" +");
        StringBuilder res = new StringBuilder();

        for(int i = word.length - 1; i >= 0; i--){
            res.append(word[i]);
            res.append(" ");
        }

        return res.toString().trim();
    }
}