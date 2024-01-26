package homework3.task3;

public class Movie {
    String title;
    String rating;
    String genre;
    String country;
    Boolean isHaveOscar;
    String year;

    public Movie(String title,String genre, String country, Boolean isHaveOscar, String year) {
        this.title = title;
        this.genre = genre;
        this.country = country;
        this.isHaveOscar = isHaveOscar;
        this.year = year;
    }
}
