class Solution {
    //https://algo.monster/liteproblems/43
    //and neecode video
    public String multiply(String num1, String num2) {
        if("0".equals(num1) || "0".equals(num2)) return "0";

        int length1 = num1.length();
        int length2 = num2.length();
        int[] res  = new int[length1+length2];

        for(int i = length1-1 ; i >=0 ; i--){
            int digit1 = num1.charAt(i)-'0';
            for(int j = length2-1; j >=0 ; j--){
                int digit2 = num2.charAt(j)-'0';
                res[i+j+1] += digit1*digit2;
            }
        }

        for(int i = res.length-1; i>0 ; i-- ){
            res[i-1] += res[i]/10;
            res[i] = res[i]%10;
        }

        int start = res[0]==0?1:0;

        StringBuilder sb = new StringBuilder();
        for(int i =start; i<res.length ; i++ ){
            sb.append(res[i]);
        }

        return sb.toString();
    }
}
