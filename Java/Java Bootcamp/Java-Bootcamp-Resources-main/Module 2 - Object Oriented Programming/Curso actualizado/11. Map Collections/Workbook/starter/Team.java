import java.util.HashMap;
import java.util.Map;

public class Team {

    private String name;
    private Map<String, String> players;

    public Team(String name) {
        this.name=name;
        this.players= new HashMap<>();
    }
    
    public String getName() {
        // TODO
        return new String(name);
    }

    public void setName(String name) {
        this.name= new String (name);
    }

    public String getPlayer(String position) {
        // TODO
        return this.players.get(position);
    }

    public void setPlayer(String position, String player) {
        this.players.put(position, player);
    }    

    
}
