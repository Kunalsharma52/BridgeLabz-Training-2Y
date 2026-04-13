import java.util.*;

public class DeckOfCardsDistributor {

    static String[] createDeck() {
        String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        String[] deck = new String[52];
        int index = 0;

        for (String s : suits)
            for (String r : ranks)
                deck[index++] = r + " of " + s;

        return deck;
    }

    static void shuffle(String[] deck) {
        Random rand = new Random();

        for (int i = 0; i < deck.length; i++) {
            int j = rand.nextInt(deck.length);
            String temp = deck[i];
            deck[i] = deck[j];
            deck[j] = temp;
        }
    }

    public static void main(String[] args) {

        String[] deck = createDeck();
        shuffle(deck);

        for (int i = 0; i < 10; i++)
            System.out.println(deck[i]);
    }
}