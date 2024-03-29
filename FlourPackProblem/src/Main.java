// Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.
// The parameter bigCount represents the count of big flour bags (5 kilos each)
// The parameter smallCount represents the count of small flour bags (1 kilo each)
// The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
// Therefore, the sum of the kilos bigCount and smallCount must be at least equal to the value of goal. The method should
// return true if it is possible to make a package with goal kilos of flour
// If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9
// bigCount = 2, and smallCount = 0, the method should return false since each bag is 5 kilos and cannot be divided. However,
// if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because 1 full bigCount bag and 4 full
// smallCount bags equal goal and it's okay if there are additional bags leftover

// If any parameters are negative, return false

public class Main {
    public static void main(String[] args) {
        // Returns false
        boolean result = canPack.canPack(1, 0, 4);
        System.out.println(result);
        // Returns true
        result = canPack.canPack(1, 0, 5);
        System.out.println(result);
        // Returns true
        result = canPack.canPack(0, 5, 4);
        System.out.println(result);
        // Returns true
        result = canPack.canPack(2, 2, 11);
        System.out.println(result);
        // Returns false
        result = canPack.canPack(-3, 2, 12);
        System.out.println(result);
    }
}

