public class Pattern5 {
    public static void main(String arg[]){
        int n = 4;
        int m = 4;

        for(int i=0; i<=n; i++){
            for(int j=1; j<=i;j++){
                i=i++;
                System.out.print(j);
            }
            System.out.println();
        }
    }
}