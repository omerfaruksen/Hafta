import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Scanner sınıf tanımlıyoruz
        Scanner inp = new Scanner(System.in);
        System.out.print("N1 Sayısını Giriniz :  ");
        int n1 = inp.nextInt();
        System.out.print("N2 Sayısını Giriniz : ");
        int n2 = inp.nextInt();
        int ebob = 1;
        int select;
        System.out.println("1-EBOB : \n2-EKOK : ");
        select= inp.nextInt();
        switch (select) {
            case 1:
                if (n1 < n2) {
                    for (int i = 1; i <= n1; i++) {
                        if (n1 % i == 0 && n2 % i == 0) {
                            //System.out.print(i);
                            ebob = i;
                        }
                    }
                    System.out.print(ebob);
                } else {
                    for (int j = 1; j <= n2; j++) {
                        if (n1 % j == 0 && n2 % j == 0) {
                            //System.out.print(j);
                            ebob = j;
                        }
                    }
                    System.out.print(ebob);
                }
            break;
            case 2:
                for (int k = 1; k <= (n1 * n2); k++) {
                    if (k % n1 == 0 && k % n2 == 0) {
                        System.out.print("Ekok : " + k);
                        break;
                    }
                }
            break;
            default:
        }
    }
}