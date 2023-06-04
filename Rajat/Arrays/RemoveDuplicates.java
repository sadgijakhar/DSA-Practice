class Solution {
    int remove_duplicate(int A[],int N){
        // code here
        int j=0;
        int i=0;
        while(j<A.length){
            if(A[j]==A[i]){
                j++;
            }
            else{
                i++;
                A[i]=A[j];
            }
        }
        return i+1;
    }
}
