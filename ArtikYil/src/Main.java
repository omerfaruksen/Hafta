import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Değişken tanımladık
        int year;
        //Scanner ile kullanıcıdan veri aldık
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz: ");
        year=inp.nextInt();
        //Koşulları işledik
        if(year%4==0){
            System.out.print(year + " artık yıldır!");
        }else {
            System.out.print(year+ " bir artık yıl değildir!");
        }

    }
}