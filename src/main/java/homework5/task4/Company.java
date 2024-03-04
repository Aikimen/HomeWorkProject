package homework5.task4;

import homework5.task3.Movie;

import java.util.ArrayList;
import java.util.Objects;

public class Company {

    private String title;
    private String yearOfFoundation;
    private ArrayList<Movie> filmsList; // **список** фильмов, которые компания выпустила (по 3 штуки)


    public Company(String title, String yearOfFoundation) {
        this.title = title;
        this.yearOfFoundation = yearOfFoundation;
        this.filmsList = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(String yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public ArrayList<Movie> getFilmsList() {
        return filmsList;
    }



    @Override
    public String toString() {
        return "Company{" +
                "title='" + title + '\'' +
                ", yearOfFoundation='" + yearOfFoundation + '\'' +
                '}';
    }


    public void addMovie(Movie newMovie){

        this.filmsList.add(newMovie);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(title, company.title) && Objects.equals(yearOfFoundation, company.yearOfFoundation) && Objects.equals(filmsList, company.filmsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, yearOfFoundation, filmsList);
    }
}
