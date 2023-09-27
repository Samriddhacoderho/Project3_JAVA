import java.util.Scanner;
public class LoginSystem3tries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String static_user_name = "Samriddha";
        String pass = "srs";
        int i = 1;
        while (i <= 3) {
            System.out.println("Enter username:");
            String take_username = sc.next();
            System.out.println("Enter password:");
            String take_pass = sc.next();

            if (static_user_name.equals(take_username)) {
                if (pass.equals(take_pass)) {
                    System.out.println("Welcome " + static_user_name + "!");

                } else {
                    System.out.println("Sorry, Invalid Password");
                }
            } else {
                if (pass.equals(take_pass)) {
                    System.out.println("Sorry, Invalid username");
                } else {
                    System.out.println("Sorry, Invalid username and password");
                }
            }

        }
    }
}
