package HelloWorld.dayIO2;

import java.io.Serializable;

public class Student implements Serializable {/**标记接口(空白的接口):别人看到这个接口的实现类,可能会给这个类某些特权*/
String name;
transient int age;//瞬时的===>transient修饰后的苏醒的值不会被序列化保存进数据文件里

    @Override
    public String toString() {
        return name+":"+age;//不写toString()的覆写方法,打印Test 的s则为return getClass().getName() + "@" + Integer.toHexString(hashCode())
    }
}
