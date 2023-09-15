import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner info=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        a=info.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        b=info.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        c=info.nextInt();
        if((a>b) && (a>c)){
            if (b>c){
                System.out.print("a>b>c");
            }else{
                System.out.print("a>c>b");
            }
        } else if ((b>a) && (b>c)) {
            if (a>c){
                System.out.print("b>a>c");
            }else {
                System.out.print("b>c>a");
            }

        } else if ((c>a) && (c>b)) {
            if (b>a){
                System.out.print("c>b>a");
            }else {
                System.out.print("c>a>b");
            }
        }
    }
}