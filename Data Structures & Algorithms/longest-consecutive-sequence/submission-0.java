class Solution {
    public int longestConsecutive(int[] nums) {
        int longest = 0;
        Set<Integer> numbers = new HashSet<>();
        for(int num : nums){
            numbers.add(num);
        }

        for(int num :  nums){
            int streak = 0, curr = num;
            while(numbers.contains(curr)){
                streak++;
                curr++;
            }
            longest = Math.max(streak,longest);
        }
        return longest;
    }
}
