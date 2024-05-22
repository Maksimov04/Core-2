package task.collection;

import java.util.ArrayList;
import java.util.List;

public class StudetnTwo {
    String name;
    String attendance;

    public StudetnTwo(String name, String attendance) {
        this.name = name;
        this.attendance = attendance;
    }

    public String getName() {
        return name;
    }

    public String getAttendance() {
        return attendance;
    }

    public static void studentsWithWorstAttendance(List<StudetnTwo> studentList) {
        for (StudetnTwo student : studentList) {
            if (student.getAttendance().equals("Bad")) {
                System.out.println(student.getName() + " has poor attendance.");
            }
        }
    }

    public static double calculateAverageAttendance(List<StudetnTwo> studentList) {
        double totalAttendance = 0;
        for (StudetnTwo student : studentList) {
            if (student.getAttendance().equals("Good")) {
                totalAttendance += 1;
            }
        }
        return totalAttendance / studentList.size() * 100;
    }

    public static void main(String[] args) {
        List<StudetnTwo> st = new ArrayList<>();
        st.add(new StudetnTwo("Ilya", "Good"));
        st.add(new StudetnTwo("Masha", "Good"));
        st.add(new StudetnTwo("Petr", "Bad"));
        st.add(new StudetnTwo("Dima", "Average"));
        st.add(new StudetnTwo("Roma", "Bad"));
        studentsWithWorstAttendance(st);


        System.out.println("\nAverage attendance of all students : " + calculateAverageAttendance(st));
    }
}


