import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number: ");
    int n=sc.nextInt();
    int num2=n;
    sc.close();
    pal(n);
    int result=pal(n);
    System.out.println(result==num2);
    }
    static int pal(int n){
        int rev=0;
        while(n>0){
            int a=n%10;
            rev=rev*10+a;
            n=n/10;

            
        }return rev;
    }
}
