import java.util.Scanner;

public class GradeandPercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        int user_entered_no_of_subjects= sc.nextInt();

        for(int i=1;i<=user_entered_no_of_subjects;i++){
            System.out.println("Enter marks in subject "+i);
            
        }
    }
}
