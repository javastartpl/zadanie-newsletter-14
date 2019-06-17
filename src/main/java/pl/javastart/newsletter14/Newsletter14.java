package pl.javastart.newsletter14;

class Newsletter14 {
  public static void main(String[] args) {
    System.out.println(tricky());
    // code here
  }

  private static Object tricky() {
    // code here
    System.out.println(128);
    System.exit(0);
    Byte value = 127;
    return value;
    // code here
  }
}
