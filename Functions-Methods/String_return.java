import java.util.*;

// Simple code to understand returning string value

public class String_return {
    public static void main(String[] args){
        String message = greeting();
        System.out.println(message);
    }
    static String greeting(){
        String greet = "How are you, buddy";
        return greet;
    }
}
