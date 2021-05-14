package creator;

/**
 * This class uses the Strategy Pattern. Implementing this interface allows a class to
 * become more formal about the behavior it provides.
 * The Ogre and Python class both implement this class because they are enemy's.
 */

public interface Enemy {
    int HP();
}
