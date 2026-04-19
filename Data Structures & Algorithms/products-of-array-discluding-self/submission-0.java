class Solution {
    public int[] productExceptSelf(int[] nums) {
       int [] arr1 = new int[nums.length];
       int [] arr2 = new int[nums.length];
       arr1[0] = 1;
       for(int it = 1; it < nums.length; it++){
            arr1[it] = nums[it - 1] * arr1[it-1];
       } 
       arr2[nums.length -1] = 1;
       for(int it = nums.length-2; it >= 0; it--){
            arr2[it] = nums[it+1] * arr2[it+1];
       } 

       int [] res = new int[nums.length];
       for(int it  = 0 ; it < nums.length ; it++){
         res[it] = arr1[it]*arr2[it];
       }
       return res;
    }
}
// [1,1,2,8]
// [48,24,6,1]