class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int[] charIndex = new int[128];
        int maxlength = 0;
        int left = 0;
        Arrays.fill(charIndex , -1);

        for(int right = 0; right < n; right++){
            if(charIndex[s.charAt(right)] >= left){
                left = charIndex[s.charAt(right)] + 1;
            }

            charIndex[s.charAt(right)] = right;
            maxlength = Math.max(maxlength, right - left + 1);
        }

        return maxlength;

    }
}