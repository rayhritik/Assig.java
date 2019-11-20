public class ExceptionAndTheStack {
    public static void main (String[] args){
        firstmethod();
    }
    public static void firstmethod()
    {
        secondmethod();
        Thread.dumpStack();
    }
    public static void secondmethod()
    {

    }
}

