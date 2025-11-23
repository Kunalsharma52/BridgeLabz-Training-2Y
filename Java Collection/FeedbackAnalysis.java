import java.util.*;

public class FeedbackAnalysis {
    List<String> all = new ArrayList<>();
    Set<String> unique = new HashSet<>();
    Queue<String> processing = new LinkedList<>();
    Stack<String> recent = new Stack<>();

    public void addFeedback(String f){ all.add(f); }
    public void removeDuplicatesAndQueue(){
        unique.clear(); processing.clear();
        for(String f: all) if(unique.add(f)) processing.add(f);
    }
    public void processAll(){
        while(!processing.isEmpty()){
            String f = processing.poll();
            System.out.println("Processing: "+f);
            recent.push(f);
        }
    }
    public void showRecent(int k){
        for(int i=0;i<k && !recent.isEmpty(); i++) System.out.println("Recent: "+recent.pop());
    }
    public static void main(String[] args){
        FeedbackAnalysis fa = new FeedbackAnalysis();
        fa.addFeedback("Great");
        fa.addFeedback("Bad");
        fa.addFeedback("Great");
        fa.removeDuplicatesAndQueue();
        fa.processAll();
        fa.showRecent(2);
    }
}
