import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        n= inp.nextInt();
        double result=0;
        for (double i=1; i<=n; i++){
            result+=(1/i);
        }
        System.out.print(result);
    }
}