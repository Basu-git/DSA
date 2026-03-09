import java.util.Scanner;;
public class reverse_number {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        sc.close();
        int result=revers(n);
        System.out.println("The reverseed digit "+result);
    }
    static int revers(int n){
        int rvr=0;
        while(n>0){
            int num=n%10;
            rvr=rvr*10+num;
            n=n/10;
        }
        return rvr;
    }
}
