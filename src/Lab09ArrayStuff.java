import java.util.Scanner;
import java.util.Random;

public class Lab09ArrayStuff
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        Random rnd = new Random();

        int[] dataPoints = new int[100];

        int i;
        int sum = 0;
        double average;

        int userValue;
        int count = 0;

        int searchValue;
        boolean found = false;
        int position = -1;

        int min;
        int max;

        // Task 2

        for(i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Task 3

        System.out.println("Contents of dataPoints:");

        for(i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }

        System.out.println();

        // Task 4

        for(i = 0; i < dataPoints.length; i++)
        {
            sum = sum + dataPoints[i];
        }

        average = (double)sum / dataPoints.length;

        System.out.println("\nThe sum of the values in dataPoints is: "
                + sum);

        System.out.println("The average of the values in dataPoints is: "
                + average);

        // Task 5

        userValue = SafeInput.getRangedInt(
                in,
                "Enter a value to count",
                1,
                100);

        // Task 6

        for(i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == userValue)
            {
                count++;
            }
        }

        System.out.println("The value "
                + userValue
                + " was found "
                + count
                + " times in the array.");

        // Task 7

        searchValue = SafeInput.getRangedInt(
                in,
                "Enter a value to locate",
                1,
                100);

        for(i = 0; i < dataPoints.length; i++)
        {
            if(dataPoints[i] == searchValue)
            {
                position = i;
                found = true;
                break;
            }
        }

        if(found)
        {
            System.out.println("The value "
                    + searchValue
                    + " was found at index "
                    + position + ".");
        }
        else
        {
            System.out.println("The value "
                    + searchValue
                    + " was not found in the array.");
        }

        // Task 8

        min = dataPoints[0];
        max = dataPoints[0];

        for(i = 1; i < dataPoints.length; i++)
        {
            if(dataPoints[i] < min)
            {
                min = dataPoints[i];
            }

            if(dataPoints[i] > max)
            {
                max = dataPoints[i];
            }
        }

        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);

        // Task 9

        System.out.println("Average of dataPoints is: "
                + getAverage(dataPoints));
    }

    public static double getAverage(int values[])
    {
        int sum = 0;
        int i;

        for(i = 0; i < values.length; i++)
        {
            sum = sum + values[i];
        }

        return (double)sum / values.length;
    }
}