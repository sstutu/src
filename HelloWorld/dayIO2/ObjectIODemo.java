package HelloWorld.dayIO2;

import java.io.*;

public class ObjectIODemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s=new Student();
        s.name="小明";
        s.age=18;
        //保存数据
        dataSave(s);//序列化:包数据保存在存储介质上
        //读取数据
        Student student=load();//反序列化:把数据文件从存储中重新读取出来
        System.out.println("student:"+student );
        System.out.println("操作完成!");
    }

    private static Student load() throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("d://student.ser"));
       Object obj=ois.readObject();
        return (Student)obj;
    }

    private static void dataSave(Student s) throws IOException {
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("d://student.ser"));
        oos.writeObject(s);//对象序列化
        oos.flush();
        oos.close();
    }
}
