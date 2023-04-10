public class casting {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a';
        short s = 123;
        int i = 123456;
        float f = 12.2f;
        double d = 0.2345678;
        double result= (f * b) + (i /c) - (d * s);
        System.out.println((f * b) +" "+ (i /c) + " "
        + (d * s));
        System.out.println(result);
    }

}