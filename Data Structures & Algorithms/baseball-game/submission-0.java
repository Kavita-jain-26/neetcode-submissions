
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int result  = 0;

        for(String s: operations){
            if(s.equals("+")){
                int first = stack.pop();
                int sum = first + stack.peek();;
                stack.push(first);
                stack.push(sum);

            } else if(s.equals("D")){
        
             stack.push(2*stack.peek());

            } else if(s.equals("C")){
                stack.pop();
            } else{
                stack.push(Integer.parseInt(s));
            }
        }

        for(int score: stack){
            result += score;
        }

        return result;
    }
}