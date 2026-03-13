public class recur {

    public static void main(String[] args){
        print1();
    }
    static void print1(){
        System.out.println("Hello");
        print1();
    }
}