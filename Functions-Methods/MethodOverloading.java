import java.util.*;

//method overloading when functions have same name but have different arguments.
public class MethodOverloading {
    public static void main(String[] args) {
        demo(69); // here it will check the function with integer value and print op
        demo("Bablu"); //here it will check the function with string value and print op

       int ans = sum(3,4); // in this it will check function with two values
        System.out.println(ans);

        int solution = sum(3,4,5); // check function with three values
        System.out.println(solution);
    }
    static int sum(int a, int b){ // in this function we are adding two values only
        return a + b;
    }
    static int sum(int a, int b, int c){ //in this function we are adding three values
        return a + b+c;
    }
    static void demo(int a){
        System.out.println("first one");
        System.out.println(a);
    }
    static void demo(String v){
        System.out.println("Second one");
        System.out.println(v);
    }
}
