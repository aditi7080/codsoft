import java.util.*;
public class studentGradeCalculator {
    public static void main(String[] args) {
        int totalmarks=0;
        Scanner sc = new Scanner(System.in);
        int subject;

        System.out.print("Enter subject : ");
        subject = sc.nextInt();

        for(int i=1;i<=subject;i++) {
            int marks;
            while (true) {
                System.out.print("Enter marks of subject:" + i + "(0-100): " );
                marks = sc.nextInt();

                if(marks>=0 && marks<=100) {
                    break;
                }
                else{
                    System.out.println("Invalid marks");
                }
            }
            totalmarks=totalmarks+marks;
        }
        double avg=(double)totalmarks/subject;
        String grade;

        if (avg >= 90) {
            grade = "A+";
        } else if (avg >= 80) {
            grade = "A";
        } else if (avg >= 70) {
            grade = "B";
        } else if (avg >= 60) {
            grade = "C";
        } else if (avg >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("total marks: "+totalmarks);
        System.out.println("average percentage: "+avg);
        System.out.println("grade marks: "+grade);
    }
}
