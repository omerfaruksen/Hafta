import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişken tanımları yapıldı
        int numberInt;
        double numberDouble;
        //Kullanıcıdan veriler alındı
        Scanner info=new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı değeri giriniz. ");
        numberInt= info.nextInt();
        System.out.print("Lütfen ondalıklı bir sayı giriniz. (',' kullanınız.) ");
        numberDouble=info.nextDouble();
        //Dönüşümler yapıldı ve çıktılar verildi.
        System.out.println("Tamsayı değeri ondalıklı değere dönüştü : "+ (double)numberInt);
        System.out.print("Ondalıklı değer tamsayı değere dönüştü : " + (int)numberDouble);
    }
}