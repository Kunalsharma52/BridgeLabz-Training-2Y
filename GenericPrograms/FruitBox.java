class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}
class Car {}   // Non Fruit

class FruitBox<T extends Fruit> {
    private java.util.List<T> list = new java.util.ArrayList<>();

    public void add(T fruit) { list.add(fruit); }

    public void display() {
        list.forEach(f -> System.out.println(f.getClass().getSimpleName()));
    }

    public static void main(String[] args) {
        FruitBox<Fruit> fb = new FruitBox<>();
        fb.add(new Apple());
        fb.add(new Mango());
        fb.display();

        // fb.add(new Car());  // ❌ Compile-time error
    }
}
