package methods;

public class shadowing {
    static int x =10;
    public static void main(String[] args) {
        System.out.println(x);//10
        int x;
//      System.out.println(x); here value is not initilised yet
        x=100;
        System.out.println(x);//100
        fun();
    }
    static void fun(){
        System.out.println(x);//10

    }
}
