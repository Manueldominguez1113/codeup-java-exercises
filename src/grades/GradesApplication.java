package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student alex = new Student("Alex");
        alex.addGrade(70);
        alex.addGrade(70);
        alex.addGrade(100);
        Student kyle = new Student("Kyle");
        kyle.addGrade(50);
        kyle.addGrade(65);
        kyle.addGrade(50);
        Student john = new Student("John");
        john.addGrade(100);
        john.addGrade(95);
        john.addGrade(100);
        Student tyler = new Student("Tyler");
        tyler.addGrade(90);
        tyler.addGrade(98);
        tyler.addGrade(90);
        tyler.addGrade(50);
        tyler.addGrade(95);
        tyler.addGrade(100);

        students.put("Rocknrolla45", alex);
        students.put("campaKite112", kyle);
        students.put("TheProgrammingToaster", john);
        students.put("OrangyBlues42", tyler);
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!\n\n Here is out list of students by Github usernames:");
//        System.out.println("|"+students+"|  "+"  |"+students.get("kyle")+"|  "+"  |"+students.get("john")+"|  "+"  |"+students.get("tyler")+"|");
        String contin = "y";
        while (contin.equalsIgnoreCase("y")) {

        for (String i : students.keySet()) {
            System.out.print("\t|" + i + "|\t");
        }

            System.out.println("\n\nWhat student would you like to see more information on?");
            String username = input.next();

            if (students.get(username) == null) {
                System.out.println("no known username, try again");
            } else {
                Student user = students.get(username);
                System.out.println("Name: " + user.getName() + "  Github_username: " + username + "\nGrade Average: " + user.getGradeAverage());
            }

            System.out.println("would you like to see another student? Y/N");
            contin = input.next();
        }
        System.out.println("Goodbye and have a great day!");
    }
}
