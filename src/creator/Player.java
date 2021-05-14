package creator;

/**
 * This class is controlled by the user of the game. It holds all the Player
 * variables instead of keeping them in the Main class. I created setters and getters
 * so I can use these variables in the Main class.
 * This class only has a single responsibility: holding the Player variables.
 */

public class Player {
    private int HP = 100;
    private int score;

    // Setters and getters
    public int getHP() {
        return HP;
    }

    public void setHP(int hp) {
        this.HP = hp;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int Score) {
        this.score = Score;
    }
}
