import java.util.*;

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

class AnimalTest {
    public static void printAnimals(List<? extends Animal> animals) {
        animals.forEach(a -> System.out.println(a.getClass().getSimpleName()));
    }

    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog(), new Dog());
        List<Cat> cats = List.of(new Cat(), new Cat());

        printAnimals(dogs);
        printAnimals(cats);
    }
}
