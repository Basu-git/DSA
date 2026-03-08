import java.util.Scanner;
public class patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter rows: ");
            int n=sc.nextInt();
            print16(n);
            sc.close();

    }
    static void print1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void print2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void print3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void print4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void print5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void print6(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void print7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void print8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void print9(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void print10(int n){
        for(int i=0;i<n;i++){
           for(int j=0;j<=i;j++){

               System.out.print("* ");
           }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            } System.out.println();
        }
    }
    static void print11(int n){
        for(int i=0;i<n;i++){
            int start;
            if(i%2==0)start=0;
            else start=1;
            for (int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
            }
            System.out.println();
        }
    }
    static void print12(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<2*n-2*i+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    static void print13(int n){
        int start=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){

                System.out.print(start+" ");
                start++;

            }
            System.out.println();
        }
    }
    static void print14(int n){
        for(int i=0;i<n;i++){
            for(char ch='A';ch<'A'+n-i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    static void print15(int n){
        char ch;
        for (int i=0;i<n;i++){
            ch=(char)('A'+i);
            for (int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    static void print16(int n){
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // increasing letters
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }

            // decreasing letters
            for (int j = i - 2; j >=~ 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }
    }
}