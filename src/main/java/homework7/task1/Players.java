package homework7.task1;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.*;

import java.util.Collection;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JacksonXmlRootElement(localName = "Players")
public class Players {

    @Setter
    @Getter
    @JacksonXmlProperty(localName = "Player")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Player> listOfPlayers = null;

    public Collection<Player> getListOfPlayers() {
        return listOfPlayers;
    }


    public void setListOfPlayers(List<Player> newListOfPlayers) {
        this.listOfPlayers = newListOfPlayers;

    }
}
