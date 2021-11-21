public class Two {

  public static void main(String[] args) {
    // method
    HelloLong showLong = new HelloLong();
    showLong.hello();

    // function
    Hello show = () -> System.out.println("Hello");
    show.hello();
  }
}

@FunctionalInterface
interface Hello {
  void hello();
}

class HelloLong implements Hello {
  @Override
  public void hello() {
    System.out.println("Hello");
  }
}
