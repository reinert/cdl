import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] H) {
        Deque<Integer> d = new ArrayDeque<>();
        int c = 0;
        
        for (int h : H) {
            while (!d.isEmpty()) {
                int head = d.pop();
                if (head < h) {
                    d.push(head);
                    break;
                } else if (head == h) {
                    c--;
                    break;
                }
            }
            
            d.push(h);
            c++;
        }
        
        return c;
    }
}
