import java.util.Scanner;
   public class Challenge4 {
        public static void main(String[] args){
            int k=0;
            System.out.println("Bir Cümle Giriniz=>");
            Scanner a=new Scanner(System.in);
            String sentence=a.nextLine();

            for(int i=0;i<sentence.length();i++){ //ne kadar döneceğini bilmek için var
                if(sentence.charAt(i)==' ')
                    k++; //k önce boşlukları saymak için
            }
            System.out.println("Girilen Cümledeki Kelime Sayısı="+(k+1));//k+1 kelime sayısı
        }


    }






