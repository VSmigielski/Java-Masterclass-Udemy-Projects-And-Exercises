import java.util.Locale;
import java.util.Objects;

// public - access modifier unrestricted access to the class
// private - no other class can access this class
// protected - allows other classes within the package to access this class
// we can remove the access modifier fully
public class Car {

    // State of the car as fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
