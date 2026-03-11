import java.util.Scanner;
public class gcd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter the Seconnd number: ");
        int n2=sc.nextInt();
        int num=Math.max(n1, n2);
        int result=gcd1(n1,n2,num);
        System.out.println(result);
        sc.close();
      
        

    }
    static int gcd1(int n1,int n2,int num){
        int gcd=1;
        for(int i=1;i<=num;i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
           
        } return gcd;
    }
    
}
