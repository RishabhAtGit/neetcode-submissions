class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] result = new int[len];
        if(len == 1) {
            result[0] = 0;
            return result;
        }
        for(int i = 0;  i < len ; i++){
            for(int j = i+1; j < len; j++){
                if(temperatures[i] < temperatures[j]){
                    result[i] = j-i;
                    break;
                }
            }
        }
        result[len-1] = 0;
        return result;
    }
}
