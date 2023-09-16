import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Değişkenleri tanımlayalım
        int n, sayi1=0, sayi2=1, sayi3, total= 2;
        //Kullanıcıdan veri alalım
        System.out.print("Fibonacci Dizisi İçin Bir Değer Girin : ");
        n = scan.nextInt();
        System.out.print(sayi1 + " ");
        System.out.print(sayi2 + " ");
        while (total != n) {
            total++;
            sayi3 = sayi1 + sayi2;
            sayi1 = sayi2;
            sayi2 = sayi3;
            System.out.print(sayi3 + " ");
        }


    }
}