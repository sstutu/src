package HelloWorld.面向对象;

public class StaticFun {
  public static void incr() {
        StaticTest.i++;
        System.out.println(StaticTest.i);
    }

    public static void main(String[] args) {
        incr();
        StaticFun.incr();
        StaticFun.incr();
    }
}
