import java.util.Arrays;
public class reverse_arr{
    static int[] arr={1,2,3,4,5,6};
    public static void main(String[] args){
        //print1(0,arr.length-1);
        //print2(0,arr.length);
       code(arr,arr.length);
       System.out.println(Arrays.toString(arr));
 
    }
    /*
    static void print1(int f,int r){
        if(f>=r)
            return;
        int temp = arr[f];
        arr[f] = arr[r];
        arr[r] = temp;
        print1(f+1,r-1);

    }*/
   /*
   static void print2(int f,int n){
    if(f>=n/2)
        return;
    int temp=arr[f];
    arr[f]=arr[n-f-1];
    arr[n-f-1]=temp;
    print2(f+1,arr.length);
   }
    */

   //Code studio problem
   static void code(int[] arr,int n){
        helper(arr,n,0);
   }
   private static void helper(int[] arr,int n,int i){
    if(i>=n/2)
        return;
   
   int temp=arr[i];
   arr[i]=arr[n-i-1];
   arr[n-i-1]=temp;
   helper(arr,n,i+1);
    }
}
