import java.util.function.Function;

public class Three {

    public static void main(String[] args) {
        method();
        function();
    }

    // function
    private static void function() {
        double rateUsdToInr = 71.0;
        Function<Integer, Double> function = usd -> usd * rateUsdToInr;
        System.out.println("Method: " + " USD = " + function.apply(10) + " INR");
    }

    // method
    private static void method() {
        int usd = 10;
        double inr = convertUsdToInr(usd);
        System.out.println("Function: " + " USD = " + inr + " INR");
    }
    private static double convertUsdToInr(int usd) {
        double inrUsdRate = 71.0;
        return usd * inrUsdRate;
    }
}
