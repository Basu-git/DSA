import java.util.Scanner;
public class count_digits{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    sc.close();
    digit(n);
    
}
static int digit(int n){
    int count=0;
    while(n>0){
        n=n/10;
        count++;

    }return count;
    
}
static int count_digit2(int n){
    int count=(int)(Math.log10(n))+1;
        return count;
}

}//Time complexity=O(log10(n))