class Solution {
    public int reverseBits(int n) {
        // int ans = 0;

        // for(int i = 0 ; i < 32 ; i++){
        //       ans= ans <<1;
        //     if( ((n>>i) &1) == 1){
        //         ans = ans|1;
               
        //     }
          
        // }
        // return ans;

           int ans = 0;
    for(int i=0;i<32;i++){
        int lsb = n & 1 ;
        int temp= lsb<<(31-i);
        ans = ans|temp;
        n = n>>1;
    }
    return ans;

    }
}
