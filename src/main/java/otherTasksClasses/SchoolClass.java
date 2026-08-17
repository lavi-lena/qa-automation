package otherTasksClasses;

import java.util.ArrayList;
import java.util.List;

public class SchoolClass {
    int gradeNumber;
    List<Subject> lessons = new ArrayList<>();
    List<Student> students = new ArrayList<>();

    SchoolClass(int gradeNumber){
        this.gradeNumber = gradeNumber;
    }
    void addStudent(Student s){
        students.add(s);
    }
    void addSubject(Subject sub){
        lessons.add(sub);
    }
    void printSchedule(){
        System.out.print("Класс №["+gradeNumber+"] учит предметы: ");

        List<String> subNames = new ArrayList<>();
        for (Subject predmet:lessons){
            subNames.add(predmet.subjectName);
        }
        String subNamesText = String.join(", ", subNames);
        System.out.println(subNamesText);

        System.out.print("Список учеников: ");
        List<String> studNames = new ArrayList<>();
        for (Student ychenik:students){
            studNames.add(ychenik.name);
        }
        String studNamesText = String.join(", ", studNames);
        System.out.println(studNamesText);
    }
}
