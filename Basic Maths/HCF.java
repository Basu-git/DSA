import java.util.Scanner;
public class HCF {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2=sc.nextInt();
        int num=Math.min(n1, n2);
        sc.close();
        int result=hcf(n1,n2,num);
        System.out.println("HCF is : "+result);
    }
    static int hcf(int n1,int n2,int num){
        int h=1;
        int cf=0;
        for(int i=1;i<=num;i++){
            if(n1%i==0 && n2%i==0){
                h=i;
                if(h>cf)
                    cf=h;
            }
        }return cf;

    }
}
