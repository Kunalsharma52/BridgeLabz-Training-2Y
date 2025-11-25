class Student {
    static String universityName = "Global University";
    private static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public void displayDetails() {
        if(this instanceof Student) {
            System.out.println("University: " + universityName + ", Roll: " + rollNumber + ", Name: " + name + ", Grade: " + grade);
        }
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", "A");
        s1.displayDetails();
        Student.displayTotalStudents();
    }
}
