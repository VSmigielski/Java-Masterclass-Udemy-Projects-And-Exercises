public class EnhancedPlayer {

    private String name;
    // Default health to 100
    private int hitpoints = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        // Basic validation
        if (health > 0 && health <= 100) {
            this.hitpoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.hitpoints = this.hitpoints - damage;
        if (this.hitpoints <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining for the player
        }
    }

    public int getHealth() {
        return hitpoints;
    }
}
