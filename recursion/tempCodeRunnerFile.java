import java.util.Scanner;
public class linear_num {
public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a the N number: ");
        int n=sc.nextInt();
        sc.close();
        print1(1,n);

    }
    static void print1(int c,int n){
        System.out.println(c);
        if(c>=n)
            return;
        else{
             c++;
            print1(c,n);
           
        }
    }
    
}
