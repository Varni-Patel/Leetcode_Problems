class Solution:
    def maximumSum(self, nums: List[int]) -> int:
        count = Counter()
        for i in range(len(nums)):
            x, v = i + 1, 2
            while x >= v * v:
                while x % (v * v) == 0:
                    x //= v * v
                v += 1
            count[x] += nums[i]
        return max(count.values())