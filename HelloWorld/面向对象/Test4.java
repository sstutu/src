package HelloWorld.面向对象;

public class Test4 {
   static String a="小强";
   static String b;
    static {b="旺财";}
    static void print(){
        System.out.println("a="+a+",b="+b);
    }
    public static void main(String[] args) {
        print();//打印结果：【 a=小强,b=旺财 】
    }
}
