class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if(s.length() == 0 || s == null)    return res;

        int[] alphabet = new int[26];
        for(char c : p.toCharArray()){
            alphabet[c - 'a']++;
        }

        int right = 0;
        int left = 0;
        int count = p.length();

        while(right < s.length()){
            if(alphabet[s.charAt(right++) - 'a']-- >= 1)    count--;

            if(count == 0)  res.add(left);

            if(right - left == p.length() && alphabet[s.charAt(left++) - 'a']++ >= 0)   count++;
        }

        return res;
    }
}