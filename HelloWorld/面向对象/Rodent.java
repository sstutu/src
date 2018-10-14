package HelloWorld.面向对象;

public abstract class Rodent {
   abstract void eat();
   abstract void sleep();
    public static void main(String[] args) {
        Rodent[]rodent={new Mouse(),new Gerbil(),new Hamster()};
        for (int i = 0; i <rodent.length; i++) {
            rodent[i].eat();
            rodent[i].sleep();
        }
    }
}
