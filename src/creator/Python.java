package creator;

/**
 * This class was created to hold the Monsters variables. I added setters
 * and getters so I can use these variables in the Main class.
 * This class only has a single responsibility: holding the Monster variables.
 */

public class Python implements Enemy {
    private int HP = 150;

    // Setters and getters
    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    @Override
    public int HP() {
        return HP;
    }
}

