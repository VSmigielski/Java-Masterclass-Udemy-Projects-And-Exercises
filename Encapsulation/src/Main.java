public class Main {
    public static void main(String[] args) {
        // Wrong way
        Player player = new Player();

        // May have forgotten to add one field since it is written in manually when public
        player.fullName = "Veronica Smigielski";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        // This takes control out of the Player class
        player.health = 100;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        // Right way through encapsulation
        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Veronica", 50, "Sword");
        // When accessing health's property, must use a getter rather than direct access
        System.out.println("Initial health is " + enhancedPlayer.getHealth());

    }
}
