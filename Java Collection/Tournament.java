import java.util.*;

class Player { String id; Player(String id){this.id=id;} public String toString(){return id;} public boolean equals(Object o){return (o instanceof Player) && id.equals(((Player)o).id);} public int hashCode(){return id.hashCode();} }
class Match { String id; Player p1,p2; Match(String id,Player a,Player b){this.id=id;this.p1=a;this.p2=b;} public String toString(){return id+":"+p1+" vs "+p2;} }
class Result { String matchId; Player winner; int points; Result(String m,Player w,int pts){matchId=m;winner=w;points=pts;} public String toString(){return matchId+":"+winner+":"+points;} }
class Score implements Comparable<Score>{ Player p; int pts; Score(Player p,int pts){this.p=p;this.pts=pts;} public int compareTo(Score s){ if(this.pts!=s.pts) return s.pts-this.pts; return p.id.compareTo(s.p.id);} public String toString(){return p+":"+pts;} }

public class Tournament {
    Set<Player> players = new HashSet<>();
    Queue<Match> matches = new LinkedList<>();
    List<Result> results = new ArrayList<>();
    TreeSet<Score> leaderboard = new TreeSet<>();
    Map<String,Integer> points = new HashMap<>();

    public void register(Player p){ players.add(p); }
    public void schedule(Match m){ matches.add(m); }
    public void processNextMatch(){
        Match m = matches.poll();
        if(m==null) return;
        // simulate winner p1
        Player w = m.p1;
        results.add(new Result(m.id,w,3));
        points.put(w.id, points.getOrDefault(w.id,0)+3);
    }
    public void buildLeaderboard(){
        leaderboard.clear();
        for(Player p: players) leaderboard.add(new Score(p, points.getOrDefault(p.id,0)));
    }
    public static void main(String[] args){
        Tournament t = new Tournament();
        Player a=new Player("P1"), b=new Player("P2");
        t.register(a); t.register(b);
        t.schedule(new Match("M1",a,b));
        t.processNextMatch();
        t.buildLeaderboard();
        System.out.println("Leaderboard: "+t.leaderboard);
    }
}
