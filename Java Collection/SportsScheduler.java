import java.util.*;

class Team { String id; int points; Team(String id){this.id=id;this.points=0;} public String toString(){return id+":"+points;} public boolean equals(Object o){return (o instanceof Team)&&id.equals(((Team)o).id);} public int hashCode(){return id.hashCode();} }
class Match { Team a,b; Match(Team a,Team b){this.a=a;this.b=b;} public String toString(){return a+" vs "+b;} }
class Result { Match m; Team winner; Result(Match m,Team w){this.m=m;this.winner=w;} }

public class SportsScheduler {
    Set<Team> teams = new HashSet<>();
    Queue<Match> fixtures = new LinkedList<>();
    List<Result> results = new ArrayList<>();
    TreeSet<Team> ranking = new TreeSet<>((x,y)-> y.points!=x.points ? y.points-x.points : x.id.compareTo(y.id));

    public void register(Team t){ teams.add(t); }
    public void schedule(Match m){ fixtures.add(m); }
    public void processMatch(){
        Match m = fixtures.poll();
        if(m==null) return;
        // simulate winner = a
        m.a.points += 3; results.add(new Result(m,m.a));
    }
    public void buildRanking(){ ranking.clear(); ranking.addAll(teams); }
    public static void main(String[] args){
        SportsScheduler s = new SportsScheduler();
        Team t1=new Team("T1"); Team t2=new Team("T2");
        s.register(t1); s.register(t2);
        s.schedule(new Match(t1,t2));
        s.processMatch();
        s.buildRanking();
        System.out.println("Ranking: "+s.ranking);
    }
}
