import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Değişkenler tanımlandı
        int mat, fizik, turkce,kimya,muzik;
        //Kullanıcıdan verileri alalım
        Scanner not=new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat=not.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik=not.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce=not.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya=not.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik=not.nextInt();
        //Formüller
        int total = 0;
        int dersSayisi = 0;
        //İstenilen veriler ve şartlar
        if (mat >= 0 && mat <= 100) {
            total = total + mat;
            dersSayisi = dersSayisi + 1;
        }

        if (fizik >= 0 && fizik <= 100) {
            total = total + fizik;
            dersSayisi = dersSayisi + 1;
        }

        if (kimya >= 0 && kimya <= 100) {
            total = total + kimya;
            dersSayisi = dersSayisi + 1;
        }
        if (turkce >= 0 && turkce <= 100) {
            total = total + turkce;
            dersSayisi = dersSayisi + 1;
        }

        if (muzik >= 0 && muzik <= 100) {
            total = total + muzik;
            dersSayisi = dersSayisi + 1;
        }

        double ort = total / dersSayisi;

        if (ort <= 55) {
            System.out.println("Ortalamanız: "+ort +"  Sınıfta Tekrarı!");
        } else {
            System.out.println("Ortalamanız: " +ort+"  Tebrikler, Sınıfı Geçtiniz !");
        }


    }
}
