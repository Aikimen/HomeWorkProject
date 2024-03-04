package homework7.task1;

import java.io.IOException;
import java.util.List;

public class TestClass {
    public static void main(String[] args) throws IOException {

        var service = new PlayerServiceXML("src/main/resources/Library/fileXML.xml");

        var playerId1 = new Player(1, "Player1", 10, true);
        var playerId2 = new Player(2, "Player2", 11, false);
        var playerId3 = new Player(3, "Player3", 0, true);

        Players players = new Players(List.of(playerId1, playerId2, playerId3));

        //service.loadFromFile();

        //service.getPlayers().forEach(System.out::println);

        service.saveToFile(players);

        /*if (service.getPlayerById(1) == null) {
            System.out.println("No such player");
        } else System.out.println(service.getPlayerById(1));*/

        //var player = service.getPlayerById(10);

        System.out.println("sdgregertg");

        //service.saveToFile();


    }
}
