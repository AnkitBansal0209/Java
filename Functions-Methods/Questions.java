import java.util.*;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
          int num = sc.nextInt();
//        boolean ans = isPrime(num);
//
//        System.out.println(ans);
        //boolean ans = ArmsNum(num);
        System.out.println(ArmsNum(num));
    }
    //check number is prime or not

    static boolean isPrime(int n){
        if(n <= 1) {
            return false;
        }
    for(int i =2; i<= Math.sqrt(n);i++){ // if we use n-1 instead of square root TC is O(n) but here it is O(sqrt n)
        if(n % i==0){
            return false;
        }
    }
    return true;
    }

    // SUM OF THREE DIGIT ARMSTRONG NUMBER
    static boolean ArmsNum(int n){
        int original = n;
        int sum = 0;
        while(n>0) {
            int temp = n % 10;
            n = n/10;
             sum = sum + temp*temp*temp;

        }
        return sum == original;
    }

}

