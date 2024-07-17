package ActorMovie;

import java.util.Arrays;

public class Movie {
    String title;
    String genre;
    int releseYear;
    Actor[] actors;
    public Movie(String title, String genre, int releseYear, Actor[] actors){
        this.title = title;
        this.genre = genre;
        this.releseYear = releseYear;
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releseYear=" + releseYear +
                ", actors=" + Arrays.toString(actors) +
                '}';
    }
}
