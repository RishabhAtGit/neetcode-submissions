class Solution {
    public int maxArea(int[] heights) {
        int length = heights.length;
        int maxArea = 0;
        for(int i  = 0; i < length - 1; i++){
            for(int j = 1; j < length; j++){
                maxArea = Math.max(maxArea,Math.min(heights[i],heights[j]) *(j-i));
            }
        }
        return maxArea;
    }
}
