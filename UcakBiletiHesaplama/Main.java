import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Değişkenleri tanımlıyoruz
        int yas, km, select;
        double normalTutar, yasIndirimi1, yasIndirimi2, yasIndirimi3, indirimliTutar1,indirimliTutar2,indirimliTutar3;

        //Scanner sınıfı ile kullanıcıdan veri alıyoruz
        Scanner info=new Scanner(System.in);
        System.out.print("Gidilecek mesafe (km): ");
        km=info.nextInt();
        System.out.print("Yaşınız? : ");
        yas=info.nextInt();
        System.out.print("Yolculuk tipini seçiniz: \n1-Tek Yön: \n2-Gidiş Dönüş: ");
        select= info.nextInt();

        //Hesaplama ve formüllerimiz
        normalTutar= km *0.10;
        yasIndirimi1=normalTutar*0.50;
        yasIndirimi2=normalTutar*0.10;
        yasIndirimi3=normalTutar*0.30;
        indirimliTutar1=normalTutar-yasIndirimi1;
        indirimliTutar2=normalTutar-yasIndirimi2;
        indirimliTutar3=normalTutar-yasIndirimi3;

        //İf-Else koşullu ifadelerimiz
        if (yas<=12 && select==1 && km>0){
             System.out.print("Toplam Tutar: " +indirimliTutar1);
        } else if (yas<=12 && select==2 && km>0) {
            System.out.print("Toplam Tutar: " +((indirimliTutar1-(indirimliTutar1*0.20))*2));
        } else if (yas>12 && yas<=24 && select==1 && km>0) {
            System.out.print("Toplam Tutar: " +indirimliTutar2);
        } else if (yas>12 && yas<=24 && select==2 && km>0) {
            System.out.print("Toplam Tutar: " +((indirimliTutar2-(indirimliTutar2*0.20))*2));
        } else if (yas>=65 && select==1 && km>0) {
            System.out.print("Toplam Tutar: " +indirimliTutar3);
        } else if (yas>=65 && select==2 && km>0) {
            System.out.print("Toplam Tutar: " +((indirimliTutar3-(indirimliTutar3*0.20))*2));
        } else if (yas>24 && yas<65 && select==1 && km>0) {
            System.out.print("Toplam Tutar: " +normalTutar);
        } else if (yas>24 && yas<65 && select==2 && km>0) {
            System.out.print("Toplam Tutar: " +normalTutar*0.20*2);
        } else{
            System.out.print("HATALI GİRİŞ YAPTINIZ!");
        }


    }
}