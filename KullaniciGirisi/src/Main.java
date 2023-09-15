import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = inp.nextLine();
        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        if (userName.equals("Patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Bilgileriniz yalnış!");
            System.out.println("şifrenizi sıfırlamak ister misiniz) \n1-Evet\n2-Hayır");
            int select = inp.nextInt();
            if(select==1){
                Scanner input = new Scanner(System.in);
                System.out.print("Yeni şifrenizi giriniz: ");
                String newPassword = input.nextLine();


                boolean kosul1=newPassword.equals(password);
                String str=(kosul1)? "Yeni Şifreniz Oluşturuldu": "Yeni şifre eski şifre ile aynı olamaz.";
                System.out.print(str);
            }else {
                System.out.print("Patika iyi günler diler!");
            }
        }


    }

}

