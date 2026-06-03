import java.util.Stack;

public class Stack_Q2 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int add1 = stack.pop();
                int add2 = stack.pop();
                stack.push(add1+add2);
            } else if (tokens[i].equals("-")) {
                int sub1 = stack.pop();
                int sub2 = stack.pop();
                stack.push(sub2-sub1);
            } else if (tokens[i].equals("*")) {
                int mult1 = stack.pop();
                int mult2 = stack.pop();
                stack.push(mult1*mult2);
            } else if (tokens[i].equals("/")) {
                int div1 = stack.pop();
                int div2 = stack.pop();
                stack.push(div2/div1);
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        int result = stack.pop();

        return result;
    }

    public static void main(String[] args) {
        Stack_Q2 solver = new Stack_Q2();
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};

        int result = solver.evalRPN(tokens);
        System.out.println(result);
        
    }
}
