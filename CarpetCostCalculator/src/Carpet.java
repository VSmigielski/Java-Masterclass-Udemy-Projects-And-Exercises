// 1 field, cost (double)
// 1 constructor, initialize field
// if cost < 0, set to 0
// getCost no params, return value of cost field
//
public class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }
}
