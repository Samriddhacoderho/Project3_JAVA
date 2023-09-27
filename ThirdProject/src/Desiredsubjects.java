import java.util.Scanner;
public class Desiredsubjects {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number of subjects:");
        int no_of_subjects_from_user=sc.nextInt();
        int i=1;
        double markssum=0;
        while (i<=no_of_subjects_from_user) {
            double marks;
            do {
                System.out.print("Enter marks in subject " + i + " :");
                marks = sc.nextDouble();
                if (marks < 0.0 || marks > 100.0) {
                    System.out.println("Invalid marks!");
                }
                else{
                    markssum = markssum + marks;
                }
            } while (marks < 0.0 || marks > 100.0);
            i++;
        }
        String grade;
        double percentage=(markssum/(no_of_subjects_from_user*100))*100;
        if(percentage>=90 && percentage<=100){
            grade="A+";
        }
        else if(percentage>=80 && percentage<90){
            grade="A";
        }
        else if(percentage>=70 && percentage<80){
            grade="B+";
        }
        else if(percentage>=60 && percentage<70){
            grade="B";
        }
        else{
            grade="NG";
        }
        System.out.println("Percentage: "+percentage);
        System.out.println("Grade: "+grade);
        System.out.println("GPA: "+((percentage/100)*4));
    }
}
