class Solution {
    public long maximumSum(List<Integer> nums) {
        long res = 0;
        for (int k = 1; k <= nums.size(); k++) {
            long cur = 0;
            for (int v = 1; v * v * k <= nums.size(); v++)
                cur += nums.get(k * v * v - 1);
            res = Math.max(res, cur);
        }
        return res;
    }
}