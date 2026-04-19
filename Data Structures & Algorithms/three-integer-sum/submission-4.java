class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> triplets = new HashSet<>();
        Arrays.sort(nums);
        int length = nums.length;
        for(int i = 0; i < length-2; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1, k = length -1;
            while(j < k){
                long sum = (long) (nums[i]+nums[j]+nums[k]);
                if(sum == 0){
                    triplets.add(new ArrayList<>(List.of(nums[i],nums[j],nums[k])));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                }else if (sum < 0){
                    j++;
                }else{
                    k--;
                }
            } 
        }
        return triplets.stream().collect(Collectors.toList());
    }
}
