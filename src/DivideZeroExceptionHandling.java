import java.util.Scanner;

public class DivideZeroExceptionHandling {
    public static int quotient(int numerator, int denominator) {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {
            System.out.printf("numerator:");
            int numerator = getInt();

            System.out.printf("denominator:");
            int denominator = getInt();

            System.out.printf("Result: %d/%d=%d%n", numerator, denominator, quotient(numerator, denominator));
        } catch (java.lang.ArithmeticException textException) {
            System.out.printf("sorry");
        } catch (java.util.InputMismatchException textException) {
            System.out.printf("INTGER!");
        }
    }
    /**
     * THIS METHOD IS CONTINUOUSLY ASK THE USER FOR INPUT UNTIL A VALID INTEGER IS RECEIVED
     * @RETURN THE INTEGER ENTERED BY THE USER
     */
        public static int getInt()
        {
            int num=0;
            while (true)
            {
                Scanner keyboard = new Scanner(System.in);
                try{
                    num = keyboard.nextInt();
                    return num;
                }
                catch (java.util.InputMismatchException textException)
                {
                    System.out.printf("result:");
                }
            }
        }
}
