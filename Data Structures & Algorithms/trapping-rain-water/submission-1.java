class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int waterTrapped = 0;
        int left = 0, right = length - 1;
        int leftMax = height[left], rightMax = height[right];
        while(left < right){
             if(leftMax < rightMax){
                left++;
                leftMax= Math.max(leftMax,height[left]);
                waterTrapped += leftMax - height[left];
             }else{
                right--;
                rightMax = Math.max(rightMax,height[right]);
                waterTrapped += rightMax - height[right];
             }
        }
        return waterTrapped;
    }
}
