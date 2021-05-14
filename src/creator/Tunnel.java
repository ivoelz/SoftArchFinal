package creator;

/**
 * This class is one of the rooms the user can travel to in the game.
 * This class only has a single responsibility: holding the Tunnel variables.
 */

public class Tunnel implements Room {
    private String roomName;
    private String roomDescription;

    // Setters and getters
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String Tunnel) {
        this.roomName = Tunnel;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = "A tight dirt tunnel with moss growing all round it.";
    }

    @Override
    public String roomName() {
        return roomName;
    }

    @Override
    public String roomDescription() {
        return roomDescription;
    }
}
