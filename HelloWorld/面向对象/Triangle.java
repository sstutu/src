package HelloWorld.面向对象;

public class Triangle {
    public static boolean triangle(double a, double b, double c) {
        if ((a + b > c) && (a - b < c)) {
            return true;
        }
        return false;
    }

    public double a;
    public double b;
    public double c;

    public void triangle() {

        if ((a + b > c) && (a - b < c)) {
            System.out.println("三边可以构成三角形");
        } else {
            System.out.println("三边不能构成三角形");
        }
    }

    public void triangle12() {
        if ((a + b > c) && (a - b < c) && a == b && b == c) {
            System.out.println("等腰三角形");
        } else {
            System.out.println("非等腰三角形");
        }
    }
}
