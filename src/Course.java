import java.util.Arrays;

public class Course {
    String courseName;
    String instructorName;
    String[] studenty;

    public Course (String courseName, String instructorName, Student[] students){
        if (courseName.length() <= 2){
            System.out.println("“атын туура жазыныз”");
        }else{
            this.courseName = courseName;
            this.instructorName = instructorName;
           this.studenty = getStudents(students);
        }
    }

    public String[] getStudents (Student[] students){
        int count = 0;
        String[] studentss = new String[students.length];
        for (int i = 0; i < students.length; i++) {
            if (students[i].age <= 16){
                System.out.println(students[i].name + " - окуга мумкунчулугужок ");
            }
            else{
                studentss[count] = students[i].name;
                count++;
            }
        }
        return studentss;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", instructorName='" + instructorName + '\'' +
                ", studentss=" + Arrays.toString(studenty) +
                '}';
    }
}
