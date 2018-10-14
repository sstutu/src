package HelloWorld.面向对象;

public class Test3 {
    int a;
    char b;
    String c;

    public static void main(String[] args) {
        Test3 c = new Test3();
        System.out.println("a=" + c.a + ",b=" + c.b + ",c=" + c.c);
    }//初始化结果是：a=0,b= ,c=null   其中b空值
}
