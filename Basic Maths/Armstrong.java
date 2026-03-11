import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numberr: ");
        int n=sc.nextInt();
        if(armst(n)==n){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not a Armstrong number");
        }
        sc.close();

    }
    static int armst(int n){
        int temp=n;
        int count=0;
        int  sum=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
         temp=n;
        while(temp>0){
            int a=temp%10;
            sum+=(Math.pow(a, count));
            temp=temp/10;
        }return sum;
    }
    
    
}
