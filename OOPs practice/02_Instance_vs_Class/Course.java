class Course {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Default Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks, Fee: $" + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 8, 400);
        Course c2 = new Course("Python", 6, 350);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("Global Tech Academy");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
