package HelloWorld.面向对象;

public class Chess extends BoardGame {
    Chess(){
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x=new Chess();
    }
}
