package pl.javastart.newsletter14v2;

class Newsletter14 {
  public static void main(String[] args) {
    System.out.println(tricky());
    // code here
  }

  private static Object tricky() {
    // code here
    if (false) {
      Byte value = 127;
      return value;
    } // code here

    return 128;
  }
}
