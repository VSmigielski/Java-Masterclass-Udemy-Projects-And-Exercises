public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int goldRating) {
        this.style = style;
        this.battery = battery;
        this.goldRating = goldRating;
    }

    public void turnOn() {
        System.out.println("Turning on the lamp");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
