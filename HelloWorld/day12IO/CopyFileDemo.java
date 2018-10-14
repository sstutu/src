package HelloWorld.day12IO;

import javax.lang.model.element.NestingKind;
import java.io.*;
import java.util.Arrays;

public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        /*new FileReader();
        BufferedWriter br= new BufferedWriter("d//t2.txt");
        BufferedWriter bw= new BufferedWriter(new FileWriter("d//t2.txt"));
        String line;
        while (line=br.readline)
        br.newLine();*/


        InputStream is = new FileInputStream("d://t.txt");
//        is.available();//返回但钱该流的可用字节
        /*int ch;
        while((ch=is.read())!=-1){
            System.out.println("ch:"+ch+",可用字节:"+is.available()+"字节");
        }*/

        /*int len;
        byte[] buf = new byte[1024];
        Arrays.fill(buf,(byte)'a');
        while ((len =is.read(buf)) != -1) {
          *//*  System.out.println("len:"+len+",buf"+ Arrays.toString(buf));*//*
        String str=new String(buf,0,len);
            System.out.println("str:"+str);
        }
        is.close();
        System.out.println("操作完成");*/
        /**一次型全部读取数据出来,
         定义一个和文件一样大的数组
         */
        int len=is.available();
        byte[] buf=new byte[len];
        is.read(buf);
        String str=new String(buf,0,len);
        System.out.println("str:"+str);
    }
}
