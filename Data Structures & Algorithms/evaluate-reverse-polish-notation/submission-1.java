class Solution {
    Stack<Integer> stack = new Stack<>();
    public int evalRPN(String[] tokens) {
        for(String ch: tokens)
        {
            if(ch.equals("+"))
            {
                stack.push(stack.pop()+stack.pop());
            }
            else if(ch.equals("*"))
            {
                stack.push(stack.pop()*stack.pop());
            }
            else if(ch.equals("-"))
            {
                int opr1=stack.pop();
                int opr2=stack.pop();
                stack.push(opr2-opr1);
            }
            else if(ch.equals("/"))
            {
                int opr1=stack.pop();
                int opr2=stack.pop();
                if(opr1==0)
                    stack.push(0);
                else
                    stack.push(opr2/opr1);
            }
            else{
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }
}
