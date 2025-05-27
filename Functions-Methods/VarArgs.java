import java.util.*;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,5,6);
        strArr(20,40,"Bablu","Bunty", "Parkash");
    }
    static void strArr(int a, int b, String ...x){ // ...variable can be used to input as many as values we want (3 dots only)
        System.out.println();

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
