package HelloWorld.day12IO;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f=new File("c://t/cvb/t.txt");

        System.out.println("文件的绝对路径文件对象"+f.getAbsoluteFile());
    }
}
