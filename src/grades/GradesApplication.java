package grades;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student alex = new Student("Alex");
        alex.addGrade(70);
        alex.addGrade(70);
        alex.addGrade(100);
        alex.recordAttendance("2020-01-01", "P");
        alex.recordAttendance("2020-01-02", "P");
        alex.recordAttendance("2020-01-03", "P");
        alex.recordAttendance("2020-01-04", "P");
        alex.recordAttendance("2020-01-05", "P");
        alex.recordAttendance("2020-01-06", "P");
        Student kyle = new Student("Kyle");
        kyle.addGrade(50);
        kyle.addGrade(65);
        kyle.addGrade(50);
        kyle.recordAttendance("2020-01-01", "P");
        kyle.recordAttendance("2020-01-02", "A");
        kyle.recordAttendance("2020-01-03", "A");
        kyle.recordAttendance("2020-01-04", "A");
        kyle.recordAttendance("2020-01-05", "A");
        kyle.recordAttendance("2020-01-06", "A");
        Student john = new Student("John");
        john.addGrade(100);
        john.addGrade(95);
        john.addGrade(100);
        john.recordAttendance("2020-01-01", "P");
        john.recordAttendance("2020-01-02", "A");
        john.recordAttendance("2020-01-03", "P");
        john.recordAttendance("2020-01-04", "P");
        john.recordAttendance("2020-01-05", "A");
        john.recordAttendance("2020-01-06", "P");
        Student tyler = new Student("Tyler");
        tyler.addGrade(90);
        tyler.addGrade(98);
        tyler.addGrade(90);
        tyler.addGrade(50);
        tyler.addGrade(95);
        tyler.addGrade(100);
        tyler.recordAttendance("2020-01-01", "A");
        tyler.recordAttendance("2020-01-02", "A");
        tyler.recordAttendance("2020-01-03", "P");
        tyler.recordAttendance("2020-01-04", "P");
        tyler.recordAttendance("2020-01-05", "P");
        tyler.recordAttendance("2020-01-06", "P");

        students.put("Rocknrolla45", alex);
        students.put("campaKite112", kyle);
        students.put("OrangyBlues42", tyler);
        students.put("TheProgrammingToaster", john);

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!\n\n Here is out list of students by Github usernames:");
//        System.out.println("|"+students+"|  "+"  |"+students.get("kyle")+"|  "+"  |"+students.get("john")+"|  "+"  |"+students.get("tyler")+"|");
        String contin = "y";
        while (contin.equalsIgnoreCase("y")) {

            for (String i : students.keySet()) {
                System.out.print("\t|" + i + "|\t");
            }
            System.out.println("\nYou can also input all");

            System.out.println("\n\nWhat student would you like to see more information on?");
            String username = input.next();
            if (username.equalsIgnoreCase("all")) {
                for(Student studentz: students.values()){
                    System.out.println("Name: " + studentz.getName() + "\nGrades: ");
                    studentz.getGrades();
                    System.out.println("Average: " + studentz.getGradeAverage() + "%\tAttendance: " + studentz.attendancePercent() + "%");
                    studentz.findAbsences();
                    System.out.print("\n");
                }
            } else {
                if (students.get(username) == null) {
                    System.out.println("no known username, try again");
                } else {
                    Student user = students.get(username);
                    System.out.println("Name: " + user.getName() + "  Github_username: " + username + "\nGrades: ");
                    user.getGrades();
                    System.out.println("Average: " + user.getGradeAverage() + "%\tAttendance: " + user.attendancePercent() + "%");
                    user.findAbsences();
                }
            }
            System.out.println("\nwould you like to see another student? Y/N");
            contin = input.next();
        }
        System.out.println("Goodbye and have a great day!");
    }
}
