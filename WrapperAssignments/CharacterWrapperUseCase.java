import java.util.Scanner;

public class CharacterWrapperUseCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int letters = 0, digits = 0, specials = 0;
        for(char ch : input.toCharArray()) {
            if(Character.isLetter(ch)) letters++;
            else if(Character.isDigit(ch)) digits++;
            else specials++;
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + specials);
    }
}
