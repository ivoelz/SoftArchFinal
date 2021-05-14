package creator;

/**
 * This class is one of the rooms the user can travel to in the game.
 * This class only has a single responsibility: holding the Basement variables.
 */

public class Basement implements Room {
    private String roomName;
    private String roomDescription;

    // Setters and getters
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String Basement) {
        this.roomName = Basement;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = "cold cement room, the lights flicker and water drips.";
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
