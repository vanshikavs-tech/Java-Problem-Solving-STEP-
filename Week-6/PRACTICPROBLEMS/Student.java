package Week-6.PRACTICPROBLEMS;

class Student {

    // Instance fields
    String name;
    double attendance;

    // Static fields
    static String collegeName =
        "SRM Institute of Science and Technology";

    static int studentCount = 0;

    // Constructor
    Student(String name, double attendance) {

        this.name = name;
        this.attendance = attendance;

        studentCount++;
    }

    // Static method
    static void printCollegeInfo() {

        System.out.println(collegeName);
        System.out.println(
            "Students created: " + studentCount
        );
    }

    public static void main(String[] args) {

        Student s1 =
            new Student("Vanshika", 90);

        Student s2 =
            new Student("Rahul", 85);

        Student.printCollegeInfo();
    }
}