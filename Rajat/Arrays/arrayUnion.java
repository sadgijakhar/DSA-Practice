import java.util.*;

class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> arr= new ArrayList<Integer>();
        
        int i=0;
        int j=0;
        int k=0;
        
        int[] res=new int[n+m];
        
        while(i<n && j<m){
            if(arr1[i]<=arr2[j]){
                res[k]=arr1[i];
                i++;
                k++;
            }
            else{
                res[k]=arr2[j];
                j++;
                k++;
            }
                
        }
        
        while(i<n){
            res[k]=arr1[i];
            k++;
            i++;
        }
        
        while(j<m){
            res[k]= arr2[j];
            k++;
            j++;
            
        }
        
        
        int curr=Integer.MIN_VALUE;
        for(int pos=0; pos<n+m;pos++){
            if(curr!=res[pos]){
                arr.add(res[pos]);
            }
            curr=res[pos];
            
        }
        return arr;
        
    }
        
       
        
        
}