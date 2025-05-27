import java.util.*;

// simple code to understand aruguments in methods

public class ArgumentsUsage {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(sum(num1,num2)); // with taking input from user


        int output = sum(20,40);
        System.out.println(output); // by taking input by own

        System.out.println(gift("Ankit")); // for strings by taking input by own

       System.out.println("Enter your name: "); // strings by taking user input
        String drop_here = sc.next();
        String happy = gift(drop_here);
        System.out.println(happy);

    }
    static int sum(int a, int b){ //arguments
        int sum = a+b;
        return sum;
    }

    static String gift(String name){ //example of string argument
        String message = name +", You are precious";
        return message;
    }
}
