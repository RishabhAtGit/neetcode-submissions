class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLongest = 0;
        Arrays.sort(nums);
        int length = nums.length;
        int currLongest = 1;
        for(int i  = 0; i < length -1; i++){
            if(nums[i] == nums[i+1]){
                continue;
            }else if(nums[i] + 1 == nums[i+1]){
                currLongest++;
            }else{
                maxLongest = Math.max(currLongest,maxLongest);
                currLongest = 0;
            }
        }
        maxLongest = Math.max(currLongest,maxLongest);
        return maxLongest;

    }
}

// 2, 3, 4, 4, 5, 10, 20

//nums=[0,3,2,5,4,6,1,1]

// 0, 1, 1, 2, 3, 4, 5, 6

