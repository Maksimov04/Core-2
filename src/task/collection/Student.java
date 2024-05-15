package task.collection;

import java.util.ArrayList;
import java.util.List;

public class Student {

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void printListStudents(List<Student> st) {
        for (Student studetn : st) {
            System.out.println("Name :" + studetn.getName() + " " + "," + "Age :" + studetn.getAge());

        }
    }

    public static List<Student> filterStudentsByAge(List<Student> students, int ageThreshold) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > ageThreshold) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    public static void main(String[] args) {
        List<Student> st = new ArrayList<>();
        st.add(new Student("Misha", 25));
        st.add(new Student("Petr", 24));
        st.add(new Student("Masha", 28));
        st.add(new Student("Ilya", 26));
        st.add(new Student("Kirill", 24));
        st.add(new Student("Sava", 25));
        System.out.println("List Students :");
        printListStudents(st);


        int certainAge = 24;
        List<Student> filteredStudents = filterStudentsByAge(st, certainAge);
        System.out.println("\nStudents older than " + certainAge + ":");
        printListStudents(filteredStudents);
    }
}
