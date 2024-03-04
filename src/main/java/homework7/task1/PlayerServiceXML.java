package homework7.task1;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;

public class PlayerServiceXML implements PlayerService {

    private final String FILE_NAME;

    // Объект типа Players, в котором храним список игроков
    private Players players;


    public PlayerServiceXML(String fileName) throws IOException {
        this.FILE_NAME = fileName;

        // Загружаем данные из файла при создании сервиса
        loadFromFile();
    }

    @Override
    public int getPlayerById(int id) {

        // Здесь реализация получения игрока по ID из списка players.getListOfPlayers()

//                players.getListOfPlayers().remove();

        return 0;
    }

    @Override
    public Collection<Player> getPlayers() {
        return players.getListOfPlayers();
    }

    @Override
    public int createPlayer(String nickname) throws IOException {
        int newId = players.getListOfPlayers().size();
        var newListOfPlayers = players.getListOfPlayers();
        newListOfPlayers.add(new Player(newId, "NewNick" + newId, 10, true));
        players.setListOfPlayers((List<Player>) newListOfPlayers);

        saveToFile(players);

        return newId;
    }

    @Override
    public Player deletePlayer(int id) {

        // Здесь реализация удаления игрока по ID из списка players.getListOfPlayers()
        // Не забывайте сохранять в файл
//        players.getListOfPlayers().remove();
        return null;
    }

    @Override
    public int addPoints(int playerId, int points) {

        // Здесь реализация

        return 0;
    }

    // Сделайте эти два метода private после написания всех реализаций
    public void saveToFile(Players listOfPlayers) throws IOException {
        XmlMapper mapper = new XmlMapper();
        var string = mapper.writeValueAsString(listOfPlayers);
        Files.writeString(Path.of(FILE_NAME), string);
    }

    public void loadFromFile() throws IOException {
        var stringFromFile = Files.readString(Path.of(FILE_NAME));
        XmlMapper mapper = new XmlMapper();

        // Здесь пишем в список игроков, который сейчас в памяти
        // или возвращаем этот список
        players = mapper.readValue(stringFromFile, Players.class);
    }

}
