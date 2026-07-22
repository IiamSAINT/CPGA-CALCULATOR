// Using the Java programming Language develop a student grading system 
import java.util.Scanner;

public class Student{ 

    static class CourseData {
        String courseCode;
        int score;
        int unit;
        String grade;
        int gradePoints;
       }


    public static void main(String[] args) { 
       
       Scanner input = new Scanner(System.in);
       System.out.println("==========================================");
       System.out.println("        STUDENT GRADING SYSTEM");
       System.out.println("==========================================");

       System.out.print("Enter Student Name: ");
       String name = input.nextLine();

       System.out.print("Hey " + name + ", how many courses did you take in the first semester: ");
        while(!input.hasNextInt()){
        System.out.println("Invalid input. Please enter a valid number of courses.");
        input.next(); // Clear the invalid input
        System.out.print("Hey " + name + ", how many courses did you take in the first semester: ");
        }
       
        int number = input.nextInt();  

        CourseData[] courses = new CourseData[number];

        int totalUnits = 0;
        int totalGradePoints = 0;

        for (int i = 0 ; i<number ; i++){ 
            
            System.out.print("--- Course"+ (i + 1 ) +" ---");
            courses[i] = new CourseData();

            System.out.print("Enter Coursecode : ");
            courses[i].courseCode = input.next();

            System.out.print("Enter Course Units : ");
            courses[i].unit = input.nextInt();

            System.out.print("Enter Score : ");
            courses[i].score = input.nextInt();



            if(courses[i].score >= 70){
                courses[i].grade = "A";
                courses[i].gradePoints = 5;
            }
            else if(courses[i].score >= 60){
                courses[i].grade = "B";
                courses[i].gradePoints = 4;
            }
            else if(courses[i].score >= 50){
                courses[i].grade = "C";
                courses[i].gradePoints = 3; 
             }
            if(courses[i].score >= 45){
                courses[i].grade = "D";
                courses[i].gradePoints = 2;
            }
            else if(courses[i].score >= 40){
                courses[i].grade = "E";
                courses[i].gradePoints = 1;
            
            }
            else if(courses[i].score < 40){
                courses[i].grade = "F";
                courses[i].gradePoints = 0;
            }

            totalUnits += courses[i].unit;
            totalGradePoints += (courses[i].gradePoints * courses[i].unit);
        }


    

    double gpa = 0.0;
    if (totalUnits > 0) {
        gpa = (double) totalGradePoints / totalUnits;
    }

    System.out.println("==========================================");
    System.out.println("Student Name: " + name);    
    System.out.println("Total Units: " + totalUnits);

    System.out.printf("Total Units Registered: %d\n", totalUnits);
    System.out.printf("Cumulative Grade Point Average (GPA): %.2f\n", gpa);
    System.out.println("===========================================");


}


    }