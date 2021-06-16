// Abstract class
abstract class Hello {
  // Abstract method (does not have a body)
  public abstract void typeHello();
  // Regular method
  public void type() {
    System.out.println("HELLO");
  }
}

// Subclass (inherit from Animal)
class Type extends Hello {
  public void typeHello() {
    // The body of animalSound() is provided here
    System.out.println("Hello World");
  }
}

class AbstractDemo {
  public static void main(String[] args) {
    Type t = new Type(); // Create a Pig object
    t.typeHello();
    t.type();
  }
}
