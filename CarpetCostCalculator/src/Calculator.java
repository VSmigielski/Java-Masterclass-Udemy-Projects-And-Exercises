// two fields, Floor floor and Carpet carpet
// 1 constructor, initialize both fields
// getTotalCost, no params return calculated totalCost to cover the floor with the carpet
public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return (floor.getArea() * carpet.getCost());
    }
}
