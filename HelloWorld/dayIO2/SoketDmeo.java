package HelloWorld.dayIO2;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class SoketDmeo {
    public static void main(String[] args) throws IOException {
                                    //本机地址 相当与locahost   //端口(就像我们基地 要区分里面的公司,以门牌号区分)
        Socket s=new Socket("127.0.0.1",3678);
       OutputStream os=s.getOutputStream();
        System.out.println("准备发送数据");
       os.write("你好啊!".getBytes());
       os.flush();
       os.close();
       s.close();
        System.out.println("客户端数据发送完成");

    }
}
