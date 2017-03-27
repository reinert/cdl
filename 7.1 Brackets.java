import java.util.*;

class Solution {
    public int solution(String S) {
        if (S == null || S.isEmpty())
            return 1;
        
        final Deque<Character> q = new ArrayDeque<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (isCloser(c)) {
                if (q.isEmpty())
                    return 0;
                    
                char lastC = q.pop();
                if (lastC != matchingOpener(c))
                    return 0;
            } else {
                q.push(c);
            }
        }
        
        return q.isEmpty() ? 1 : 0;
    }
    
    static boolean isCloser(char c) {
        return c == ')' || c == ']' || c == '}';    
    }
    
    static char matchingOpener(char c) {
        switch (c) {
            case ')': return '(';
            case ']': return '[';
            case '}': return '{';
            default: return '!';
        }
    }
}
