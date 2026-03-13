import java.util.Scanner;
public class lin_num2 {
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a the N number: ");
        int n=sc.nextInt();
        sc.close();
        print1(1,n);

    }
    static void print1(int c,int n){
        if(c>n)
            return;
        else{
            print1(c+1,n);
            System.out.println(c);
           
        }
    }
    
}
