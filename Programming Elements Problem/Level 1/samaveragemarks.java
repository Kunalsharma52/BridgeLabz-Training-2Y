import java.util.Scanner;

public class samaveragemarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in Maths: ");
        float maths = sc.nextFloat();

        System.out.print("Enter marks in Physics: ");
        float physics = sc.nextFloat();

        System.out.print("Enter marks in Chemistry: ");
        float chem = sc.nextFloat();

        float average = (maths + physics + chem) / 3;

        System.out.println("Sam's average marks in PCM: " + average);

        sc.close();
    }
}
