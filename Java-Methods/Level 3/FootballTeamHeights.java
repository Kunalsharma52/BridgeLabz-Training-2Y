import java.util.Arrays;

public class FootballTeamHeights {

    public int[] generateRandomHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150;
        }
        return heights;
    }

    public int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    public double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    public int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    public int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        FootballTeamHeights obj = new FootballTeamHeights();
        int[] heights = obj.generateRandomHeights(11);
        System.out.println("Heights of Players (in cms): " + Arrays.toString(heights));
        double meanHeight = obj.findMean(heights);
        int shortest = obj.findShortest(heights);
        int tallest = obj.findTallest(heights);
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.printf("Mean Height: %.2f cm\n", meanHeight);
    }
}
