class Compute {
    
    public int largest(int arr[], int n)
    {
        int x=Integer.MIN_VALUE;
        for(int a:arr){
            if(x<a) x=a;
        }
        return x;
    }
}