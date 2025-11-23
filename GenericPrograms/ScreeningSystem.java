import java.util.*;

abstract class JobRole {}
class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}

class Resume<T extends JobRole> {
    private T role;
    public Resume(T role) { this.role = role; }
}

class ScreeningSystem {
    public static void process(List<? extends JobRole> list) {
        list.forEach(r -> System.out.println(r.getClass().getSimpleName()));
    }

    public static void main(String[] args) {
        List<SoftwareEngineer> se = List.of(new SoftwareEngineer());
        process(se);
    }
}
