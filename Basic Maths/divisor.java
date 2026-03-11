import java.util.Scanner;
public class divisor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        sc.close();
        printDivisors(num);
    }
    static void printDivisors(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0)
                System.out.print(i+" ");
        }
    }
}
