import java.util.*;

//Additions of two numbers using int in which method must be returning int value

public class Functions2 {
    public static void main(String[] args){
        int ans = sum();
        System.out.println(ans);
    }
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        return sum; // important to return except void
    }
}
