import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double areaOfWall = 0;
        double totalAreaOfWalls = 0;
        double areaToRemove = 0;
        double totalAreaToRemove = 0;
        double areaToPaint = 0;
        double sizeOfBucket = 0;
        double[] sizeOfBucketsAry;
        int numBuckets = 0;
        int[] numBucketsAry;
        double numBucketsExact = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, welcome to paint calculator app!");

//        System.out.println("\nPlease enter the full area of wall, in meters squared: ");
//        areaOfWall = sc.nextDouble();
        //TODO Allow adding more walls -- Complete
        //TODO Validate input

        System.out.println();

        boolean running = true;
        do {
            System.out.println("Please enter the full area of wall, in meters squared:");

            totalAreaOfWalls += sc.nextDouble();

            System.out.println("More walls to add? Y/N");
            String input = sc.next();

            running = input.equals("N") ? false : true;
        } while (running);

//        System.out.println("\nPlease enter any area you would like to remove (e.g. walls, windows, etc), " +
//                "in meters squared: ");
//        areaToRemove = sc.nextDouble();
        //TODO Allow adding more object to remove -- Complete
        //TODO Validate input

        System.out.println();
        System.out.println();

        running = true;
        do {
            System.out.println("Please enter any area you would like to remove (e.g. walls, windows, etc), " +
                    "in meters squared: ");

            totalAreaToRemove += sc.nextDouble();

            System.out.println("More area to remove? Y/N");
            String input = sc.next();

            running = input.equals("N") ? false : true;
        } while (running);

//        areaToPaint = areaOfWall - areaToRemove;
        areaToPaint = totalAreaOfWalls - totalAreaToRemove;

        System.out.println("\nPlease enter size of bucket, in litres: ");
        sizeOfBucket = sc.nextDouble();
        //TODO Allow more bucket sizes
        //TODO Validate input

        numBucketsExact = areaToPaint / (6.5 * sizeOfBucket);
        numBuckets = (int) Math.ceil(numBucketsExact);

        System.out.println("\nNumber of buckets required are: " + numBuckets);
        System.out.println("\nNumber of buckets required are (exact): " + numBucketsExact);
    }
}
