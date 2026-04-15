class Solution {
    public double myPow(double x, int n) {
        System.out.println("n value is="+n);
        if(n == 0) return 1;
        if(n == 1)  return x;
        if(n <0){
         x = 1/x;
        n = -n; 
        }
        if((n%2) ==0){
            System.out.println("even case");
            return myPow(x*x,n/2);
        }else{
            System.out.println("odd case");
            return x*myPow(x*x,n/2);
        }
    }
}
