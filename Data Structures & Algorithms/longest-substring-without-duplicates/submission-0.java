class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0, max = 0;
        for(int right = 0; right < s.length(); right++){
            Character currentChar = s.charAt(right);
            if(charMap.containsKey(currentChar)){
                left = Math.max(left,charMap.get(currentChar)+1);
            }
            charMap.put(currentChar,right);
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}
