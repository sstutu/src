package HelloWorld.面向对象;

public class TryMyException {
    public void test(int i) throws Exception{
        if (i==1)
            throw new MyException1("MyException1异常");
        if (i==2)
            throw new MyException2("MyException2异常");
        if (i==3)
            throw new MyException3("MyException3异常");
    }
    public static void main(String[] args) {

        TryMyException it = new TryMyException();
        int i=1;
        try {
            it.test(i);
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }
    }
}
