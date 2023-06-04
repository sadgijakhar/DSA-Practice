class Solution
{
    static void swap(int a ,int b, long[] arr){
        while(a<b){
            long temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
            a++;
            b--;
        }
    }
    void leftRotate(long arr[], int k,int n)
    {
        if(k>n){
            k=k%n;
        }
        
        swap(0,k-1,arr);
        swap(k,arr.length-1,arr);
        swap(0,arr.length-1,arr);
        
        
    }
}