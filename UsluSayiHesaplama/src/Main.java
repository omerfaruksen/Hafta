import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayi, us;
        Scanner info=new Scanner(System.in);
        System.out.print("Taban sayısını giriniz : ");
        sayi= info.nextInt();
        System.out.print("Üs sayısını giriniz : ");
        us= info.nextInt();
        int total=1;
        for (int i=1; i<=us; i++){
            total*=sayi;
        }
        System.out.println("Sonuç = " +total);
    }
}