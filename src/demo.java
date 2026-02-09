class Student {
    int id;
    String name;
    Course course;

    Student(int id, String name, Course course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    void showDetails() {
        System.out.println("ID " + id);
        System.out.println("Name " + name);
        System.out.println("Course Id " + course.id);
        System.out.println("Course Title " + course.title);
    }
}
class Course {
    int id;
    String title;

    Course(int id, String title) {
        this.id = id;
        this.title = title;
    }
}
public class demo {
    public static void main(String[] args) {

        Course cs = new Course(101, "Computer Science");
        Course ai = new Course(102, "Artificial Intelligence");
        Student s1 = new Student(1, "ABC", cs);
        Student s2 = new Student(2, "XYZ", ai);


        s1.showDetails();
        s2.showDetails();
    }
}
