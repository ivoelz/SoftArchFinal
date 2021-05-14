package creator;

/**
 * This class uses the Strategy Pattern. Implementing this interface allows a class to
 * become more formal about the behavior it provides.
 * The Basement and Tunnel class both implement this class because they are rooms.
 */

public interface Room {
    String roomName();

    String roomDescription();
}
