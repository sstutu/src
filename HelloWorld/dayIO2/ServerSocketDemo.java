package HelloWorld.dayIO2;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(3678);
        System.out.println("等待客户端连接....");
        Socket s=ss.accept();
        System.out.println("客户端已连接.....");
        InputStream is=s.getInputStream();
        byte[] bytes=new byte[1024];
        int len=is.read(bytes);
        System.out.println("从客户端接收到:"+new String(bytes,0,len));
        is.close();
        s.close();
        ss.close();//关闭整个服务器
    }
}
