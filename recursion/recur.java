import java.util.Scanner;

public class recur {
    
   static int a=1;
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    sc.close();
    print1(n);
    }
    
    static void print1(int n){
       
        System.out.println("Hello");
        a++;
        if(a>n){
            return;
        }
        else{
        print1(n);
        a++;
        }
    }
}