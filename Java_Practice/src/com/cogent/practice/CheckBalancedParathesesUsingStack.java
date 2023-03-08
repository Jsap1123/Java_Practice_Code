package com.cogent.practice;

import java.util.Stack;

public class CheckBalancedParathesesUsingStack {

	static boolean areBracketsBalanced(String expression)
    {
		Stack<Character> stack = new Stack<>();
        // Traversing the Expression
        for (int i = 0; i < expression.length(); i++) {
            char x = expression.charAt(i);
            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
                continue;
            }
            //If current character is not opening bracket, then it must be closing. 
            //Stack cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
        return (stack.isEmpty());
    }
 
    public static void main(String[] args)
    {
        String expression = "{({[{}]})}";
 
        if (areBracketsBalanced(expression))
            System.out.println("Brackets are Balanced");
        else
            System.out.println("Brackets are Not Balanced");
    }

}
