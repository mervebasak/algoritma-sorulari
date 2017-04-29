import java.util.Scanner;

public class Challenge20 {
    public static void main(String[] args){
        Scanner klavye =new Scanner(System.in);
        int a=klavye.nextInt();
        int b=klavye.nextInt();
        System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz=>" +a);
        System.out.println("Dikdörtgenin uzun kenar uzunluğunu giriniz=>" +b);
        System.out.println("Dikdörtgenin alanı=>" +a*b);
    }
}
