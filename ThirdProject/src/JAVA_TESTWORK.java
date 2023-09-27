import java.util.Scanner;

public class JAVA_TESTWORK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String user_static_username = "Samriddha";
        String user_static_password = "pass@srs";
        int i = 1;

        while (i <= 3) {
            System.out.println("Enter your username:");
            String user_take_username = sc.next();
            System.out.println("Enter your password:");
            String user_take_password = sc.next();

            if (user_static_username.equals(user_take_username)) {
                if (user_static_password.equals(user_take_password)) {
                    System.out.println("Welcome " + user_static_username + "!");
                    System.out.println("What feature do you want to test?(ENTER NUMBER ONLY)");
                    System.out.println("1-Calculator\t2-Simple Interest Calculator\t3-Guessing game\t4-To check vowel or consonent");
                    int user_ask_feature_number = sc.nextInt();

                    if (user_ask_feature_number > 4 || user_ask_feature_number < 1) {
                        System.out.println("Please enter correct number");
                        System.exit(0);
                    } else {
                        if (user_ask_feature_number == 1) {
                            System.out.print("Enter first number:");
                            double feature1_first_number = sc.nextDouble();
                            System.out.print("Enter second number:");
                            double feature1_second_number = sc.nextDouble();
                            System.out.print("Enter operator(+,-,*,/):");
                            String feature1_operator = sc.next();

                            if (!(feature1_operator.equals("+") || feature1_operator.equals("-") || feature1_operator.equals("*") || feature1_operator.equals("/"))) {
                                System.out.println("Invalid operator");
                                System.exit(0);
                            } else {
                                switch (feature1_operator) {
                                    case "+":
                                        double sum = feature1_first_number + feature1_second_number;
                                        System.out.println("Result: " + sum);
                                        break;

                                    case "-":
                                        double diff = feature1_first_number - feature1_second_number;
                                        System.out.println("Result: " + diff);
                                        break;

                                    case "*":
                                        double pro = feature1_first_number * feature1_second_number;
                                        System.out.println("Result: " + pro);
                                        break;

                                    case "/":
                                        double quo = feature1_first_number / feature1_second_number;
                                        System.out.println("Result: " + quo);
                                        break;
                                }
                                System.exit(0);
                            }
                        } else if (user_ask_feature_number == 2) {
                            System.out.print("Enter Principle amount:");
                            double feature2_principle_amt = sc.nextDouble();
                            System.out.print("Enter rate of interest:");
                            double feature2_rate = sc.nextDouble();
                            System.out.print("Enter time:");
                            double feature2_time = sc.nextDouble();

                            double simple_interest = (feature2_principle_amt * feature2_time * feature2_rate) / 100;
                            System.out.println("The simple interest is: " + simple_interest);
                            System.exit(0);
                        } else if (user_ask_feature_number == 3) {
                            int j = 1;
                            int tries = 3;
                            while (j <= 3) {
                                System.out.println("Enter a number randomly!");
                                int feature3_take_num = sc.nextInt();

                                int random_value = (int) (Math.random() * 10);
                                if (feature3_take_num == random_value) {
                                    System.out.println("Correct guess");
                                    System.exit(0);
                                } else {
                                    System.out.println("Invalid guess");

                                }
                                System.out.println("Tries left:" + (tries - 1));
                                tries = tries - 1;
                                j++;
                            }
                            System.exit(0);
                        } else {
                            System.out.print("Enter a character:");
                            String user_entered_char = sc.next();

                            if (user_entered_char.length() == 1) {
                                if (user_entered_char.equalsIgnoreCase("a") || user_entered_char.equalsIgnoreCase("e") || user_entered_char.equalsIgnoreCase("i") || user_entered_char.equalsIgnoreCase("o") || user_entered_char.equalsIgnoreCase("u")) {
                                    System.out.println("The entered character is a vowel!");
                                } else {
                                    System.out.println("The entered character is a consonent!");
                                }
                            } else {
                                System.out.println("Please only enter a character!");
                            }
                            System.exit(0);
                        }


                    }
                } else {
                    System.out.println("Sorry, Invalid Password");
                }
            } else {
                if (user_static_password.equals(user_take_password)) {
                    System.out.println("Sorry, Invalid username");
                } else {
                    System.out.println("Sorry, Invalid username and password");
                }
            }
            i++;
        }
    }
}



