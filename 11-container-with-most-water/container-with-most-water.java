class Solution {
    public int maxArea(int[] height) {
        int first = 0;
        int last = height.length - 1;
        int res = 0, ans = 0;

        while(first <= last){
            if(height[first] <= height[last]){
                res = height[first] * (last - first);
                first++;
            }

            else{
                res = height[last] * (last - first);
                last--;
            }

            if(res > ans)   ans = res;
        }
        
        return ans;
    }
}