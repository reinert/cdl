class Solution {
    public int solution(int[] A) {
        if (A.length == 0) return -1;
        
        int pos = 0;
        int count = 1;
        
        for (int i = 1; i < A.length; ++i) {
            if (A[pos] == A[i]) {
                count++;
            } else {
                count--;
            }
            
            if (count == 0) {
                pos = i;
                count = 1;
            }
        }
        
        count = 0;
        for (int n : A) {
            if (n == A[pos]) count++;
        }
        
        return count > (A.length / 2) ? pos : -1;
    }
}
