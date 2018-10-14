package HelloWorld.day12IO;

import java.io.*;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws IOException {
        //writerDemo();
        //readDemo();

            //抽象类     //读取字符文件的便捷类
            Reader r = new FileReader("d://t.txt");
            //1.一次读一个
            //2.一次读取多个
            //如果有读取到数据则返回该字符,如果没有读取到则返回-1
        /*int ch=r.read();
        System.out.println((char)ch);
         ch=r.read();
        System.out.println((char)ch);
         ch=r.read();
        System.out.println((char)ch);
         ch=r.read();
        System.out.println((char)ch);
         ch=r.read();
        System.out.println((char)ch);
         ch=r.read();
        System.out.println((char)ch);
         ch=r.read();
        System.out.println((char)ch);
         ch=r.read();
        System.out.println((char)ch);*/
        //读取的通用套路

        /*int ch;
        while ((ch=r.read())!=-1){
            System.out.println((char)ch);
        }
        r.close();*/
        //---------------------------------------------------
        //2.读取多个---->一般定义为一个字节(1kb)
        /*char[] buf=new char[3];//一次性读取连个字符
        int len=r.read(buf);//返回读取到的字符个数,如果没有读取到则返回-1
                    //读取到的数据存储在buf数组中
        System.out.println("len:"+len+"buf:"+ Arrays.toString(buf));
            len=r.read(buf);//返回读取到的字符个数,如果没有读取到则返回-1
        //读取到的数据存储在buf数组中
        System.out.println("len:"+len+"buf:"+ Arrays.toString(buf));
            len=r.read(buf);//返回读取到的字符个数,如果没有读取到则返回-1
        //读取到的数据存储在buf数组中
        System.out.println("len:"+len+"buf:"+ Arrays.toString(buf));
        len=r.read(buf);//返回读取到的字符个数,如果没有读取到则返回-1
        //读取到的数据存储在buf数组中
        System.out.println("len:"+len+"buf:"+ Arrays.toString(buf));
        len=r.read(buf);//返回读取到的字符个数,如果没有读取到则返回-1
        //读取到的数据存储在buf数组中
        System.out.println("len:"+len+"buf:"+ Arrays.toString(buf));*/
        /*************************读取多个使用循环********************************/
        /* char[] buf=new char[2];
        while (r.read(buf)!=-1){
            System.out.println(",buf:"+ Arrays.toString(buf));
        }*/
        String c="abcdef";
        c.toString();
        System.out.println(c.toString());
        int[]arr=new int[8];
        Arrays.fill(arr,1,8,8);
        System.out.println(Arrays.toString(arr));
        System.out.println("--------操作完成----------");
        r.close();


    }
    private static void writerDemo() throws IOException {
        String name="Hello World";
        //操作文件的便捷类.
        Writer w=new FileWriter("d://t.txt",true);
        //w.write(name);
        //w.write(65);//Ascii
        //w.write(chars);
        char[]chars={'A','B','C','D','E'};
        w.write(chars,0,5);//从零下标开始数,数两位;
        w.write("\r\n");
        w.flush();//相当于写入完   我们按电脑上的保存.
        w.close();
    }
}
