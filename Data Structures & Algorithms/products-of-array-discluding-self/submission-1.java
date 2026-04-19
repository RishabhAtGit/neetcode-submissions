class Solution {
    public int[] productExceptSelf(int[] nums) {
       int [] res = new int[nums.length];
       res[0] = 1;
       for(int it = 1; it < nums.length; it++){
            res[it] = nums[it - 1] * res[it-1];
       }
       int postfix = 1;
       for(int it = nums.length-1; it >= 0; it--){
           res[it] *= postfix;
           postfix *= nums[it];
       } 
       return res;
    }
}
// [1,1,2,8]
// [48,24,6,1]