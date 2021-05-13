public class Main {
    public static void main(String[] args) {
        // Create a new instance of MiniCooper class
        MiniCooper minicooper = new MiniCooper(36);

        // Use the instance method steer
        minicooper.steer(45);

        // Use the instance method accelerate
        minicooper.accelerate(30);
        minicooper.accelerate(20);
        // Use the instance method accelerate to decelerate
        minicooper.accelerate(-42);
    }
}
