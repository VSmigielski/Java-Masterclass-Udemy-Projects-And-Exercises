// two fields, width, height (double)
// 2 constructors, one no-arg (default), one with 2 parameters
// if width or height is < 0, set to 0
// getters & setters
// method getArea to calculate the area of the given wall
public class Wall {
    private double width;
    private double height;

    public Wall() {
        this(0, 0);
    }

    public Wall(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width < 0) {
            width = 0;
        } else {
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            height = 0;
        } else {
            this.height = height;
        }
    }

    public double getArea() {
        return width * height;
    }
}
