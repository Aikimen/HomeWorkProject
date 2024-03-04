package main.homework5.task6;

import homework5.task6.Player;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {

        Map<Player, Integer> points = new HashMap<>();
        Player player1 = new Player(1,"Ivan1", true);
        Player player2 = new Player(2,"Ivan2", true);
        Player player3 = new Player(3,"Ivan3", true);
        Player player4 = new Player(4,"Ivan4", true);


        points.put(player1, 0);
        points.put(player2, 0);
        points.put(player3, 0);
        points.put(player4, 0);

        points.replace(player1, 5);
        points.replace(player2, 10);
        points.replace(player4, 4);
        points.replace(player3, 7);


        // list = [<Player1, Integer1>; <Player2, Integer2>...]

        //Инициализация листа(списка) сразу с добавлением по entrySet() значениями
        List<Map.Entry<Player, Integer>> list = new ArrayList<>(points.entrySet());
//        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        //Сортировка через компаратор
        list.sort(Map.Entry.comparingByValue());

     /*   for (int i = 0; i < 3; i++) {
            System.out.println(list.get(i));
        }*/

 /*       for (int i = 0; i < 3; i++) {
            System.out.println(list.get(list.size()- 1 - i));
        }*/

        for (int i = 10; i > 0; i--) {
            System.out.println(list.get(i));
        }
        //Задача о перевёртывании массива?


    }
}
