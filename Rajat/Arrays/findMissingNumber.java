//brute force approch

// class Compute {
    
//     public static int missingNumber(int A[], int N)
//     {
//         int[] arr=new int[N-1];
//         Arrays.sort(A);
//         int i=0;
//         for(int a:A){
//             if(a!=0){
//                 arr[i]=a;
//                 i++;
//             }
//         }
        
        
//         i=1;
        
//         for(int x:arr){
//         if(x!=i){
//             break;
//         }
//         i++;
//         }
//         return i;
        
//     }
// }

//optimiszed soln

class Compute {
    
    public static int missingNumber(int A[], int N)
    {
        int sum = (N*(N+1))/2;
        for(int a :A){
            sum-=a;
        }
        
        return sum;
        
    }
}