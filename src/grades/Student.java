package grades;


import java.util.ArrayList;
import java.util.HashMap;
import java.lang.Math;
public class Student {
    private  String name;
    private  ArrayList<Integer> grades;
    private  HashMap<String, String> attendance;
    Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();

    }

    // returns the student's name
    public String getName() {
    return this.name;

    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public int getGradeAverage() {
        double sum = 0;
        for(double grade : this.grades){
            sum += grade;
        }
        double percent = Math.round(sum/grades.size());
        return (int)percent;
    }

    public void recordAttendance(String date, String value){
        if(value.equals("A")||value.equals("P")) {
            this.attendance.put(date, value);
        } else{
            System.out.println("invalid value! please use A for absent or P for present");
        }
    }

    public int attendancePercent(){
        int absents=0;

        for(String attendance : this.attendance.values()){
            if (attendance.equals("A")){
                absents++;
            }
        }
        double percent = Math.round((double)(this.attendance.size()-absents)/this.attendance.size()*100);
        return (int)percent;
    }

public void getGrades(){
        int i =1;

            for (int grade : this.grades) {
                System.out.print("Grade " + i + ": " + grade + "\t");
                i++;
            }


}

    public void findAbsences(){
        for(String date : this.attendance.keySet()){
            if (this.attendance.get(date).equalsIgnoreCase("A")){
                System.out.println("on "+date+", "+ this.name+ " was absent.");
            }
        }
        System.out.println(this.attendance.size()+" days of class total");
    }
    public static void main(String[] args) {
Student Alex = new Student("Alex");
        System.out.println(Alex.getName());
        Alex.recordAttendance("2020-01-01", "P");
        Alex.recordAttendance("2020-01-02", "P");
        Alex.recordAttendance("2020-01-03", "P");
        Alex.recordAttendance("2020-01-04", "P");
        Alex.recordAttendance("2020-01-05", "P");
        Alex.recordAttendance("2020-01-06", "A");
        System.out.println(Alex.attendancePercent()+"% attendance");
        Alex.findAbsences();
        Alex.addGrade(70);
        Alex.addGrade(70);
        Alex.addGrade(100);
        Alex.getGrades();
    }
}
