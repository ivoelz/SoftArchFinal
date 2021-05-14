package creator;

/**
 * This singleton factory creates an enemy's HP.
 */

public class EnemyFactory {

    private static EnemyFactory instance = new EnemyFactory();

    // Constructor
    private EnemyFactory() {
    }

    // Returns singleton instance of EnemyFactory
    public static EnemyFactory getInstance() {
        return instance;
    }

    public static Enemy getEnemy(int HP) {
        if (HP == 200) {
            return new Ogre();
        } else if (HP == 150) {
            return new Python();
        }
        return null;
    }

}
