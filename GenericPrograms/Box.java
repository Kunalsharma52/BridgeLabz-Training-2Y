class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Integer: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Kunal");
        System.out.println("String: " + strBox.get());

        Box<Double> dblBox = new Box<>();
        dblBox.set(55.6);
        System.out.println("Double: " + dblBox.get());
    }
}
