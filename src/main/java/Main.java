import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double areaOfWall = 0;
        double areaOfWalls = 0;
        double areaToRemove = 0;
        double areaToPaint = 0;
        double sizeOfBucket = 0;
        double[] sizeOfBucketsAry;
        int numBuckets = 0;
        int[] numBucketsAry;
        double numBucketsExact = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, welcome to paint calculator app!");

        System.out.println("\nPlease enter the full area of wall, in meters squared: ");
//        areaOfWall = sc.nextDouble();
        //TODO Allow adding more walls
        //TODO Validate input

        boolean test = true;
        String input;
        do {
//            areaOfWalls += sc.nextDouble();
//            System.out.println(areaOfWalls);
//            sc.next();
            System.out.println("More walls to add? Y/N");
            input = sc.nextLine();
            System.out.println(input);
            System.out.println(input.equals("N"));
            if (input.equals("N")) {
                test = false;
            } else {
                System.out.println("Please enter the full area of wall, in meters squared: ");
            }
//            if (sc.hasNext("[A-Za-z]*")) {
//
//            } else {
//                areaOfWalls += sc.nextDouble();
//                System.out.println("More walls to add? Y/N");
//                input = sc.nextLine();
//                if (input.equals("N")) {
//                    test = false;
//                }
//            }
        } while (test);

        System.out.println("\nPlease enter any area you would like to remove (e.g. walls, windows, etc), " +
                "in meters squared: ");
        areaToRemove = sc.nextDouble();
        //TODO Allow adding more object to remove
        //TODO Validate input

        areaToPaint = areaOfWall - areaToRemove;

        System.out.println("\nPlease enter size of bucket, in litres: ");
        sizeOfBucket = sc.nextDouble();
        //TODO Allow more bucket sizes
        //TODO Validate input

        numBucketsExact = areaToPaint / (6.5 * sizeOfBucket);
        numBuckets = (int) Math.ceil(numBucketsExact);

        System.out.println("\nNumber of buckets required are: " + numBuckets);
        System.out.println("\nNumber of buckets required are (exact): " + numBucketsExact);


        /*
        System.out.println("\nPlease enter the full area of wall, in meters squared:");
        String testString = sc.nextLine();

        do {
            while (testString.isEmpty() || testString.isBlank()) {
                System.out.println("\nInvalid input! Input was empty or blank." +
                        "Please enter the full area of wall, in meters squared:");
                testString = sc.nextLine();
            }



            if (Double.) {

            }

            System.out.println("Any more walls to add? Y/N");
            testString = sc.nextLine();
        } while (testString != "Y");


        System.out.println("here boi!!!!!!!");
        System.out.println(testString.trim());
        while (!sc.hasNext()) {

        }

         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi, welcome to paint calculator app!");

        System.out.println("\nPlease enter size of buckets, in litres (space buckets with comma): ");
        String input = sc.nextLine();
        String[] bucketSizes = input.split(",");

        sizeOfBuckets = new double[bucketSizes.length];
        int index = 0;
        for (String size : bucketSizes) {
            sizeOfBuckets[index] = Double.parseDouble(size);
            ++index;
        }
        Arrays.sort(new double[][]{sizeOfBuckets}, Collections.reverseOrder());
        double litresNeeded = areaToPaint / 6.5;
        numBucketsArray = new int[sizeOfBuckets.length];
        for (int i = 0; i < sizeOfBuckets.length; ++i) {
            litresNeeded
        }
         */
    }
}
