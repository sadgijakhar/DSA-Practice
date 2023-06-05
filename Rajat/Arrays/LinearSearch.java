
class Solution{
    static int searchInSorted(int arr[], int N, int K)
    {
        
        // Your code here
        for(int a:arr){
            if(a==K)return 1;
        }
        return -1;
        
    }
}