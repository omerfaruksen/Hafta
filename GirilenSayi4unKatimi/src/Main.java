import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     //Değişkenleri tanımlayalım
     int n, sayac=0;
     int total=0;
     //Kullanıcıdan verileri alalım
     Scanner inp=new Scanner(System.in);
     //Döngümüze başlayalım
     do {
         System.out.print("Sayı giriniz :  ");
         n= inp.nextInt();

         if (n%4==0) {
             total += n;
             sayac = sayac + 1;
         }
     }while (n%2==0);
        System.out.println("Toplam:  " +total);
        System.out.println("Ortalama:  " +total/sayac);
    }
}