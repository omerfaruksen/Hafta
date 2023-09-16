import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan sayıyı alalım.
        int n, total=0;
        Scanner info=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        n= info.nextInt();
        //for döngüsü yardımı ile girilen sayıya kadar bir döngü oluşturalım.
        // Döngü içerisinde if yardımı ile tam bölenleri ayıklayıp toplayalım.
        for (int i=1; i<n; i++) {
            if (n % i == 0){
                total+=i;
            }
        }
        //Girilen sayı ile ilgimi mükemmel olup olmadığını ekrana bastıralım.
        if (n==total) {
            System.out.println(n + " Sayısı Mükemmel Sayıdır.");
        }else {
            System.out.println(n +" Sayısı mükemmel sayı değildir.");
        }
    }
}