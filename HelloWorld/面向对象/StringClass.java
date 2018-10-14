package HelloWorld.面向对象;

public class StringClass {
    public String str;
    public StringClass(String str){
        this.str=str;
    }

    public static void main(String[] args) {
        StringClass[]str={new StringClass("你好"),new StringClass("Hello"),new StringClass("World")};
        for (int i = 0; i <str.length; i++) {
            System.out.println(str[i].str);
        }
    }
}
