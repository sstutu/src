package HelloWorld;
import HelloWorld.面向对象.*;

public class day2yj {
  public void sw01(){
    //////面向对象
/*1.	下面是AtypeName的类定义和消息发送代码片段，把它补充完整形成可运行的程序,dosoming函数中就打印一条信息就可以。
        a)	class ATypeName { *//* Class body goes here *//* }
        i.	ATypeName a = new ATypeName();
        a.	dosoming();*/
    //public static AtypeName(){}

       /*
       ATypeName a=new ATypeName();
       a.dosoming();
       */
/*2.	下面的程序有什么问题，请你改成他可以运行的方式。
    public class DocTest {
    public int i;
    i=100;
    System.out.println(i);
    public void f() {} */

/*3.	将DataOnly代码片段改写成一个程序，然后编译运行。
       class DataOnly {
           int i;
           float f;
           boolean b;
       }
       DataOnly d = new DataOnly();
       d.i = 47;
       d.f = 1.1f; // ‘f’ 在后面指242
       明它是浮点数
       d.b = false;
       最后打印出i,f,b的值。*/

       /*DataOnly d = new DataOnly();
       d.i=47;
       d.f = 1.1f; // ‘f’ 在后面指242
       d.b = false;
       System.out.println(d.i);
       System.out.println(d.f);
       System.out.println(d.b);*/

//4.	使用练习4的类，将DataOnly类new出两个新的对象，并对这两个对象中所有域赋上一个新的值，然后打印出，这两个对象的i相加和这两个对象f相加的值，体会一下不同的对象他们是不是有不同的属性值。
        /*
       DataOnly x=new DataOnly();
       DataOnly y=new DataOnly();
       x.i=99;
       x.f=2.2f;
       x.b=true;
       y.i=111;
       y.f=3.3f;
       y.b=false;
       System.out.println(x.i+y.i);
       System.out.println(x.f+y.f);
       //System.out.println(x.b+y.b); 体会：Boolean型不能相加；
*/

/*5.	编写一个类，内部包含一个字符串，并含有下面所定义的storage( )方法的代码段，new出这个对象并为它的字符串s赋值，
然后调用storage()函数并打印。这个方法是返回一个字符串所占的字节数，注：java中字符是占两个字节的，无论它是中文还是英文。
int storage() {
return  XXX; //注:XXX是未知数}*/
    /*
    String y="你好HelloWorld";
    GetBytes c=new GetBytes();
    int x= c.storage(y);
    System.out.println(x);
    */


/*6.	将下面的StaticFun代码段改写成一个完整的可运行程序，并通过两种形式调用incr()方法，然后显示i的结果，一种形式是生成对象以后调用incr(),一种是直接用类来调用incr()说明一下他们的区别。
       class StaticTest {
           static int i = 47;
       }
       class StaticFun {
           static void incr() { StaticTest.i++; }
       }  */
    //答被static修饰的变量在第一次调用的时候已经被修改，第一次调用与第二次调用的结果不一样

//      7.	编写一个类，类中有一个域count，并有两个方法，一个方法打印一条信息，另一个方法可以打印第一个方法被调用了多少次。写一个主函数new出不同的对象来调用第一个方法，说明域count加static 和不加static 的区别。
//8.	编写一个程序，打印出从命令行获得的三个参数。为此，需要对表命令行参数的Strin数组建立索引。
        /*Test.b(1,"你",'c');*/
//9.	写代码证明，一个静态的方法不可以调用一个非静态的方法或域，返之是可以的。
/*Tese1 */

//10.	编写一个圆类，有一个static域PI,还有一个域代表圆的半径，在这个圆中编写一个方法用来打印圆的面积，写一个主函数new 出一个圆的对象并为这个圆的半径赋值，打印这个圆。
/*Area*/

//11.	编写一个三角形类，里面有三个域分别代表三角形的三条边，有一个返回值是boolean类型的无参数方法，判断这个三条边可不可以组成三角形。写一个主函数为这三角边赋值并调用这个方法，打印是不是三角形。
      /*
      Triangle triangle=new Triangle();
      double a=1;
      double b=4;
      double c=5;
      System.out.println(triangle.triangle(a,b,c));
      */

//12.	修改上题，加一个无参数的方法正确判断是不是等腰三角形，并运行之。
      /*
      Triangle a=new Triangle();
      a.a=4;
      a.b=4;
      a.c=4;
      a.triangle12();
      */

//13.	修改第十一题，在这个圆类中加一个方法，该方法可以把该圆的面积扩大一倍.(注意：圆只有半径这个域) 编程实现并运行求新圆的半径( Math.sqrt())。
      /*
      Area test=new Area();
      test.i=5.6;
      test.area();
      System.out.println(test.area());
      System.out.println("2倍圆"+test.pix2());
      System.out.println("2倍圆半径"+Math.sqrt(test.pix2()));
      */

//14.①写出所有原子类型的包装类，②并为包装类赋值，③说明一个包装类为什么没有赋值方法（setXXX），赋值只有构造方法，试写一下各个包装类到原子类的转换。一个包装类可不可以直接用“=”赋值给一个原子类型。体会一下包装类和原子型的关系。
/*
byte--Byte;
short--Short;
char--Character;
int--Integer;
long--Long;
float--Float;
double--Double;
boolean--Boolean

因为包装类也是类，不用new的方式 直接用变量等于值，赋值的NEW的方式是在括号里里直接写值；
 */
//----------------------------------------------------------------------------------------------------------------------------------------------
//02对象的初始化与包
//  1.面向对象 Demo   	创建一个带缺省构造器（即无参构造器）的类，在构造器中打印一条消息。为这个类创建一个对象。
//  2.面向对象 Demo    为练习1中的类添加一个重载的构造器，令其接受一个字符串参数，并在构造器中把你自己的消息和接收的参数一起打印出来（用+号连起来）。
/*  3.面向对象 CharCount  	编写一个类名字为CharCount,类中有一个属性String 类型的变量str。添加一个有参数的构造器，
该构造器接受一个字符串类型的形参,并把这个形参的值赋值给str。编写main方法。再在该类中添加一个方法count
该方法返回的是字符串str的英文字母的个数。测试这个类的运行结果是否正确
（提示可以使用String 类的charAt方法来得到一个个的字符）*/
//  4.面向对象StringClass 创建一个字符串对象数组，并为其每个元素赋予一个字符串对象。使用for循环将所有内容打印出来。
      /*
      StringClass[]str={new StringClass("你好"),new StringClass("Hello"),new StringClass("World")};
      for (int i = 0; i <str.length; i++) {
          System.out.println(str[i].str);
      }
      */

//5.面向对象CharCount  创建一个CharCount对象数组名字为charcounts，并为其每个元素用构造器赋址。使用for循环打印出charcounts数组中所有元素的英文字母个数总和。
      /*
      CharCount[] charounts={new CharCount("你好Hello"),new CharCount("Love YOU哦haha"),new CharCount("谢谢Miss YOU!"),};
      int b=0;
      for (int i = 0; i <charounts.length; i++) {
          for (int j = 0; j <charounts[i].str.length() ; j++) {
             if ((charounts[i].str.charAt(j)>='A'&& charounts[i].str.charAt(j)<= 'Z')||(charounts[i].str.charAt(j)>='a'&& charounts[i].str.charAt(j)<='z')){
                 b++;
             }
          }
      }
      System.out.println(b);
      */

//6.面向对象DefaultConstructor	创建一个没有构造器的类，并在main( )中创建其对象，用以验证是不是可以用new来建立对象，如果可以说明编译器已经为其加入了缺省构造器。
    //DefaultConstructor c=new DefaultConstructor();
    //it work

//7.面向对象TShape 	创建一个只有一个构造器的类TShape(代表三角形类)，
// 该类内部有三个整型数a,b,c分别代表三角形的三条边，
// 构造器接收三个参数并赋值给a,b,c，(验证直接写new TShape()这样来构造三角形会报错，说明原因，如果要让他不报错，应该如何做)，
// 该类中有两个方法其中一个area()方法没有参数返回三角形的面积，
// 另一个是判断是不是三角形的方法isT()该方法也没有参数，返回一个boolean型表示是不是三角形，
// area()方法调用以前要调用isT来决断是不是三角形，如果不是返回-1，再编写一个主函数验证这个类的运行结果。平方根函数Math.sqrt(double)）

    //new TShape();    //会报错，需要传参，因为默认的无参构造器已经 在有参构造器创建后不存在了，所以无法new 无参构造器。要按有参构造器传入参数。
      /*
      double a=0;
      double b=4;
      double c=5;
      TShape m=new TShape(a,b,c);
      double k=m.area();
      System.out.println(k);
      */
//不是三角新返回-1 是打印会显示为NaN;

//8.面向对象Test2	编写具有两个重载构造器的类，并在第一个构造器中通过this 调用第二个构造器。
//9.	修改为TShape类再创建两个构造器，一个无参，一个有一个参数，当用无参来构造TShape的时候a,b,c的值都为1，
// 如果用有一个参数来构造的时候b,c为1，通过构造器的调用来实现，不要直接对变量赋值（如下）。
      /*
      TShape ty=new TShape();
      System.out.println("a="+ty.a+","+"b="+ty.b+","+"c="+ty.c+",");
      TShape ty2=new TShape(1);
      System.out.println("a="+ty2.a+","+"b="+ty2.b+","+"c="+ty2.c+",");
      */

//10.面向对象Test3	编写一个类，内含未初始化的整型和字符型成员，打印其值以检验Java 的缺省初始化动作。

//11.面向对象Test3	编写一个类， 内含未初始化的字符串引用,证明这个引用会被Java 初始化为null。

//12.面向对象Test4	编写一个类，拥有两个静态字符串字段，其中一个在定义处初始化，另一个在静态块中初始化。
// 现在，加入一个静态方法用以打印出两个字段值。请证明它们都会在被使用之前完成初始化动作。

/*13.面向对象P	编程时为少打点字有时可以作方法的包装，下面两个函数就是对System.out.print的包装，请添加 print() 和 println()的所有重载版本，
        以处理所有不同的java基本类型，使类P通用化，写个主函数测试他们，并把它这个类在自己的工具包中，以方便以后使用。
      public class P {
          public static void print(String s) {
              System.out.print(s);
          }
          public static void println(String s) {
              System.out.println(s);
//....
          }
      }
*/

//14.面向对象 Test5 Test6	创建一个带有public, private, protected的域以及方法成员的A类。在B类里面创建该类的一个对象，看看在你试图调用所有类成员时，会发生什么样的事情。

/*
无继承时从大到小的排序
public		protected			(默认)不写		private
本类		        可用			可用			可用		 可用
同包下的类		可用			可用			可用		不可用
跨包下的类		可用		  不可用		  不可用		不可用
*/

//15.	把你自己的工具包导出成.jar 文件，切换一个工作区，新造个java工程，写个测试类导入这个.jar包，测试一下P这个类。

/*16.HelloWorld c05文件夹	在c05.local包下编写以下文件:
// c05:local:PackagedClass.java
package c05.local;
      class PackagedClass {
          public PackagedClass() {
              System.out.println("Creating a packaged class");
          }
      }
      然后在另一个包中创建下列文件：
// c05:foreign:Foreign.java
package c05.foreign;
import c05.local.*;
      public class Foreign {
          public static void main (String[] args) {
              PackagedClass pc = new PackagedClass();
          }
      }
*/

//17.	解释一下为什么编译器会产生错误。如果将Foreign类置于c05.local包之中的话，会有所改变吗？
    //不同包需要导包，未导包前无法直接使用。如果将Foreign类置于c05.local包之中的话，不会报错。同包下可以不导包直接new对象

//18.面向对象Person   编写Person类 包含身份证号码 性别 身高域 其中身份证号码要求是只读的必输入的
//19.面向对象PersonHeightAvg    再编写PersonHeightAvg类包含一个Person数组和一个getAvg()方法，该方法将Person类的所有对象Person[]  person按身高求平均值。


//----------------------------------------------------------------------------------------------------------------------------------------------
//03复用类：
//1.面向对象A\B\C 	创建两个带有缺省构造器的类，A和B。创建一个新的类C继承A类，并在C内创建一个B类的成员。不要给C编写构造器。创建一个C类的对象并观察其结果。

/*
2.面向对象TShape\DTShape 	根据TShape类，再编写一个类DTShape，继承自TShape(来至于第二次课必修实验的第九题)，这个DTShape是表示的一个等腰三角形，继承类要求复写基类的所有的构造方法。
并复写isT方法用以表达这个三角形是不是等腰三形，（注意，三角形的判断仍然是存在的事，三角形的判断不可以直接写代码，要复用基类的判断方法）再加一个计算等腰三角形腰高的方法。
所有构造方法构造出的三角你必须要保证代是等腰三角形，不然就要报错。然后编写测试主方法测试这个类的工作是不是正常，包括计算面积，腰高等。
 */

//3.面向对象A\B\C 	修改练习1以使A和B含有带参数的构造器，以取代缺省的构造器。为C写一个构造器，并在其中执行所有的初始化。

//4.面向对象Cartoon Art Darwing  	使用Cartoon.java并注解掉Cartoon类的构造器。对所发生的现象进行解释。  Cartoon.java具体内容见作业对应的图片

//5.面向对象Game BoardGame Chess  	使用Chess.java并注解掉Chess 类的构造器。对所发生的现象进行解释。  具体内容需见作业对应的图片

//6.面向对象Test7/Test8  	创建一个类，它应带有一个被重载(方法名字相同，参数不同)了三次的方法。一个新类继承于它，并为这个新类添加一个该方法的新的重载定义，展示这四个方法在子类中都是可以使用的。（区分并说明重载和覆盖的不同）

//7.面向对象Person1/Student  	编写一个基类Person类，子类Student类，子类中含有int 类型的属性，利用子类构造器对这个属性赋初值,并把参数id通过构造器传给基类构造器Person（int id）

//8.面向对象A1/B1  	在包中编写一个类A。你的类应具备一个protected方法。在包外部，试着调用该protected方法并解释此结果。然后，编写一个新类B继承你的类A，并从类B的一个方法内部调用该protected方法。

// 9.	创建一个含有static final数据成员和final数据成员的类，说明二者间的区别。

//【答】两者均不可被重新赋值，static修饰的为静态


// 10.	创建一个含有指空白final属性 的类。在所有构造器内部都执行空白final的初始化动作。展示Java确保了final在使用前必须被初始化，且一旦被初始化即无法改变。

// 11.	创建一个带final数据成员的类。由此派生出一个类并继承此数据成员。

// 12.	创建一个final 类并试着继承它，写一个final的例子说明final的数据成员如果是原子型是不可以修改的，如果是对象型它的引用不可以修改的，但对象里面的值是可以修改的。
  }
  public static void main(String[] args) {

//04多态练习:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
/*1.	在Shapes.java基类Shape中添加一个新方法，用于打印一条信息，但子类中不要覆盖这个方法。
    请解释发生了什么。现在，将其中一个子类的该方法覆盖，而其他的不变，观察又有什么发生。
    最后，所有的子类中都覆盖这个方法。*/
            /*[答] :
            1.创建 父类的子类对象,可以指调用方法显示打印结果.
            2.当子类有和父类同名同参方法时:子类方法会覆盖父类方法.
            */

/*2.面向对象Book/Cartoon1/Novel/Magazine   	创建一个Book（书）：Cartoon(漫画)，Novel(小说)，Magazine（杂志）三个子类。在基类中有name属性和getName()方法，
子类使用隐藏name=”漫画”，name=”小说”，name=”杂志”并覆盖getName()方法，使用后期绑定技术，在Book类下编写静态方法printName（Book b）{System.out.println(b.getName())}。
（提示：public String getName(){return name;}父类子类代码相同）*/

/*3.面向对象Rodent/Mouse/Gerbil/Hamster  	创建一个抽象类Rodent（啮齿动物）:Mouse（老鼠）,Gerbil（鼹鼠）,Hamster（大颊鼠）这样的继承层次结构。
在基类中，提供对所有的Rodent都通用的方法，在子类中，根据特定的Rodent类型覆盖这些方法，以便执行不同的行为。
创建一个Robent数组，填充不同的Rodent类型，然后调用基类方法，观察发生什么情况。*/

//4.面向对象Test9  	创建一个不包含任何抽象方法的抽象类，并验证我们不能为该类的创建任何对象。

/*5.面向对象Test9/Test10    	创建一个抽象基类，包含抽象方法print( )，并在导出类中将其覆盖。覆盖的版本中会打印基类中定义的某个整型变量的值。
在定义该变量时，请赋予非零值。在基类的构造器中，可以调用这个方法。现在，在main（）方法中，创建一个导出类对象，然后调用它的print()方法。请解释发生的情形。
*/

//6.面向对象Test11/Test12/Test13    [这第六题由于有图面,无法描述在这里]

//05.接口与内部类--------------------------------------------------------------------------------------------------------------------------------------------------------------
//1.面向对象Test14	证明一个接口的属性在缺省情况下是static和final的。
//2.面向对象Test14/Test15	在某个包内创建一个接口，内含三个方法，然后在另一个包中实现此接口。
//3.	证明接口内所有的方法都自动是public的。
    /*答:实现接口时必须为public关键字就可以证明其所有方法都是public修饰*/

/*4.面向对象Test16~21	创建三个接口，每个接口中都有两个方法。
    a)	再创建一个新的接口，继承前面三个接口，并在这个新接口中添加一个新方法。
    b)	然后创建一个类，在实现此新接口的同时，继承一个父类。
    c)	并为这个父类写四个方法，每个方法分别以前面的四个接口中的一个作为参数。
    d)	在main()中创建这个类的对象，然后将这个对象的引用作为参数传递给那四个方法,
    e)	分别在这些方法中调用做为参数的接口的方法，解释你看到的现象。*/


//5.面向对象Test22~23    	定义一个类，在这个类中写一个私有的内部类，内部类中写一个方法，这个方法打印一条信息。再定义另一个测试类，在主方法中创建出这个内部类，并调用那个内部类中的打印方法。

//6.	按第一题的修改方法，如果要内部类在测试类主类中可以使用，要如何修改结构（提示：用连接到外部类的写法）    [答]看不懂;

//7.面向对象Test27    	定义一个类，类中有一个整形的域i，给i定义一个初值。在这个类中定义一个内部类，内部类中有一个方法，打印这个外围类的i看会不会报错。体会内部类有继承外围类的特性。

//8.面向对象Test27/28  	修改3，使这个内部类再继承一个类，这个父类中也有一个整形域i,这个i也有一个初值，内部类中也定义一个域i，这里要打印三个i的和，我们要如何做。

// 9.Test29/30   	创建一个至少有一个方法的接口。再创建一个测试类，这个类里面有一个方法，方法内定义一个内部类，以实现此接口，这个方法返回此接口的引用。

// 10.面向对象 本题决定跳过	重复练习3，但将内部类定义在某个方法的一个作用域内。(可以参看上一次的)

// 11.	修改HorrorShow.java，用匿名类实现DangerousMonster和Vampire。  -----内容较多.所以HorrorShow的具体代码见习题;



//06异常 -----------------------------------------------------------------------------------------------------------------------------
//1.面向对象Test20/25	使用try-catch-finally编写一个除法运算，输入两个数字，输出运算结果。当除数为0时，输出：除数不可为0;

//3.	编写一个类，在main( )的try块里抛出一个Exception对象。传递一个字符串参数给,Exception的构造器。
// 在catch子句里捕获此异常对象，并且打印字符串参数。添加一个finally子句，打印一条信息以证明这里确实得到了执行。
    /*double x=3.1415;
    int x1= (int)(x*100);
    double x2=x1/100.0;
    System.out.println(x2);*/


  }
}