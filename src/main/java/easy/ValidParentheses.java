package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ValidParentheses {

    public boolean isValid(String s) {
        var parentheses = Map.of('(', ')', '[', ']', '{', '}');
        List<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (parentheses.containsKey(s.charAt(i))) {
                stack.add(0, s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                Character topElement = stack.remove(0);
                if (parentheses.get(topElement) != s.charAt(i)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

/*Another cool solution
*
* class Solution {
    public boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}
}
*
* */
