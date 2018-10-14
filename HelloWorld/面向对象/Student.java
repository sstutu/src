package HelloWorld.面向对象;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Student extends Person1 {
    int a=8;
    Student(int id){
        super(id);
        this.a=id;
    }

    public static void main(String[] args) {
        Student s=new Student(8);
       int b= s.i;
        System.out.println(b);
    }
}
