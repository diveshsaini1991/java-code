package methods;

import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {//variable length arguments
        fun(1,213,44,5,45,54,54,65,54);
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
