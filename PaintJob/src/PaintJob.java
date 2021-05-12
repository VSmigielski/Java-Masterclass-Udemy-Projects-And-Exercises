public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double areaToCover = width * height;
        double buckets = areaToCover / areaPerBucket;

        buckets = Math.ceil(buckets);
        if ((extraBuckets - buckets) == 0) {
            return 0;
        } else {
            int leftoverToBuy = ((int) buckets - extraBuckets);
            return leftoverToBuy;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double areaToCover = width * height;
        double buckets = areaToCover / areaPerBucket;

        buckets = Math.ceil(buckets);

        int leftoverToBuy = ((int) buckets);
        return leftoverToBuy;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double buckets = area / areaPerBucket;

        buckets = Math.ceil(buckets);

        int leftoverToBuy = ((int) buckets);
        return leftoverToBuy;
    }
}

