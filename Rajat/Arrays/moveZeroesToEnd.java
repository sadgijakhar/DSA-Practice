class Solution {
    void pushZerosToEnd(int[] arr, int n) {
        // code here
        int i=0;
        for(int a:arr){
            if(a!=0){
                arr[i]=a;
                i++;
            }
        }
        
        while(i<arr.length){
            arr[i++]=0;
            
        }
    }
}