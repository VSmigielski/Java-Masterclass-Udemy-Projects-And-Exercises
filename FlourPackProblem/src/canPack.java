public class canPack {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int totalBig = bigCount * 5;

        if (totalBig <= goal) {
            int leftover = goal - totalBig;
            return (leftover <= smallCount);
        } else {
            int remainder = goal % 5;
            return (remainder <= smallCount);
        }
    }
}
