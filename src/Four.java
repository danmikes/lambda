import java.util.function.Function;

public class Four {

    public static void main(String[] args) {
        method();
        function();
    }

    // function
    static void function() {
        Function<Integer, Integer> function = n1 -> n1 * n1;
        System.out.println("Function: " + function.apply(5));
    }

    // method
    static void method() {
        int n1 = 5;
        int squareOfNumber = calculateSquareOfNumber(n1);
        System.out.println("Method: " + squareOfNumber);
    }
    static int calculateSquareOfNumber(int n1) {
        return n1 * n1;
    }

}
