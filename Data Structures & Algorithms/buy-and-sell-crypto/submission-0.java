class Solution {
    public int maxProfit(int[] a) {
        
    int profit = 0, sell = 0 , buy = a[0];
    
    for(int i = 1 ; i < a.length; i++){
       if(a[i]- buy > profit){
       
       profit = a[i] - buy;
       sell = a[i]; 
       }
       else if(buy > a[i]){
        buy = a[i];
       }

    }
    return profit;
    


    }
}
