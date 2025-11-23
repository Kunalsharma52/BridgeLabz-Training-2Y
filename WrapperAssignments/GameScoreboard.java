public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {10, null, 15, null, 20};

        int total = 0, notPlayed = 0;
        for(Integer s : scores) {
            if(s == null) notPlayed++;
            else total += s; // auto-unboxing
        }

        System.out.println("Players not played: " + notPlayed);
        System.out.println("Total score: " + total);
    }
}
