package HelloWorld.面向对象;

public class Fight11 {
        public Cary getThing(){
 //通过定义接口型的方法 利用return 子类的方式  的方式实现   接口==子类  这种多态的转型.
//-----------------------------------------------------------------------
            class Fight12 implements Cary{
                public void tell(){
                    System.out.println("Hello World");
                }
            }
   //这部分内部类实现了接口
//--------------------------------------------------------------------------------

            return new Fight12();
        }
//
//--------------------------------------------------------------------------------

            public static void main(String[] args){
            Fight11 f = new Fight11();
            Cary c = f.getThing();
            c.tell();}
}


