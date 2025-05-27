import java.util.*;

//Additions of two numbers using void in which we are not returning anything.

public class Functions {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in);
        sum();
    }
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int add = a + b;
        System.out.println("Sum of two numbers is :" + add );
    }
}

