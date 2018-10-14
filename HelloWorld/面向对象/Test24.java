package HelloWorld.面向对象;

import com.sun.javafx.collections.MappingChange;

import java.util.*;

public class Test24 {


    public static void main(String[] args) {
        Map<String,String> map=new HashMap<String, String>();
        //map=new LinkedHashMap<String,String>();
        //map=new TreeMap(String,String)
        map.put("AAA","aaa");
        map.put("BBB","bbb");
        map.put("CCC","ccc");
        map.put("DDD","ddd");
        map.put("EEE","eee");
        String value=map.get("EEE");
        System.out.println("value:"+value);
//2.获取所有的key
/*        Set<String> keys=map.keySet();
        Iterator<String>ss=keys.iterator();
        while (ss.hasNext()){
            String key=ss.next();
            String value1=map.get(key);
            System.out.println(key+"="+value1);
        }
        Collection<String> values=map.values();
        Iterator<String>it=values.iterator();
        while (it.hasNext()){
            String value2=it.next();
            System.out.println(value2);
        }*/
//两个元素变成一个元素
        Set<Map.Entry<String,String>>entrys=map.entrySet();
        Iterator<Map.Entry<String,String>> it=entrys.iterator();
        Map.Entry<String,String>e=it.next();
        while (it.hasNext()){
            String key=e.getKey();
            String value4=e.getValue();
            System.out.println(key+"="+value4);


        }



    }
}
