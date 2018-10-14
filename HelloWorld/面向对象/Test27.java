package HelloWorld.面向对象;

public class Test27 {
    int i=800;
    public class Inside extends Test28 {
        int i=1500;
        public void print(){
            System.out.println(i);
            System.out.println(Test27.this.i);
            System.out.println(super.i);
        }
    }
    public static void main(String[] args) {
        Test27.Inside it= new Test27().new Inside();
        it.print();
    }
}
