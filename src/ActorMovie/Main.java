package ActorMovie;

public class Main {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Gabriel Macht", 52);
        Actor actor2 = new Actor("Dominic Purcell", 54);
        Movie movie1 = new Movie("Suits", "Drama", 2011, new Actor[]{actor1});
        Movie movie2 = new Movie("Priaon Break", "Drama", 2005, new Actor[]{actor2});
        System.out.println(movie1.toString());
        System.out.println(movie2.toString());
    }

    public static class Lesson19 {
    }
}



