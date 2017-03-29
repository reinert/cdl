class Solution {
    public int solution(int[] A) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for (int i = 0; i < A.length; i++) {
            maxProfit = Math.max(maxProfit, A[i] - minPrice);
            minPrice = Math.min(minPrice, A[i]);
        }
        
        return maxProfit;
    }
}
