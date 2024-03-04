package homework5.task3;

public class Movie {
    private String title;
    private int rating;
    private String genre;
    private String country;
    private Boolean isHaveOscar;
    private String year;

    public Movie(String title, String genre, String country, Boolean isHaveOscar, String year, int rating) {
        this.title = title;
        this.genre = genre;
        this.country = country;
        this.isHaveOscar = isHaveOscar;
        this.year = year;
        this.rating = rating;

        if(rating < 0){
            this.rating = 0;
        }
        if(rating > 10){
            this.rating = 10;
        }

    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating='" + rating + '\'' +
                ", genre='" + genre + '\'' +
                ", country='" + country + '\'' +
                ", isHaveOscar=" + isHaveOscar +
                ", year='" + year + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getHaveOscar() {
        return isHaveOscar;
    }

    public void setHaveOscar(Boolean haveOscar) {
        isHaveOscar = haveOscar;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
