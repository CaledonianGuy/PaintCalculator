import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double totalAreaOfWalls = 0;
        double totalAreaToRemove = 0;
        double areaToPaint = 0;
        double sizeOfBucket = 0;
        double[] sizeOfBucketsAry;
        HashMap<Integer, Integer> bucketSizesMap = new HashMap<Integer, Integer>();
        int numBuckets = 0;
        int[][] numBucketsAry;
        double numBucketsExact = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, welcome to paint calculator app!");

        //TODO Allow adding more walls -- Complete
        //TODO Validate input

        System.out.print("\n");

        //Adding Areas to paint -- allows adding of multiple areas.
        boolean running;
        do {
            System.out.println("Please enter the full area of wall, in meters squared:");

            totalAreaOfWalls += sc.nextDouble();

            System.out.println("More walls to add? Y/N");
            String input = sc.next();

            running = !input.equals("N");
        } while (running);

        //TODO Allow adding more object to remove -- Complete
        //TODO Validate input

        System.out.print("\n");

        //Removing Areas to paint -- allows removing of multiple areas.
        do {
            System.out.println("Please enter any area you would like to remove (e.g. walls, windows, etc), " +
                    "in meters squared:");

            totalAreaToRemove += sc.nextDouble();

            System.out.println("More area to remove? Y/N");
            String input = sc.next();

            running = !input.equals("N");
        } while (running);

        //Calculates Total Area to paint.
        areaToPaint = totalAreaOfWalls - totalAreaToRemove;

        System.out.println("\nPlease enter size of bucket, in litres:");
        sizeOfBucket = sc.nextDouble();
        //TODO Allow more bucket sizes -- Complete
        //TODO Validate input

        System.out.print("\n");

        //Calculates the number of buckets of paint required.
        numBucketsExact = areaToPaint / (6.5 * sizeOfBucket);
        numBuckets = (int) Math.ceil(numBucketsExact);

        System.out.println("Number of buckets required are: " + numBuckets);
        System.out.println("Number of buckets required are (exact): " + numBucketsExact);

        /*


//        System.out.println("\nPlease enter number of bucket sizes would like to add:");
//        numBucketsAry = new int[sc.nextInt()][2];
//        sc.nextLine();

        System.out.println("Please enter sizes, in litres (separate each size with a comma and space):");
//        String input = sc.nextLine();
        String[] sizes = sc.nextLine().split(", ");

        for (int i = 0; i < sizes.length; i++) {
//            numBucketsAry[i][0] = Integer.parseInt(sizes[i]);
//            numBucketsAry[i][1] = 0;
            int num = Integer.parseInt(sizes[i]);
            if (!bucketSizesMap.containsKey(num)) {
                bucketSizesMap.put(num, 0);
            }
        }

        double litresNeeded = areaToPaint / 6.5;

         */

        //Calculates the number of buckets of paint required.
        /*
        Checks if the bucket size is less than litres needed.
        Finds number of times bucket size divides into litres needed.
        Find the remained and sets litres needed to this.
        If bucket size is less than litres needed,
        Then 1 is added or the next bucket size is set to 1.
         */
        /*
        int index = 0;
        while (litresNeeded > 0) {
            if (litresNeeded > numBucketsAry[index][0]) {
                numBucketsAry[index][1] = (int) Math.floor(litresNeeded / numBucketsAry[index][0]);
                litresNeeded %= numBucketsAry[index][0];
                if (litresNeeded < numBucketsAry[index][0]) {
                    numBucketsAry[index][1] += 1;
                    litresNeeded = 0;
                }
            } else {
                numBucketsAry[index][1] = 1;
                litresNeeded = 0;
            }
            index++;
        }

        for (Integer size : bucketSizesMap.keySet()) {
            if (litresNeeded > size) {
                bucketSizesMap.put(size, (int) Math.floor(litresNeeded / bucketSizesMap.get(size)));
                litresNeeded %= bucketSizesMap.get(size);
            }
        }

        System.out.print("\n");

        System.out.println("Number of buckets needed:");
        for (int i = 0; i < numBucketsAry.length; i++) {
            System.out.println("Number of " + numBucketsAry[i][0] + " litre sized buckets needed: " + numBucketsAry[i][1]);
        }

         */
    }
}
