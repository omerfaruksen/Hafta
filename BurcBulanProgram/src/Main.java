import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenlerimizi tanımlıyoruz
        int month, day;
        //Kullanıcıdan verileri alıyoruz
        Scanner info=new Scanner(System.in);


        System.out.print("Doğduğunuz ayı giriniz: ");
        month= info.nextInt();
        System.out.print("Doğum gününüzü giriniz: ");
        day= info.nextInt();
        //Koşullu çıktılarımız
        if((month<=12 && month>=1) && (day>=1 && day<=31)){
            if (month==1){
                if (day>1 && day<=21){
                    System.out.print("Burcunuz : OĞLAK BURCU");
                }else {
                    System.out.print("Burcunuz : KOVA BURCU");
                }
            } else if (month==2) {
                if (day>1 && day<=19){
                    System.out.print("Burcunuz : KOVA BURCU");
                }else {
                    System.out.print("Burcunuz : BALIK BURCU");
                }

            } else if (month==3) {
                if(day>1 && day<=20){
                    System.out.print("Burcunuz : BALIK BURCU");
                }else {
                    System.out.print("Burcunuz : KOÇ BURCU");
                }

            } else if (month==4) {
                if (day>1 && day<=20){
                    System.out.print("Burcunuz : KOÇ BURCU");
                }else {
                    System.out.print("Burcunuz : BOĞA BURCU");
                }

            } else if (month==5) {
                if (day>1 && day<=21){
                    System.out.print("Burcunuz : BOĞA BURCU");
                }else {
                    System.out.print("Burcunuz : İKİZLER BURCU");
                }

            } else if (month==6) {
                if (day>1 && day<=22){
                    System.out.print("Burcunuz : İKİZLER BURCU");
                }else {
                    System.out.print("Burcunuz : YANGEÇ BURCU");
                }

            } else if (month==7) {
                if (day>1 && day<=22){
                    System.out.print("Burcunuz : YENGEÇ BURCU");
                }else {
                    System.out.print("Burcunuz : ASLAN BURCU");
                }

            }else if (month==8){
                if (day>1 && day<=22){
                    System.out.print("Burcunuz : ASLAN BURCU");
                }else {
                    System.out.print("Burcunuz : BAŞAK BURCU");
                }
            } else if (month==9) {
                if (day>1 && day<=22){
                    System.out.print("Burcunuz : BAŞAK BURCU");
                }else {
                    System.out.print("Burcunuz : TERAZİ BURCU ");
                }

            } else if (month==10) {
                if(day>1 && day<=22){
                    System.out.print("Burcunuz : TERAZİ BURCU");
                }else {
                    System.out.print("Burcunuz : AKREP BURCU");
                }

            } else if (month==11) {
                if (day>1 && day<=21){
                    System.out.print("Burcunuz : AKREP BURCU");
                }else {
                    System.out.print("Burcunuz : YAY BURCU");
                }
                
            } else if (month==12) {
                if (day>1 && day<=21){
                    System.out.print("Burunuz : YAY BURCU");
                }else {
                    System.out.print("Burcunuz : OĞLAK BURCU");
                }

            }
        }

    }
}