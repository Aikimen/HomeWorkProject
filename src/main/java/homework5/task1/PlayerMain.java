//Задание №1.data-класс
package homework5.task1;


public class PlayerMain {

    public static void main(String[] args) {

        Boolean isOnline = true;

        Player player1 = new Player();
        player1.setId(1);
        player1.setNickname("FirstPlayer");
        player1.setOnline(isOnline);

        Player player2 = new Player();
        player2.setId(1);
        player2.setNickname("FirstPlayer");
        player2.setOnline(isOnline);

        //Сравниваем ссылки на объекты Player
        System.out.println(player1 == player2);

        //Сравниваем объекты Player с помощью переопределённого метода equals
        System.out.println(player1.equals(player2));
        System.out.println(player1.toString());
        System.out.println(player2.toString());

    }

}
