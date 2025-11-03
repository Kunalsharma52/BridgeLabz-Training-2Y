public class BJC {
    public static void main(String[] args) {
        Runnable backgroundJob = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Executing task " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Task interrupted");
                }
            }
            System.out.println("Background job completed.");
        };

        Thread jobThread = new Thread(backgroundJob);
        jobThread.start();

        System.out.println("Main thread continues...");
    }
}
