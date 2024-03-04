package homework3.task3;

public class AddMovie {
    public static void main(String[] args) {

        //task3
        Movie[] films = {
                new Movie("Back to the Future", "science fiction", "USA", false, "1986"),
                new Movie("Terminator 2", "science fiction action", "USA", true, "1993"),
                new Movie("Бриллиантовая рука", "comedy", "USSR", false, "1969")
        };

        films[0].rating = "9";
        films[1].rating = "8";
        films[2].rating = "10";


        //Вопрос: как задать диапазон чисел для конструктора?

//        //Task4 - вывести на экран числа от 1 до 1_000_000
//            for(int i = 0; i < 1_000_000_000; i++){
//                System.out.println(i);
//        }


        //Task 5 -используя цикл, напечатайте информацию о всех фильмах в формате "год - название - жанр - рейтинг"
        for (int i = 0; i < films.length; i++) {
            Movie currentFilms = films[i];
            System.out.println(currentFilms.year+ " - "+ currentFilms.title + " - " + currentFilms.genre + " - " + currentFilms.rating);
        }


        //task6 - массив игроков

        String[] playersName = {
                "Иван",
                "Пётр",
                "Евгений",
                "Дмитрий",
                "Михаил",
                "Эдуард",
                "Борис",
                "Артём",
                "Александр",
                "Андрей"
        };

        for (int i = 0; i < 3; i ++){
            System.out.println(playersName[i]);
        }
    }
}
