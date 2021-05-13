// Represent a point in a 2D space using x and y (int)
// 2 constructors, no-arg and both fields
// getters/setters
// distance without parameters, return distance between point and point (0,0) as a double
// distance with 2 parameters x, y, return the distance between this point and point x,y as a double
// distance with another Point, return distance between this Point and another Point as double
public class Point {
    private int x;
    private int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0,0);
    }

    public double distance(int x, int y) {
        return Math.sqrt( (getX() - x) * ( getX() - x)  + (getY() - y ) * (getY() - y));
    }

    public double distance(Point point) {
        return Math.sqrt( (getX() - point.getX()) * ( getX() - point.getX())  + (getY() - point.getY() ) * (getY() - point.getY()));
    }
}
