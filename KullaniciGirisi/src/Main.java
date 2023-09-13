import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;
        Scanner inp=new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName=inp.nextLine();
        System.out.print("Şifreniz: ");
        password=inp.nextLine();

        if (userName.equals("Patika")&& password.equals("java123")){
           System.out.println("Giriş Yaptınız!");
        }else{
            System.out.println("Bilgileriniz yalnış!");
            System.out.println("şifrenizi sıfırlamak ister misiniz) \n1-Evet\n2-Hayır");
            select=inp.nextInt();

            if(select==1){
                Scanner input=new Scanner(System.in);
                System.out.print("Yeni şifrenizi giriniz: ");
                newPassword=inp.nextLine();
                if(newPassword.equals(password)){
                    System.out.print("Yeni Şifreniz eski şifreniz ile aynı olamaz!");
                }else{
                    System.out.println("Şifreniz oluşturuldu.");
                }
        }else{
            System.out.println("Patika iyi günler diler.");
        }

        }

    }
}