import java.util.*;

class Movie { String id,genre; Movie(String id,String g){this.id=id;this.genre=g;} public String toString(){return id+"("+genre+")";} }

public class Streaming {
    Stack<Movie> history = new Stack<>();
    List<Movie> library = new ArrayList<>();
    Set<String> genres = new HashSet<>();
    Queue<Movie> upNext = new LinkedList<>();

    public void addToLibrary(Movie m){ library.add(m); }
    public void watch(Movie m){ history.push(m); genres.add(m.genre); }
    public void enqueue(Movie m){ upNext.add(m); }
    public void finishCurrent(){ Movie m = upNext.poll(); if(m!=null) watch(m); }
    public static void main(String[] args){
        Streaming s = new Streaming();
        Movie m1=new Movie("M1","Action"), m2=new Movie("M2","Drama");
        s.addToLibrary(m1); s.addToLibrary(m2);
        s.enqueue(m1); s.enqueue(m2);
        s.finishCurrent();
        System.out.println("History: "+s.history+", Genres: "+s.genres);
    }
}
