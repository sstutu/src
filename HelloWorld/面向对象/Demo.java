package HelloWorld.面向对象;
//1,2题
public class Demo {
    int age;
    String name;
    String sex;
    public Demo(String name){
        this.name=name;
        System.out.println(name+sex);
    }
    public Demo(){
        System.out.println(sex);
    }
    private static Demo s=new Demo();//为这个类创建一个对象

}

