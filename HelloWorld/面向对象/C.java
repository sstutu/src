package HelloWorld.面向对象;

public class C extends A {
    int a;
    C(int a){
        super(2);
        this.a=a;
        System.out.println("C类"+a);
    }
    private B b=new B(2);

    public static void main(String[] args) {
        new C(8);
    }

}
