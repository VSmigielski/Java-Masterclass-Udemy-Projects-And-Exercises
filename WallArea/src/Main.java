public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall();
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

        Wall wall2 = new Wall(5, 5);
        System.out.println("width= " + wall2.getWidth());
        System.out.println("height= " + wall2.getHeight());
        System.out.println("area= " + wall2.getArea());

        Wall wall3 = new Wall(5, -1);
        System.out.println("width= " + wall3.getWidth());
        System.out.println("height= " + wall3.getHeight());
        System.out.println("area= " + wall3.getArea());
    }
}
