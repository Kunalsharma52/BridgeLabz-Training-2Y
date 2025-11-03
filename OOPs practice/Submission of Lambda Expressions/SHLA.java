interface LightAction {
    void activate();
}

public class SHLA {
    public static void main(String[] args) {
        LightAction motionTrigger = () -> System.out.println("Lights turned ON due to motion detected.");
        LightAction timeTrigger = () -> System.out.println("Lights dimmed for evening mode.");
        LightAction voiceTrigger = () -> System.out.println("Lights turned OFF via voice command.");

        motionTrigger.activate();
        timeTrigger.activate();
        voiceTrigger.activate();
    }
}
