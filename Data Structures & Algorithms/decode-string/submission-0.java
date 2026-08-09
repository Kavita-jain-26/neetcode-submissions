class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        String result =""; 

        for(int i = 0; i < s.length() ; i++){
            if(s.charAt(i) != ']'){
                stack.push(s.charAt(i));
            }else{
                String temp = "";
              while(stack.peek() != '['){
                temp = stack.pop()+temp;
              }
              stack.pop(); //for [ char
              String numStr = "";
              while (!stack.isEmpty() && Character.isDigit(stack.peek())) { numStr = stack.pop() + numStr;
               } 
              int num = Integer.parseInt(numStr);
              String new_str = "";
                 while(num >0){
                 new_str += temp; 
                 num--;
                 }
              
               for (int j = 0; j < new_str.length(); j++) { 
                stack.push(new_str.charAt(j)); 
                }


            }
        }
        while (!stack.isEmpty()) { result = stack.pop() + result; }
        return result;
    }
}