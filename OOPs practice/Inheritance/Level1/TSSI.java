class Animal {
    private int hungerLevel;

    public Animal(int hungerLevel) {
        this.hungerLevel = Math.max(0, hungerLevel);
    }

    public void eat() {
        hungerLevel = Math.max(0, hungerLevel - 10);
        System.out.println("Animal ate. Hunger level now: " + hungerLevel);
    }

    public int getHungerLevel() {
        return hungerLevel;
    }
}

class Dog extends Animal {
    private int tailWagCount;

    public Dog(int hungerLevel) {
        super(hungerLevel);
        this.tailWagCount = 0;
    }

    @Override
    public void eat() {
        super.eat();
        wagTail();
    }

    public void wagTail() {
        tailWagCount++;
        System.out.println("Dog wagged tail. Count: " + tailWagCount);
    }

    public int getTailWagCount() {
        return tailWagCount;
    }
}

public class TSSI {
    public static void main(String[] args) {
        Animal a = new Animal(50);
        Dog d = new Dog(60);
        Animal poly = d;

        System.out.println("=== Direct Animal ===");
        int beforeA = a.getHungerLevel();
        a.eat();
        int afterA = a.getHungerLevel();
        System.out.println("Expected decrease: 10, Actual decrease: " + (beforeA - afterA));
        System.out.println((beforeA - afterA) == 10 ? "PASS" : "FAIL");
        System.out.println();

        System.out.println("=== Direct Dog ===");
        int beforeD = d.getHungerLevel();
        d.eat();
        int afterD = d.getHungerLevel();
        System.out.println("Expected decrease: 10, Actual decrease: " + (beforeD - afterD));
        System.out.println((beforeD - afterD) == 10 ? "PASS" : "FAIL");
        System.out.println("Tail wag count (should have incremented): " + d.getTailWagCount());
        System.out.println();

        System.out.println("=== Polymorphic Dog as Animal ===");
        int beforeP = poly.getHungerLevel();
        poly.eat();
        int afterP = poly.getHungerLevel();
        System.out.println("Expected decrease: 10, Actual decrease: " + (beforeP - afterP));
        System.out.println((beforeP - afterP) == 10 ? "PASS" : "FAIL");
        System.out.println("Tail wag count via Dog reference: " + d.getTailWagCount());
    }
}
