import java.util.Scanner;
public class primenum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        prime(num);
        sc.close();
    }
    static void prime(int num){
        if(num<=1){
            System.out.println("Not a prime number");
        }
        
        for(int i=2;i<num;i++){
            if(num%i==0){
                System.out.println("Not a prime number");
                return;
                 }
        }
        System.out.println("prime number: ");
    }
}
