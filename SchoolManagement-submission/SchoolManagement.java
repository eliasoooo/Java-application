package schoolmanagement;

import students.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SchoolManagement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1001, "Tom", "Bachelor's of Computer Science", "Java;Python;C++", 20, 2022, 10000, "Yes"));
        students.add(new Student(1002, "Aaron", "Bachelor's of Artificial Intelligence", "Python;NLP;Statistics", 21, 2023, 15000, "No"));
        students.add(new Student(1003, "Ryan", "Bachelor's of Cyber Security", "Cryptography;Cyber threats;Networks and Security", 20, 2022, 12000, "Yes"));
        students.add(new Student(1004, "Alex", "Bachelor's of Computer Science", "Java;Python;C++", 19, 2022, 10000, "Yes"));
        students.add(new Student(1005, "Dorian", "Bachelor's of Computer Science", "Java;Python;C++", 20, 2022, 10000, "Yes"));
        students.add(new Student(1006, "Teena", "Bachelor's of Cyber Security", "Cryptography;Cyber threats;Networks and Security", 19, 2022, 12000, "Yes"));
        students.add(new Student(1007, "James", "Bachelor's of Artificial Intelligence", "Python;NLP;Statistics", 21, 2022, 15000, "Yes"));
        students.add(new Student(1008, "Cathy", "Bachelor's of Computer Science", "Java;Python;C++", 20, 2023, 10000, "No"));
        students.add(new Student(1009, "Sherif", "Bachelor's of Cyber Security", "Cryptography;Cyber threats;Networks and Security", 21, 2023, 12000, "Yes"));
        students.add(new Student(1010, "John", "Bachelor's of Artificial Intelligence", "Python;NLP;Statistics", 20, 2023, 15000, "Yes"));
        students.add(new Student(1011, "Mathew", "Bachelor's of Cyber Security", "Cryptography;Cyber threats;Networks and Security", 19, 2022, 12000, "No"));
        students.add(new Student(1012, "George", "Bachelor's of Computer Science", "Java;Python;C++", 20, 2022, 10000, "Yes"));
        students.add(new Student(1013, "Steve", "Bachelor's of Computer Science", "Java;Python;C++", 19, 2022, 10000, "No"));
        students.add(new Student(1014, "Chris", "Bachelor's of Artificial Intelligence", "Python;NLP;Statistics", 20, 2023, 15000, "Yes"));
        students.add(new Student(1015, "Andriya", "Bachelor's of Artificial Intelligence", "Python;NLP;Statistics", 19, 2023, 15000, "Yes"));

        // Sort by age
        Collections.sort(students, Comparator.comparingInt(Student::getAge));

        System.out.println("Sorted by Age:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sort by year
        Collections.sort(students, Comparator.comparingInt(Student::getYear));

        System.out.println("\nSorted by Year:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
