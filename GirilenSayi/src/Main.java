
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Değişkenleri tanımlayalım
        int k, total=0, sayac=0;
        //Kullanıcıdan veri alalım
        Scanner info=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz :");
        k= info.nextInt();
        //Döngümüzü başlatalım
        for (int i=1; i<=k; i++){
            if (i%3==0 && i%4==0) {
                
                total=total+i;
                sayac=sayac+1;
            }

        }System.out.println("ortalma: " +(total/sayac));
    }
}