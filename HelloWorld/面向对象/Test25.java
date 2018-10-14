package HelloWorld.面向对象;

public class Test25 {
    void trydemo(int a,int b) {
        try {
            System.out.println("try语句:a/b="+a/b);
        }
        catch (Exception e){
            System.out.println("除数不能为:0");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("finally 都会执行的语句:a+1="+(a+1));

        }
    }
    class zdyyc extends Exception{
        zdyyc(){}
        zdyyc(String msg){
            super(msg);
        }
    };
     void f()throws zdyyc{
        g(8);
    }
     void g(int a)throws zdyyc
    {
        if (a!=0){
        throw new zdyyc("自定义异常");
        }
    }
    public static void main(String[] args)throws zdyyc {
        Test25 t25 = new Test25();
        try {
            t25.f();
        }
        catch (zdyyc e){
           throw new ArrayIndexOutOfBoundsException("catch异常");
        }
    }
}
