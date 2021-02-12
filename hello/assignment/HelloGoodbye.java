import edu.princeton.cs.algs4.StdOut;

public class HelloGoodbye {
    public static void main(String[] args) {
        StdOut.println(String.format("Hello %s and %s.", args[0], args[1]));
        StdOut.println(String.format("Goodbye %s and %s.", args[1], args[0]));
    }

}
