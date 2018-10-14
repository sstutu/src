package HelloWorld.面向对象;

public class myException extends Exception {//1
    String msg;
    myException(String msg) {//2
        this.msg = msg;//3
    }
    public void printmsg() {//4
        System.out.println("msg:" + msg);
    }
    public static void main(String[] args) {
        try {//5
            throw new myException("我的自定义异常类");
        } catch (myException e) {
            e.printmsg();
        }
    }
}