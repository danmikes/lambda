import java.util.concurrent.Callable;

public class One {

  public class Interfaces {
    Runnable runnable;
    Callable callable;
    Comparable comparable;
  }

  public static void main(String[] args) {

    // Interface Calculate::x
    System.out.println(sumLong.abstractMethod(1, 2));
    System.out.println(sum.abstractMethod(1, 2));
    System.out.println(difference.abstractMethod(1, 2));
    System.out.println(product.abstractMethod(1, 2));
    System.out.println(quotient.abstractMethod(1, 2));

    // Interface Show::show
    show.abstractMethod();
    show.defaultMethod1();
    show.defaultMethod2();
    System.out.println(show.defaultString1());
    System.out.println(show.defaultString2());
    Show.staticMethod1();
    Show.staticMethod2();
    System.out.println(Show.staticString1());
    System.out.println(Show.staticString2());
    System.out.println(show.equals(show) + " (show)");
    System.out.println(show.equals(sum) + " (sum)");
  }

  @FunctionalInterface
  interface Calculate {
    double abstractMethod(double a, double b);
  }

  // function
  static Calculate sum = (a, b) -> a + b;
  static Calculate difference = (a, b) -> a - b;
  static Calculate product = (a, b) -> a * b;
  static Calculate quotient = (a, b) -> a / b;
  // method
  static Calculate sumLong = new Calculate() {
    @Override
    public double abstractMethod(double a, double b) {
      return a + b;
    }
  };

  @FunctionalInterface
  interface Show {
    void abstractMethod();

    default void defaultMethod1() {
      System.out.println("defaultMethod1");
    }

    default void defaultMethod2() {
      System.out.println("defaultMethod2");
    }

    default String defaultString1() {
      return "defaultString1";
    }

    default String defaultString2() {
      return "defaultString2";
    }

    static void staticMethod1() {
      System.out.println("staticMethod1");
    }

    static void staticMethod2() {
      System.out.println("staticMethod2");
    }

    static String staticString1() {
      return "staticString1";
    }

    static String staticString2() {
      return "staticString2";
    }

    boolean equals(Object object);
  }

  // function
  static Show show = () -> System.out.println("abstract1");
  // method
  static Show showLong = new Show() {
    @Override
    public void abstractMethod() {
      System.out.println("abstract1 (Long)");
    }
  };
}
