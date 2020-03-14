public class Five {

    public static void main(String[] args) {
        System.out.println("Start main");
        AddTwoNumbersInterface addTwoNumbersInstance = (a, b) -> {
            System.out.println("Inside Labda()");
            return a + b;
        };

        System.out.println("Before addTwoNumbers()");
        addTwoNumbersMethod(addTwoNumbersInstance);
    }

    private static void addTwoNumbersMethod(AddTwoNumbersInterface addTwoNumbersInstance) {
        System.out.println("Start addTwoNumbersMethod()");
        System.out.println("Sum of two numbers: " + addTwoNumbersInstance.sumOfTwoNumbersMethod(100,200));
        System.out.println("End addTwoNumbersMethod()");
    }
}

interface AddTwoNumbersInterface {
    int sumOfTwoNumbersMethod(int a, int b);
}
