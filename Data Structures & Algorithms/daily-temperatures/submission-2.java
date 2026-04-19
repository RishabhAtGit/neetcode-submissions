class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        Stack<int[]> st = new Stack<>();
        int[] result = new int[len];
        for(int i = 0; i < len; i++){
            while(!st.isEmpty() && temperatures[i] > st.peek()[0]){
                int [] pair = st.pop();
                result[pair[1]] = i - pair[1];
            }
            st.push(new int[]{temperatures[i],i});
        }
        return result;
    }
}
