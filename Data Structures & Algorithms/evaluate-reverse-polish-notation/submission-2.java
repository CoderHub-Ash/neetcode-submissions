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

            stack.push(applyOperation(t,num2,num1));
        }

        return stack.pop();
    }

    public int applyOperation(String t, int num2, int num1)
    {
        int res = 0;

        switch(t)
        {
            case "/":
                res = num1/num2;
                break;
            case "*":
                res = num2*num1;
                break;
            case "+":
                res = num2+num1;
                break;
            case "-":
                res = num1-num2;
                break;
        }

        return res;
    }
}
