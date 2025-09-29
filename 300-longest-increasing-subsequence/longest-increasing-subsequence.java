class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] tails = new int[nums.length];
        int n = 0;

        for(int x : nums){
            int i = 0, j = n;
            
            while(i != j){
                int mid = i + (j - i) / 2;

                if(tails[mid] < x)  i = mid + 1;
                else    j = mid;
            }

            tails[i] = x;
            if(i == n)  n++;
        }
        
        return n;
    }
}