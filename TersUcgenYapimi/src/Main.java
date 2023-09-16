import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // değişkenleri tanımladık
        int n;
        //Kullanıcıdan verileri aldık
        Scanner info=new Scanner(System.in);

        System.out.print("Bir Sayı giriniz : ");
        n= info.nextInt();
        //ters ücgen oluiumu için döngü kullandık.
        for (int i=1; i<=n; i++){
            for (int k=1; k<=i ;k++){
                System.out.print(" ");
            }
            for(int j=n ; j>i; j--){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}