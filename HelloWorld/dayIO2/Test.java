package HelloWorld.dayIO2;

import HelloWorld.面向对象.DataOnly;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
      Student s=new Student();
       s.name="小明";
       s.age=18;
       //**保存数据
       dataSave(s);
        //读取数据
        Student student=load();
        System.out.println("读取到的学生数据:"+student);


    }

    private static Student load() throws IOException {
        DataInputStream dis=new DataInputStream(new FileInputStream("d://student.data"));
        //要按写入顺序读取
        Student student=new Student();
        student.name=dis.readUTF();
        student.age=dis.readInt();

    return student;
    }

    /**
 * 保存数据*/
    private static void dataSave(Student s) throws IOException {
        System.out.println("准备保存数据:"+s);
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("d://student.data"));
        dos.writeUTF(s.name);
        dos.writeInt(s.age);
        dos.flush();
        dos.close();
        System.out.println("数据保存完成!");
    }
}
