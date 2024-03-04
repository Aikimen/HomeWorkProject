package homework1;

public class homework1 {
    public static void main(String[] args) {

        // Возвращает длину строки (количество символов)
        String city = "Москва";
        int result = city.length();
        System.out.println(result);

        // возвращает Boolean-значение true (текст есть) or false (текст отсутствует).
        //Returns true if, and only if, length() is 0
        System.out.println(city.isEmpty());

        //Возвращает True если строка пустая или содержит пробелы, иначе false;
        city = " ";
        System.out.println(city.isBlank());

        // Возвращает подстроку с указанием номера символа
        String country = "Russia";
        System.out.println(country.substring(1, 3));

        // Возвращает номер, указанного в параметрах символа или -1 -если ничего не найдено
        String word = "Велосипед";
        System.out.println(word.indexOf("е"));

        // Возвращает индекс последнего вхождения указанной подстроки или -1, если такого вхождения нет.
        country = "Russia";
        System.out.println(country.lastIndexOf("s"));

        // приводит строку к маленькому шрифту
        String upperCaseWord = "AMALGAMA";
        System.out.println(upperCaseWord.toLowerCase());

        // приводит строку к большому шрифту
        System.out.println(upperCaseWord.toUpperCase());

        // Замена символов в подстроке, можно выбрать куда и откуда
        String replaceWord = "обычай";
        System.out.println(replaceWord.replace("обы", ""));

        // проверяет начинается ли подстрока с определённого символа (номер символа можно указать)
       replaceWord = "подключение";
        System.out.println(replaceWord.startsWith("к",3));

        // проверяет оканчивается ли подстрока определённым символом (номер символа можно указать)
        System.out.println(replaceWord.endsWith("е"));

        //Повторяет строку n-ое кол-во раз
        System.out.println(upperCaseWord.repeat(2));

        // Проверка на содержание в строке необходимого текста
        System.out.println(replaceWord.contains("ключ"));

        //Конкатенация с указанной в параметрах строкой
        System.out.println(country.concat(" - страна!"));

        //Удаляет начальный и конечный пробелы (если есть).
        System.out.println(" Как пройти в библиотеку! ".trim());

        // The end!
        //Спасибо за просмотр!
    }
}
