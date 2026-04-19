class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> numCountMap = new HashMap<>();
        for(int num :  nums){
            numCountMap.put(num, numCountMap.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (n1,n2) -> numCountMap.get(n1) - numCountMap.get(n2));
        for(int n : numCountMap.keySet()){
            pq.add(n);
            if(pq.size() > k){
                pq.poll();
            }
        }

        int [] ans = new int[k];

        for(int i = 0; i < k; i++){
            ans[i] = pq.poll();
        }

        return ans;
    }
}
