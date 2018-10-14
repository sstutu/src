package HelloWorld.面向对象;

public class Shapes extends Shape {
    void show(){
        System.out.println("不知道题目是要我打印什么鬼?!");
    }
    public static void main(String[] args) {
        Shapes c=new Shapes();
        c.show();
    }
}
