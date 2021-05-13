public class Main {
    public static void main(String[] args) {
        // New data type porsche of type car
        Car porsche = new Car();
        // New data type holden of type car
        Car holden = new Car();

        // Defined type (violates encapsulation rules because one would need to use public fields)
        // porsche.model = "Carrera";

        // Causes an exception (NullPointer)
        // porsche = null;

        // Model is null (default setting)
        System.out.println("Model is " + porsche.getModel());

        // This gives unknown because it does not accept this model
        porsche.setModel("911");
        // Retrieves the model of the object porsche
        System.out.println("Model is " + porsche.getModel());

        // Set the model of the object
        porsche.setModel("Carrera");
        // Retrieve/show the model that was given
        System.out.println("Model is " + porsche.getModel());

    }
}
