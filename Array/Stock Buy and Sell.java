class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
         int min = 100;
         int el = 0;
        for(int i=0;i<n;i++){      
            if(arr[i]<min){
                min = i;
                el = arr[i];
                continue;
            }     
        }
        int max = -1;
        for(int i=min;i<n;i++){
            if(arr[i]>max){
                max =arr[i]; 
            }
        } int profit = max - el;
        return profit;
    }
}
