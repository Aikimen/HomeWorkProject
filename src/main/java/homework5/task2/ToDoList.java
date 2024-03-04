package homework5.task2;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    public static void main(String[] args) {

        // Задание №2. Список дел.


        List<String> toDoList = new ArrayList<>();

        toDoList.add("Встать с кровати!");
        toDoList.add("Умыться.");
        toDoList.add("Почистить зубы.");
        toDoList.add("Сделать зарядку.");
        toDoList.add("Выпить чаю.");

        //реализация через for

//        for (int i = 0; i < toDoList.size(); i++) {
//            System.out.println("Задача" + i + ":" + "{" + toDoList.get(i) + "}");
//        }


        //реализация через for-each
        for (String i:
             toDoList) {
            System.out.println("Задача" + (toDoList.indexOf(i) + 1) + ":" + "{" + i + "}");
        }

    }
}
