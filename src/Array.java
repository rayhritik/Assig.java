import sun.awt.AWTAccessor;
import sun.plugin2.message.transport.TransportFactory;

import javax.script.ScriptContext;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int grade1 = 89;
        int grade2 = 78;
        int grade3 = 82;
        int grade4 = 94;

        String name = "ray";

        //the pattern for declaring variables is use the data type and then give the variable
        //a name
        Scanner keyboard = new Scanner(System.in);
        int[] grades = new int[4];
        int[] grades2 = {89, 78, 82, 94};

        grades[0] = 89;
        grades[1] = 78;
        grades[2] = 82;
        grades[3] = 94;


        //loop to show what is inside the array
        for (int i = 0; i < grades.length; i++)
            System.out.printf("index %d has value:%d%n", i, grades[i]);

        //add 5 to each number in the array by using loop
        //grades[0]+=5;
        // grades[1]+=5;
        // grades[2]+=5;
        //  grades[3]+=5;
        for (int i = 0; i < grades.length; i++)
            grades[i] = grades[i] + 5;
        //
        System.out.println("\nAfter adding 5");
        for (int i = 0; i < grades.length; i++)
            System.out.printf("index %d has value:%d%n", i, grades[i]);

        System.out.println("\nComparing the average of the 2 arrays:");
        System.out.printf("%.1f%%", getAvg(grades));
        System.out.printf("%.2f%%", getAvg(grades2));
        //exercise
        System.out.printf("Smallest number in grades");
    }

    /**
     * this method accepts an array of integers and returns the average
     * as a double
     */
    public static double getAvg(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];

        return sum / numbers.length;

    }

    public static int min(int[] integers) {
        int min = integers[0];
        for (int i = 1; i < integers.length; i++) ;


        return min;
    }
}

