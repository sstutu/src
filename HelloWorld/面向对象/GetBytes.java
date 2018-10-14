package HelloWorld.面向对象;

public class GetBytes {
    public static int storage(String s) {
        byte[]  buff = s.getBytes();
        int i = buff.length;
        return i;
    }
}
