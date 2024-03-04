package homework5.task1;

import java.util.Objects;

//Задание №1.data-класс
public class Player {

    private int id;
    private String nickname;
    private Boolean isOnline;

    //Создание геттеров и сеттеров;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Boolean getOnline() {
        return isOnline;
    }

    public void setOnline(Boolean online) {
        isOnline = online;
    }

    //Переопределение методов equals, hash, to String;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return getId() == player.getId() && Objects.equals(getNickname(), player.getNickname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname);
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", isOnline=" + isOnline +
                '}';
    }
}
