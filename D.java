class D extends H {
  public D() {
    t13 = 9;
    t2 = 7;
    t9 = 1L;
  }
  public void t1() {
    System.out.println("метод t1 в классе D");
    System.out.println(t13);
  }
  public void t28() {
    System.out.println("метод t28 в классе D");
    System.out.println(t16[2] - t16[2]);
  }
  public void t30() {
    System.out.println("метод t30 в классе D");
    System.out.println(--t13);
  }
  public static void t40() {
    System.out.println("метод t40 в классе D");
    System.out.println((t21 - 2));
  }
  public static void t29() {
    System.out.println("метод t29 в классе D");
    System.out.println(t21++);
  }
  public static void t14() {
    System.out.println("метод t14 в классе D");
    System.out.println(t19);
  }
  public static void t32() {
    System.out.println("метод t32 в классе D");
    System.out.println((t19 + 4));
  }
  public void t18(H r) {
    r.t28();
  }
  public void t18(D r) {
    r.t30();
  }
}
