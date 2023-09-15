import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //Değişkenler tanımlandı
        int n,r,fark;
    //Kullanıcıdan veriler alındı
        Scanner info=new Scanner(System.in);
        System.out.print("C(n,r) : n değerini girin :");
        n= info.nextInt();
        System.out.print("C(n,r) : r değerini girin :");
        r= info.nextInt();
        int total1 =1, total2=1,total3=1;
        fark=n-r;
    //(n-r)! in sıfırdan küçük olma durumu test edildi.
        if (fark<=0){
            System.out.println("HATALI GİRİŞ YAPTINIZ!");
        }
    //Döngüler başlatıldı
        for (int i=1; i<=n; i++){
            total1=total1*i;
        }
        for (int k=1; k<=r; k++){
            total2=total2*k;
        }
        for (int j=1; j<=fark; j++){
            total3=total3*j;
        }
        System.out.println("C(n,r) Kombinasyonu :  " +total1/(total2*total3));
    }
}