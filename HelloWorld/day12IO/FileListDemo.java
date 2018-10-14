package HelloWorld.day12IO;

import java.io.File;
import java.io.FileFilter;

/*
    * 遍历文件夹中的多有文件
    * */
public class FileListDemo {
    public static void main(String[] args){
//      base();
//        sd();

        File f=new File("D:\\QQMusicCache");
        printAll(f);
        System.out.println("操作完成!");
    }

    private static void printAll(File f) {
        FileFilter ff=new FileFilter() {
            @Override
            public boolean accept(File pathname) {//所有文件都会经过
                String name=pathname.getName();
                return name.endsWith(".png")||pathname.isDirectory();
            }
        };
        File[]files=f.listFiles(ff);
        for (int i = 0; i <files.length ; i++) {
            if (files[i].isDirectory()) {
                printAll(files[i]);//自己调用自己递归
            }
            System.out.println(files[i].getAbsolutePath());
        }
    }

    /**手动遍历*/
    private static void sd() {
        File f=new File("D:\\QQMusicCache");
        File[]files=f.listFiles();
        for (int i = 0; i <files.length ; i++) {
            if (files[i].isDirectory()){
                File[] files2=files[i].listFiles();
                for (int j = 0; j <files2.length ; j++) {
                    if(files2[j].isDirectory()){
                        File[]files3=files2[j].listFiles();
                        for (int k = 0; k <files3.length ; k++) {
                            System.out.println("第三层"+files3[k].getAbsolutePath());
                        }
                    }
                    System.out.println("第二层:"+files2[j].getAbsolutePath());
                }
            }
            System.out.println("第一层:"+files[i].getAbsolutePath());

        }
        System.out.println("操作完成");
    }
/**读取当前目录的完整路径*/
    private static void base() {
        File f=new File("d://QQMusicCache");
        //当前目录下所有文件名
        String[]list=f.list();//字符串
       /* File f2=new File(f,"Log");//f就是文件路径,Log是文件名,这么写相当于文件路径与文件名的拼接
        System.out.println(f2.getAbsolutePath());*/
        /*
        * 直接提供文件对象数组
        * */
        File[] files =f.listFiles();
        for (int i = 0; i <files.length ; i++) {//遍历根目录文件
            System.out.println(files[i].getName());
        }
        System.out.println("操作完成!");
    }

}
