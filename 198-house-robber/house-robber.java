class Solution {
  public int rob(int[] nums) {    
    if(nums.length == 0)  return 0;

    int pre = 0;
    int next = 0;

    for(int num : nums){
      int temp = pre;
      pre = Math.max(next + num, pre);
      next = temp;
    }

    return pre;
  }
}