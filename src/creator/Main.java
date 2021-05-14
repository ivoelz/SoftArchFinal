package creator;

import java.util.Scanner;

/**
 * Describes the room to the player then asks if they want to pick up an item
 * or go through a door. Based on what the player chooses they might add points
 * to their score or lose HP. In the first room there is an obvious exit to a new room
 * or a secret exit to a tunnel that can be found when the player picks up the flashlight
 * The players score or HP will be displayed when it is effected. The player can interact
 * with items and enemies.
 * This class only has a single responsibility: interacting with the user.
 */

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("You wake up in a dark cold room.");
        System.out.println("It's dark but you can see a crack of light from under a door in front of you.");
        System.out.println("Pick up flashlight (F) or Go through door (D)");
        String playerChoice = scanner.nextLine();

        // Create a player object
        Player player = new Player();

        // Create Tunnel object
        Tunnel tunnel = new Tunnel();

        // Create Python object
        Python python = new Python();

        // Create a monster object
        Ogre ogre = new Ogre();

        // Create a Basement object
        Basement basement = new Basement();

        // Game changes based on user input
        if (playerChoice.equals("F")) {
            System.out.println("You earned 10 points from finding a flashlight");
            System.out.println("Using your flashlight, you found another exit.");
            player.setScore(10);

            // Output new score
            System.out.println("Your score is now: " + player.getScore());
            System.out.println("The new exit is " + tunnel.getRoomDescription());
            System.out.println("As you crawl through the tunnel you see a python! Do you attack (ATK) or run (R)?");
            playerChoice = scanner.nextLine();
        } else if (playerChoice.equals("D")) {
            System.out.println("You slowly peak through the door and find a " + basement.getRoomDescription());
            System.out.println("As you enter, a huge ogre comes out from the corner and attacks you.");
            player.setHP(80);

            // Output new HP
            System.out.println("Oh no! Your HP is now: " + player.getHP());
            System.out.println("Would you like to hide? (H) Or fight back? (A)");
            playerChoice = scanner.nextLine();
        }


        if (playerChoice.equals("ATK")) {
            python.setHP(130);
            System.out.println("You attacked the python! The python's HP is now " + python.getHP());
        } else if (playerChoice.equals("R")) {
            System.out.println("Good job! You escaped the python!");
        }

        // Based on the players past choices output now options
        if (playerChoice.equals("H")) {
            System.out.println("You found a locker to hide in and the ogre got uninterested.");
        } else if (playerChoice.equals("A")) {
            System.out.println("You attacked the ogre and it ran back to its corner");
            ogre.setHP(180);

            // Output monsters new HP
            System.out.println("The ogre's HP is now: " + ogre.getHP());
        }


    }
}
