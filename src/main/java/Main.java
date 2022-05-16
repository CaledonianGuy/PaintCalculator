import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double totalAreaOfWalls = 0;
        double totalAreaToRemove = 0;
        double areaToPaint;
//        double sizeOfBucket;
        HashMap<Integer, Integer> bucketSizesMap = new HashMap<>();
//        int numBuckets;
//        double numBucketsExact;

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

        /*
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

        System.out.println("\nThank you for using the calculator!");

         */


        System.out.println("\nPlease enter sizes, in litres (separate each size with a comma and space):");
        sc.nextLine();
        String[] sizes = sc.nextLine().split(", ");

        int[] keys = new int[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            int num = Integer.parseInt(sizes[i]);
            if (!bucketSizesMap.containsKey(num)) {
                bucketSizesMap.put(num, 0);
            }
            keys[i] = num;
        }

        Arrays.sort(new int[][]{keys}, Collections.reverseOrder());

        double litresNeeded = areaToPaint / 6.5;

        for (Integer key : keys) {
            if (litresNeeded >= key) {
                bucketSizesMap.put(key, (int) Math.floor(litresNeeded / key));
                litresNeeded %= key;
            } else if (litresNeeded < key && litresNeeded != 0) {
                bucketSizesMap.put(key, bucketSizesMap.get(key) + 1);
                litresNeeded = 0;
            }
        }

        System.out.print("\n");

        System.out.println("Number of buckets needed:");
        for (Integer key : keys) {
            System.out.println("Number of " + key + " litre sized buckets needed: " + bucketSizesMap.get(key));
        }

        System.out.println("\nThank you for using the calculator!");
    }
}
