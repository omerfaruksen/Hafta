import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımladık
        int a,b,c,result;
        Scanner info=new Scanner(System.in);
        //Kullanıcıdan verileri aldık
        System.out.print("a sayısını girin : ");
        a= info.nextInt();
        System.out.print("b sayısını girin : ");
        b= info.nextInt();
        System.out.print("c sayısını girin : ");
        c= info.nextInt();
        result=a+b*c-b;
        //Sonucu ekrana bastırdık
        System.out.print("Sonuç: "+result);

    }
}