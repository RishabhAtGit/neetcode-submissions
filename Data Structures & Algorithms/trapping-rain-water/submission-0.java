class Solution {
    public int trap(int[] height) {
        int length = height.length;
        int trappedWater = 0;
        for(int i  = 0; i < length; i++){
            int leftMax = height[i];
            int rightMax = height[i];

            for(int j = 0; j < i; j++){
                leftMax = Math.max(leftMax,height[j]);
            }

            for(int j = i + 1; j < length; j++){
                rightMax = Math.max(rightMax, height[j]);
            }

            trappedWater += Math.min(leftMax,rightMax) - height[i];
        }
        return trappedWater;
    }
}
