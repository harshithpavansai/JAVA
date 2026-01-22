class favMovie {
    String name, director, musicComposer;

    favMovie(String n, String d, String mc) {
        name = n;
        director = d;
        musicComposer = mc;
    }

    void printMovieDetails() {
        System.out.println(name + " is directed by " + director);
        System.out.println("Music composer is: " + musicComposer);
    }
}

public class Movie {
    public static void main(String[] args) {
        favMovie m1 = new favMovie("devara", "siva korataala", "anirudh ravichander");
        System.out.println(m1);

    }
}
