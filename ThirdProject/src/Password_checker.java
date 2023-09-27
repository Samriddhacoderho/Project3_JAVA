import java.util.Scanner;

public class Password_checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass_default = "hello@1234";

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter password:");
            String user_pass_take = sc.next();

            if (pass_default.equals(user_pass_take)) {
                System.out.println("Welcome user.");
            }
        }
    }
}
