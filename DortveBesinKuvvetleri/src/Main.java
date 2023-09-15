import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       //Değişkenler tanımlandı
       int x;
       //Kullanıcıdan veri alındı
       Scanner info=new Scanner(System.in);
       System.out.print("Sayı Girin : ");
       x=info.nextInt();
       //Döngüler başladı
       for( int i=1; i<x; i*=4){
           System.out.println("4'ün kuvvetleri : " +i );
       }
       for (int j=1; j<x; j*=5){
           System.out.println("5 in kuvvetleri : "+j );
       }
    }
}