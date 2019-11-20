import java.security.SecureRandom;

public class Warmup {
    public static void main(String[] args)
    {
        // create an array that can hold 5 integers
        int[] array = new int[5];

        //create aan array that can hold 5 integers
        SecureRandom rng = new SecureRandom();
        int randomNum=rng.nextInt(5)+1;
        System.out.printf("");

        // assign a value to each array element and print
        for (int i = 0; i < array.length; i++) {
        array[i] = rng.nextInt(100);

        displayintarray(array);
        System.out.printf("largest:",getlargest(array));
    }
        /**
         *
         */
        public static int getlargest = arrayLargest[0];
        {
            int largest = array[00];
            for(int numToCompare;array)
            {
                if (numToCompare,largest)
                    largest=numToCompare;
            }
            return;
        }



        /**
         *create a method that accept array as an argument
         * and display it on a line separated by commas
         */
    public static void displayIntArray(int[] arraynum)
        {
            for (int i=0; i<array.length;i++)
                System.out.printf("%d%s",arraynum[i],(i==arraynum.length-1)?"":",");
        }
}
}

