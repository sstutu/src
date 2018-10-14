package HelloWorld.面向对象;

public class CharCount {
    public String str;//类中的String str属性
    public CharCount(String str1){//构造器接收一个形参
    str=str1;
    }
    int count(){
        int b=0;
        for (int i = 0; i <str.length() ; i++) {
           if ((str.charAt(i)>='A'&& str.charAt(i)<= 'Z')||(str.charAt(i)>='a'&& str.charAt(i)<='z')){
               b++;
           }
        }
        return b++;
    }
    public static void main(String [] args){
        String str="你好HelloWorld";
        CharCount c=new CharCount(str);
        int z=c.count();
        System.out.println(z);

    }
}
