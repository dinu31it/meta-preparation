package problemsolving;

import java.util.Stack;

public class BalancedStringTest {
    public static void main(String[] args) {
        String str = "[{()}]";
        System.out.println("it is balanced tree: "+isBalancedString(str));
    }

    public static boolean isBalancedString(String str){
        Stack<Character> stack = new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()) return false;
                char last = stack.pop();
                if((ch == ')' && last != '(')
                    || (ch == '}' && last != '{')
                    || (ch == ']' && last != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
