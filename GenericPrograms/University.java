import java.util.*;

abstract class CourseType {}
class ExamCourse extends CourseType {}
class AssignmentCourse extends CourseType {}
class ResearchCourse extends CourseType {}

class Course<T extends CourseType> {
    private T type;
    public Course(T type) { this.type = type; }
}

class University {
    public static void printCourses(List<? extends CourseType> list) {
        list.forEach(c -> System.out.println(c.getClass().getSimpleName()));
    }

    public static void main(String[] args) {
        List<ExamCourse> ex = List.of(new ExamCourse());
        printCourses(ex);
    }
}
