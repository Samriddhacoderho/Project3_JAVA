import java.util.Scanner;

public class BillingSYS_CW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ;
        System.out.println("Here is today's menu:");
        System.out.println("*********************");
        System.out.println("1)Momo-------------Rs.150");
        System.out.println("2)Sandwich---------Rs.120");
        System.out.println("3)Pizza------------Rs.250");

        double result = 0;
        double discount_amount = 0;
        double vat_amount = 0;
        double total = 0;
        double net_total = 0;
        String order = "";
        String items = "";
        int ans = 1;

        while (ans == 1) {
            System.out.println("Enter what you want to eat:(PLEASE ENTER THE ITEM NO ONLY)");
            int user_getnum = sc.nextInt();

            if (user_getnum == 1 || user_getnum == 2 || user_getnum == 3) {
                if (user_getnum == 1) {
                    System.out.println("Enter quantity");
                    int quantity = sc.nextInt();
                    result = 150 * quantity;
                    discount_amount = result - (0.1) * result;
                    vat_amount = discount_amount + (0.13) * discount_amount;
                    order = "Momo\t";

                } else if (user_getnum == 2) {
                    System.out.println("Enter quantity");
                    int quantity = sc.nextInt();
                    result = 120 * quantity;
                    discount_amount = result - (0.1) * result;
                    vat_amount = discount_amount + (0.13) * discount_amount;
                    order = "Sandwich\t";

                } else {
                    System.out.println("Enter quantity");
                    int quantity = sc.nextInt();
                    result = 250 * quantity;
                    discount_amount = result - (0.1) * result;
                    vat_amount = discount_amount + (0.13) * discount_amount;
                    order = "Pizza\t";
                }
            } else {
                System.out.println("Please enter correct item number");
                System.exit(0);     //esle program lai completely end garcha
            }
            total = total + result;
            net_total = net_total + vat_amount;
            items = items + order;

            System.out.println("\nDo you want to order something else?(Y/N)");
            sc.nextLine();       //yo line euta bujena
            String info = sc.nextLine();
            if (info.equals("Y") || info.equals("N")) {
                if (info.equals("N")) {
                    ans = 0;
                }
            } else {
                System.out.println("Please follow the instructions properly");
                break;
            }
        }
        System.out.println("\n\nPearl & Platter");
        System.out.println("Sifal, Kathmandu");
        System.out.println("\nYour order is: " + items);
        System.out.println("Total price: Rs." + total);
        System.out.println("Discount:10%");
        System.out.println("VAT:13%");
        System.out.println("Net Total: Rs." + net_total);

    }

}

