public class secLargestElement {
    public static void main(String[] args) {
        int[] arr={1,23,4,5,6,8,4,2,9};
        int m=Integer.MIN_VALUE;
        int s=Integer.MIN_VALUE;
        for(int a:arr){
            if(m<a)m=a;
        }
        for(int a:arr){
            if(s<a && m!=a)s=a;
        }
        System.out.println(s);
    }
    
}
