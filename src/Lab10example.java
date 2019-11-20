import java.security.SecureRandom;

public class Lab10example {
    public static void main(String[] args) {
        SecureRandom rng = new SecureRandom();
        int randomNum=rng.nextInt(10)+1;
        System.out.println("the random number is:%d");
        for (int i = 0; i <randomNum; i++) {
            System.out.println("My name is Jaret");
        }
    }
}
