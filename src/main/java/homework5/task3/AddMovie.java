package homework5.task3;

import java.util.ArrayList;
import java.util.List;

public class AddMovie {
    public static void main(String[] args) {


        Movie[] filmsArray = {
                new Movie("Back to the Future", "science fiction", "USA", false, "1986", 10),
                new Movie("Terminator 2", "science fiction action", "USA", true, "1993", 11),
                new Movie("Бриллиантовая рука", "comedy", "USSR", false, "1969", 8)
        };

        filmsArray[0].setRating(9);
        filmsArray[1].setRating(8);
        filmsArray[2].setRating(10);

        List<Movie> films = new ArrayList<>();
        films.add(0,filmsArray[0]);
        films.add(1,filmsArray[1]);
        films.add(2,filmsArray[2]);

        System.out.println(films.get(1).toString());
    }
}
