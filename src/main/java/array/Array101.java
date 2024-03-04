package array;

public class Array101 {
    public static void main(String[] args) {
        // Сколько коробок и какова размера(тип int,long ...) коробки
        int [] numbers1 = new int[6];

        int [] numbers2 = new int []{10, 20, 30, 40, 5, 60};

        int [] numbers3 = {10, 20, 30, 40, 5, 60};

        //Индексация начинается с 0

        int shouldBe20 = numbers3[1]; // чтение из массива
        System.out.println(shouldBe20);

        numbers3[2] = 25;
        int shouldBe25 = numbers3[2];
        System.out.println(shouldBe25);

        //пересоздание
        //Индекс последнего элемента равен (длина -1)
        //
        numbers3 = new int[] {1000, 2000, 3000, 4000, 5000};
        System.out.println(numbers3[0]);
        System.out.println(numbers3[1]);
        //System.out.println(numbers3[5]); // Index 5 out of bounds for length 5 {0, 1, 2, 3, 4}

        long [] longs = {1_000};

        Boolean[] bools = {true, false, true, false};

        Short [] shorts = new Short[60*60*24];

        String[] names = new String[3];
        names[0] = "Василий";
        names[1] = "Пётр";
        names[2] = "Олег";

//        User[] myUsers = new User[5];

        char[] chars = new char[0];
        System.out.println(chars.length);
        System.out.println(chars[0]);

        String[][] letters =new String[2][13];
        String[] row1 = letters[0];
        letters[0][1] = "b";
        letters[1][11] = "y";

        int[][] gameOfTrones = {
                {1,2,3,4,5},
                {1,2,3,4},
                {1,2,3},
                {1,2}
        };

        int [][][] cube = new int[3][3][3];

        String[] books = new String[3];
        books[0] = "java для профессионалов";
        books[1] = "Three Musketers";

        String theFirstBook = books[0];
//        System.out.println(theFirstBook.toUpperCase());
        System.out.println(books[0].toUpperCase());
    }

//    int[] numbers = {10,20,30,40};
//    for(int number : numbers){
//        System.out.println(number + "->" + numbers*2);
//    }


}
