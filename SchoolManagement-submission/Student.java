// students/Student.java
package students;

public class Student {
    private int studentId;
    private String name;
    private String department;
    private String course;
    private int age;
    private int year;
    private int fee;
    private String paid;

    public Student(int studentId, String name, String department, String course, int age, int year, int fee, String paid) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.course = course;
        this.age = age;
        this.year = year;
        this.fee = fee;
        this.paid = paid;
    }

    public int getAge() {
        return age;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + "\n" +
               "Name: " + name + "\n" +
               "Department: " + department + "\n" +
               "Course: " + course + "\n" +
               "Age: " + age + "\n" +
               "Year: " + year + "\n" +
               "Fee: " + fee + "\n" +
               "Paid: " + paid + "\n";
    }
}
