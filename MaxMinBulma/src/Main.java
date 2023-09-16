
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //değişkenleri tanımlayalım ve en küçük ve en büyük sayıyı sıfıra eşitleylim.
        int n, sayi, enBuyuk=0, enKucuk=0;
        Scanner info=new Scanner(System.in);
        //Kullanıcıdan verileri alalım
        System.out.print("Kaç adet sayı gireceksiniz? : ");
        n= info.nextInt();
        //for döngüsü ile girilecek sayı kadarlık bir döngü oluşturalım.(Döngünün kaç defa dönceğini biliyoruz.)
        for(int i=1; i<=n; i++){
            System.out.print(i +". Sayıyı giriniz: ");
            sayi= info.nextInt();
            //if ile girilen sayı en büyük sayı mı testini yapalım.
            // Girilen sayı en büyük ifade değil ise en büyük ifadeye girilen sayıyı atayalım.
            if (sayi>enBuyuk){
                enBuyuk=sayi;
            //else if ile girilen sayı eğer en büyük sayı değil ise en küçük sayı olup olmadığını test edelim.
            //Eğer girilen sayı en küçük sayıdan daha küçük ise en küçük sayıya girilen sayıyı atayalım.
            } else if (sayi<enKucuk) {
                enKucuk=sayi;
            }

        }
        //En son olarak çıktıralı ekrana bastıralım.
        System.out.println("Yazdığınız en büyük sayı: " +enBuyuk);
        System.out.print("Yazdığınız en küçük sayı: " +enKucuk);

    }
}