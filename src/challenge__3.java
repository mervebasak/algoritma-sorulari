import java.util.Scanner;
public class challenge__3 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        int sayi = c.nextInt();
        for (int i = 1; i < sayi; i += 2) {
            for (int k = 0; k < (4 - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int m = sayi-3; m>0 ; m-=2) {
            for (int l =(m-4)/2; l>0  ; l--) {
                System.out.println(" ");

            }
            for (int d = m; d >0 ; d--) {
                System.out.print("*");

            }
            System.out.println("");

        }


    }
}