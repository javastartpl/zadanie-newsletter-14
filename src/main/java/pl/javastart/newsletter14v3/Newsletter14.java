package pl.javastart.newsletter14v3;

class Newsletter14 {
  public static void main(String[] args) {
    System.out.println(tricky());
    // code here
  }

  private static Object tricky() {
    // code here
    try {
      final int zero = 0;
      int e = 15 / zero; // ArithmeticException

      Byte value = 127;
      return value;
      // code here
    } catch (ArithmeticException e) {
      return 128;
    }
  }
}
