package grades;
import java.util.ArrayList;

public class Student {
    private static String name;
    private static ArrayList<Integer> grades;

    Student(String name){
        Student.name =name;
        Student.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
    return name;

    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for(double grade : grades){
            sum += grade;
        }
        return (sum/grades.size());
    }

    public static void main(String[] args) {

    }
}
