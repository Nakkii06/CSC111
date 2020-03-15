import java.util.Scanner;

public class GPAmethod {
    public static double get_number_grade (String Grade) {
        double numberGrade;
        if (Grade.equals("A")) { //for first grade
            numberGrade = 4.00;
        } else if (Grade.equals("A-")){
            numberGrade = 3.67;
        } else if (Grade.equals("B+")){
            numberGrade = 3.33;
        } else if (Grade.equals("B")) {
            numberGrade = 3.00;
        } else if (Grade.equals("B-")){
            numberGrade = 2.67;
        } else if (Grade.equals("C+")){
            numberGrade = 2.33;
        } else if (Grade.equals("C")) {
            numberGrade = 2.00;
        } else if (Grade.equals("C-")){
            numberGrade = 1.67;
        } else if (Grade.equals("D+")){
            numberGrade = 1.33;
        } else if (Grade.equals("D")) {
            numberGrade = 1.00;
        } else if (Grade.equals("D-")){
            numberGrade = 0.67;
        } else if (Grade.equals("F")){
            numberGrade = 0.00;
        } else {
            numberGrade = -1;
        }
        return numberGrade;

    }
    public static void main(String[] args) {
        //declare variables
        Scanner scnr = new Scanner(System.in);
        int i;
        int hrs;
        String grade;
        double numGrade;
        int ttlHrs = 0;
        double ttlGPA = 0;

        //ask for input
        System.out.println("Semester GPA Predictor: Let's see what your GPA could be this semester...");
        for(i = 0; i < 4; i++) {
            System.out.printf("\nCourse %d: Number of hours? ", i + 1);
            hrs = scnr.nextInt();
            System.out.printf("Course %d: Expected grade? ", i + 1);
            grade = scnr.next();
            while (get_number_grade(grade) == -1){
                System.out.print("This is not a valid grade. Enter again:");
                grade = scnr.next();
            }
            ttlHrs = ttlHrs + hrs;
            ttlGPA = ttlGPA + (get_number_grade(grade) * hrs);
        }
        //output
        System.out.printf("\nYour semester GPA would be: %.4f", ttlGPA / ttlHrs );
    }

}
/*
/************************************************************
 * @PredictGPA.java
 * @This program asks the number of hours and the
 *  expected letter grade for 4 courses, and computes the GPA.
 * @Yasuhiro Nakae
 * @Febuary 4, 2020
 ************************************************************/
/*
import java.util.Scanner;
public class PredictGPA {
    public static void main(String[] args) {
        //declare variables
        //for user input
        Scanner scnr = new Scanner(System.in);
        int hour1;
        int hour2;
        int hour3;
        int hour4;
        String grade1;
        String grade2;
        String grade3;
        String grade4;
        //for calculations
        double numGrade1;
        double numGrade2;
        double numGrade3;
        double numGrade4;
        double gpa; //sum of 4 grade in numbers * hours / total hours

        //ask user input
        System.out.println("Semester GPA Predictor: Let's see what you GPA could be this semester...");
        System.out.print("\nCourse 1: Number of hours? ");
        hour1 = scnr.nextInt();
        System.out.print("Course 1:Expected grade? ");
        grade1 = scnr.next();
        System.out.print("\nCourse 2: Number of hours? ");
        hour2 = scnr.nextInt();
        System.out.print("Course 2: Expected grade? ");
        grade2 = scnr.next();
        System.out.print("\nCourse 3: Number of hours? ");
        hour3 = scnr.nextInt();
        System.out.print("Course 3: Expected grade? ");
        grade3 = scnr.next();
        System.out.print("\nCourse 4: Number of hours? ");
        hour4 = scnr.nextInt();
        System.out.print("Course 4: Expected grade? ");
        grade4 = scnr.next();

        //calculation NOTE: to write in less line, else-if and else statements and end braces are in the same line.
        if (grade1.equals("A")) { //for first grade
            numGrade1 = 4.00;
        } else if (grade1.equals("A-")){
            numGrade1 = 3.67;
        } else if (grade1.equals("B+")){
            numGrade1 = 3.33;
        } else if (grade1.equals("B")) {
            numGrade1 = 3.00;
        } else if (grade1.equals("B-")){
            numGrade1 = 2.67;
        } else if (grade1.equals("C+")){
            numGrade1 = 2.33;
        } else if (grade1.equals("C")) {
            numGrade1 = 2.00;
        } else if (grade1.equals("C-")){
            numGrade1 = 1.67;
        } else if (grade1.equals("D+")){
            numGrade1 = 1.33;
        } else if (grade1.equals("D")) {
            numGrade1 = 1.00;
        } else if (grade1.equals("D-")){
            numGrade1 = 0.67;
        } else { //grade F. assume there is no F+ (0.33)
            numGrade1 = 0.00;
        }

        if (grade2.equals("A")) { //for second grade
            numGrade2 = 4.00;
        } else if (grade2.equals("A-")){
            numGrade2 = 3.67;
        } else if (grade2.equals("B+")){
            numGrade2 = 3.33;
        } else if (grade2.equals("B")) {
            numGrade2 = 3.00;
        } else if (grade2.equals("B-")){
            numGrade2 = 2.67;
        } else if (grade2.equals("C+")){
            numGrade2 = 2.33;
        } else if (grade2.equals("C")) {
            numGrade2 = 2.00;
        } else if (grade2.equals("C-")){
            numGrade2 = 1.67;
        } else if (grade2.equals("D+")){
            numGrade2 = 1.33;
        } else if (grade2.equals("D")) {
            numGrade2 = 1.00;
        } else if (grade2.equals("D-")){
            numGrade2 = 0.67;
        } else {
            numGrade2 = 0.00;
        }

        if (grade3.equals("A")) { //for third grade
            numGrade3 = 4.00;
        } else if (grade3.equals("A-")){
            numGrade3 = 3.67;
        } else if (grade3.equals("B+")){
            numGrade3 = 3.33;
        } else if (grade3.equals("B")) {
            numGrade3 = 3.00;
        } else if (grade3.equals("B-")){
            numGrade3 = 2.67;
        } else if (grade3.equals("C+")){
            numGrade3 = 2.33;
        } else if (grade3.equals("C")) {
            numGrade3 = 2.00;
        } else if (grade3.equals("C-")){
            numGrade3 = 1.67;
        } else if (grade3.equals("D+")){
            numGrade3 = 1.33;
        } else if (grade3.equals("D")) {
            numGrade3 = 1.00;
        } else if (grade3.equals("D-")){
            numGrade3 = 0.67;
        } else {
            numGrade3 = 0.00;
        }

        if (grade4.equals("A")) { //for fourth grade
            numGrade4 = 4.00;
        } else if (grade4.equals("A-")){
            numGrade4 = 3.67;
        } else if (grade4.equals("B+")){
            numGrade4 = 3.33;
        } else if (grade4.equals("B")) {
            numGrade4 = 3.00;
        } else if (grade4.equals("B-")){
            numGrade4 = 2.67;
        } else if (grade4.equals("C+")){
            numGrade4 = 2.33;
        } else if (grade4.equals("C")) {
            numGrade4 = 2.00;
        } else if (grade4.equals("C-")){
            numGrade4 = 1.67;
        } else if (grade4.equals("D+")){
            numGrade4 = 1.33;
        } else if (grade4.equals("D")) {
            numGrade4 = 1.00;
        } else if (grade4.equals("D-")){
            numGrade4 = 0.67;
        } else {
            numGrade4 = 0.00;
        }
        //calculate gpa
        gpa = ((numGrade1 * hour1) + (numGrade2 * hour2) + (numGrade3 * hour3) + (numGrade4 * hour4)) / (hour1 + hour2 + hour3 + hour4);

        //print the result
        System.out.printf("\nYour semester GPA would be : %.4f", gpa);
    }
}

 */

