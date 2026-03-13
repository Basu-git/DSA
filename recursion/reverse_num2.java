import java.util.Scanner;
public class reverse_num2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a n number : ");
        int n=sc.nextInt();
        sc.close();
        print1(n,n);

    }
    static void print1(int c,int n){
        if(c-5>n)
            return;
        print1(c-1,n);
        System.out.println(c);
    }
    
}
