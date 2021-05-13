public class Main {
    public static void main(String[] args) {
        MiniCooper minicooper = new MiniCooper(36);

        minicooper.steer(45);

        minicooper.accelerate(30);

        minicooper.accelerate(20);

        minicooper.accelerate(-42);
    }
}
