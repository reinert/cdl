// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
public int solution(int[] A, int[] B) {
  Deque<Integer> ds = new ArrayDeque<>();
  Deque<Integer> us = new ArrayDeque<>();
  
  for (int i = 0; i < A.length; i++) {
    if (B[i] == 1) {
      ds.push(i);
    } else {
      while (!ds.isEmpty() && A[ds.peek()] < A[i]) {
        ds.pop();
      }
      if (ds.isEmpty()) {
        us.push(i);
      }
    }
  }
  
  return ds.size() + us.size();
}
}
