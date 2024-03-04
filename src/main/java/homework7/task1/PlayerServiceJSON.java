package homework7.task1;

import java.nio.file.Path;
import java.util.Collection;

public class PlayerServiceJSON implements PlayerService {


    //Задаём переменную константу Path для файла json
    Path JSONPATH = Path.of("src/main/resources/Library/players.json");
    @Override
    public int getPlayerById(int id) {
        return 0;
    }

    @Override
    public Collection<Player> getPlayers() {
        return null;
    }

    @Override
    public int createPlayer(String nickname) {
        return 0;
    }

    @Override
    public Player deletePlayer(int id) {
        return null;
    }

    @Override
    public int addPoints(int playerId, int points) {
        return 0;
    }
}
