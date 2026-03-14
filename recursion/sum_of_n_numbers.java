import java.util.Scanner;
public class sum_of_n_numbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a n number: ");
        int n=sc.nextInt();
        sc.close();
        int result=print1(n);
        System.out.println(result);
    }
    static int print1(int n){
        if(n<1)
            return 0;
        return n+print1(n-1);
    

    }
    
}
