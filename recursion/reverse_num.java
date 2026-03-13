import java.util.Scanner;;
public class reverse_num {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n number: ");
        int n=sc.nextInt();
        sc.close();
        print1(n);
    }
    static void print1(int n){
        if(n==0)
            return;
        System.out.println(n);
         print1(n-1);
        
    }
    
}
