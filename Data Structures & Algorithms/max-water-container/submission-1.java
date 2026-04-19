class Solution {
    public int maxArea(int[] heights) {
        int start = 0, end = heights.length - 1;
        int maxArea = 0;
        while(start < end){
            if(heights[end] < heights[start]){
                maxArea = Math.max(maxArea,heights[end]*(end-start));
                end--;
            }else{
                maxArea = Math.max(maxArea,heights[start]*(end-start));
                start++;
            }
        }
        return maxArea;
    }
}
