
public class Main {
    public static void main(String[] args) {
        //değişkeni tanımladık
        int sayac = 0;
        //Döngümüzü 100'e kadar döndürdük
        for (int sayi = 2; sayi <= 100; sayi++) {
            //Koşullarımızı belirledik.
            int input = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    input = 1;
                    break;
                }
            }
            //Ekrana yazdırma işlemimizi ekledik.
            if (input == 0) {
                System.out.print(sayi +",");
                sayac++;
            }
        }
    }
}