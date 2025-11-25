class Printer {
    void print(String message) {
        System.out.println("Printing: " + message);
    }
}

class ColorPrinter extends Printer {
    @Override
    void print(String message) {
        System.out.println("Color Printing: " + message);
    }

    void printInColor(String message, String color) {
        System.out.println("Printing in " + color + ": " + message);
    }
}

public class AOAO {
    public static void main(String[] args) {
        ColorPrinter cp = new ColorPrinter();
        cp.print("Hello World");
        cp.printInColor("Hello World", "Red");
    }
}
