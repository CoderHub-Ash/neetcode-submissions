class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack();

        for(String t: tokens)
        {
            if(!"/*+-".contains(t))
            {
                stack.push(Integer.valueOf(t));
                continue;
            }

            int num2 = stack.pop();
            int num1 = stack.pop();

            stack.push(evalOperation(t, num1, num2));
        }

        return stack.pop();
    }

    public int evalOperation(String t, int num1, int num2)
    {
        int result = 0;
        switch(t)
        {
            case "/":
                result = num1/num2;
                break;

            case "*":
                result = num1*num2;
                break;
            
            case "+":
                result = num1+num2;
                break;

            case "-":
                result = num1-num2;
                break;
        }

        return result;
    }
}
