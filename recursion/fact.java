import java.util.Scanner;
public class fact {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        sc.close();
       System.out.println(print1(n));
    }
    static int print1(int n){
    if(n<0)
        return 0;
    else if(n==0)
        return 1;
    else
        return n*print1(n-1);
    }
    
}
