package HelloWorld.面向对象;

public class Test32 {//2
    public Test31 get(){//3
        class insder implements Test31{//4
            public void show(){
            }
        }
        return new insder();
    }
    public static void main(String[] args) {
        Test32 it = new Test32();
        Test31 c=it.get();//5
        c.show();
         Test31 dd=new Test31(){
            public void show(){
            }
        };

    }
}
