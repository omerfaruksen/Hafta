import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        //Değişkenleri tanımlıyoruz
        int birthDay, kalan;

        //Scanner sınıfı ile kullanıcan veri alıyoruz
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı giriniz: ");
        birthDay=inp.nextInt();
        //Formülümüz
        kalan=birthDay%12;
        //switch Case yapısı ile alınan veriye uygun çıktıyı ekrana basıyoruz
        switch (kalan){
            case 0:
                System.out.print("Çin Zodyağı Burcunuz: MAYMUN ");
                break;
            case 1:
                System.out.print("Çin Zodyağı Burcunuz: HOROZ");
                break;
            case 2:
                System.out.print("Çin Zodyağı Burcunuz: KÖPEK");
                break;
            case 3:
                System.out.print("Çin Zodyağı Burcunuz: DOMUZ");
                break;
            case 4:
                System.out.print("Çin Zodyağı Burcunuz: FARE");
                break;
            case 5:
                System.out.print("Çin Zodyağı Burcunuz: ÖKÜZ");
                break;
            case 6:
                System.out.print("Çin Zodyağı Burcunuz: KAPLAN");
                break;
            case 7:
                System.out.print("Çin Zodyağı Burcunuz: TAVŞAN");
                break;
            case 8:
                System.out.print("Çin Zodyağı Burcunuz: EJDERHA");
                break;
            case 9:
                System.out.print("Çin Zodyağı Burcunuz: YILAN");
                break;
            case 10:
                System.out.print("Çin Zodyağı Burcunuz: AT");
                break;
            case 11:
                System.out.print("Çin Zodyağı Burcunuz: KOYUN");
                break;
            default:

        }
    }
}