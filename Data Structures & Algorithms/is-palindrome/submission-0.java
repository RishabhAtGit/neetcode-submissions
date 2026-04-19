class Solution {
    public boolean isPalindrome(String s) {
        String temp = s.toUpperCase();
        StringBuilder sb = new StringBuilder();
        for(char ch : temp.toCharArray()){
            if(ch == ' ') continue;
            if(isAlphaNumberic(ch)){
                sb.append(ch);
            }
        }
        temp = sb.toString();
        int start  = 0, end = temp.length()-1;
        while(start <= end){
            if(temp.charAt(start) != temp.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private boolean isAlphaNumberic(char ch){
        return ((ch >='A' && ch <= 'Z') || (ch >= '0' && ch <= '9'));
    }
}
