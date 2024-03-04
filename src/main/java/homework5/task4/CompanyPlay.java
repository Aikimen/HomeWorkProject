package homework5.task4;

import homework5.task3.Movie;

import java.util.ArrayList;

public class CompanyPlay {
    public static void main(String[] args) {

        //Создаём список компании (пока пустой)
        ArrayList<Company> companies = new ArrayList<>();

        //Создаём три компании
        //Как заполнить поле ArrayList<Movie> filmsList через конструктор?


        //Добавляем фильмы в компании
        Company company1 = new Company("Universal Pictures", "1912");
        company1.getFilmsList().add(new Movie("Back to the Future", "science fiction", "USA", false, "1986", 9));
        company1.addMovie(new Movie("Terminator 2", "science fiction action", "USA", true, "1993", 10));
        company1.addMovie(new Movie("Бриллиантовая рука", "comedy", "USSR", false, "1969", 100));



        Company company2 = new Company("Carolco Pictures", "1976");
        company2.addMovie(new Movie("Back to the Future 2", "science fiction", "USA", false, "1986", 8));
        company2.addMovie(new Movie("Terminator 3", "science fiction action", "USA", true, "1993", 7));
        company2.addMovie(new Movie("Бриллиантовая рука: ремейк", "comedy", "USSR", false, "1969", 11));

        Company company3 = new Company("Киностудия \"Мосфильм\"", "1924");
        company3.addMovie(new Movie("Back to the Future 3", "science fiction", "USA", false, "1986", 9));
        company3.addMovie(new Movie("Terminator 3: remeik", "science fiction action", "USA", true, "1993", -1));
        company3.addMovie(new Movie("Бриллиантовая рука: возвращение!", "comedy", "USSR", false, "1969", 12));




        companies.add(company1);
        companies.add(company2);
        companies.add(company3);

        System.out.println(company1.getTitle() + "-" + company1.getFilmsList());
        System.out.println(company2.getTitle() + "-" + company2.getFilmsList());
        System.out.println(company3.getTitle() + "-" + company2.getFilmsList());

        for(int i = 0; i < companies.size(); i++) {
            System.out.println(companies.get(i));
        }


    }
}
