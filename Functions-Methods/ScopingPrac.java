public class ScopingPrac {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String name = "Bablu";
        {
   //         int a = 30; // initialised outside the block in same method,can't initialise again
            a = 30; // can change the value inside the block
            int c = 40; // values initialised inside the block, remains in block only
            System.out.println(c);
            name = "Raj";
        }
         int c = 100; // initialised inside the block can be initialised outside too
         System.out.println(c); // cannot use c outside block
        System.out.println(a); // we can change the original value inside the block but can't initialise again
        System.out.println(name); // same with strings we can change value but can't initialise
    }
}
