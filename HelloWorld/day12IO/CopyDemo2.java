package HelloWorld.day12IO;

import java.io.*;
import java.util.Arrays;

public class CopyDemo2 {
    public static void main(String[] args) throws IOException, InterruptedException {
       /* FileInputStream fis=new FileInputStream("d://a.jpg");
        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("d://a(2).png"));
        int len;
        byte[]buf=new byte[1024];
        while((len=bis.read(buf))!=-1){
            System.out.println("len:"+len+",buf:"+ Arrays.toString(buf));
            bos.write(buf,0,len);//在写入的时候,要写入len,因为  文件没有刚刚被1024字节整除,所以最后一次len部位1024,buf重复了前面的字节满足1024字节
            bos.flush();
        }
        bis.close();*/
       File f=new File("d:/a/b/c/d/e/t.txt");
       //创建文件夹mkdir///创建多个mkdirs
       // System.out.println("mkdirs创建文件夹"+f.mkdirs());
       //删除文件夹   只能删除一个,且不能有文件
        //模拟等待  Thread.sleep
        for (int i = 0; i <5 ; i++) {
            Thread.sleep(1000);//暂停1000毫秒===>1秒等于1000毫秒
            System.out.println("模拟延迟删除"+(5-i)+"秒该文件将会删除");
        }
        System.out.println(f.delete()+"该文件已删除");




    }
}
