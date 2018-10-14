package HelloWorld.面向对象;

public class    Test26 {
    public void g(){}

    public static void main(String[] args) {
        Test26 test26 = new Test26();
        test26=null;
        try {
        test26.g();
        }catch (Exception e){
            System.out.println("调用test26.g()方法出现异常"+e.getMessage());
        }
    }
}
