public class Main {
    public static void main(String[] args) {
        // initialize animal
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        // initialize dog
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");

        // Pulls from animal class methods
        dog.eat();

        dog.walk();

        dog.run();
    }
}
