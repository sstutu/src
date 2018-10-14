package HelloWorld;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class day1jc {

  //方法名可以相同参数不同的称为方法重载。
  //本节课的重点：1传入八大基本类型，则数值以作用域为准
  //2有返回类型的语句里面有return，语句执行到return就直接结束，通过if可以写多个return  所有return的返回类型要一致。
  //调用实在主函数调用方法
  public static void sort(int []arr){
    for (int i = 0; i <arr.length-1 ; i++) {
      for (int j = 0; j <arr.length-1-i ; j++) {
        if (arr[j]>arr[j+1]){
          int g=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=g;
        }
      }
    }
    System.out.printf("");
  }
  public static void println(int[]i){
    i[0]=99;
  }
  public static void println(){}
  public static void println(int[]i,int[]b,char c){}


 public static void main(String[] args) {
//
//    int x=132;
//    int h=0;
//    int a=x/100;
//    int b=x/10%10;
//    int c=x%10;
//      if(a<b){
//          h=a;
//          a=b;
//          b=h;
//      }
//      if(a<c){
//          h=a;
//          a=c;
//          c=h;
//      }
//      if(b<c){
//          h=b;
//          b=c;
//          c=h;
//      }
//        System.out.println(a*100+b*10+c);
//        int i=1;
//        while (i<=10){
//            System.out.println(i++);
//        }
//        int i=1;
//        int sum=0;
//        for (i=1;i<=100;i++) {
//            sum = sum + i;
//        }
//        {
//            System.out.println(sum);
//        }
//        for (int i = 1; i <=9; i++) {
//            for (int j = 1; j <9; j++) {
//                System.out.println(i+"*"+j+"="+i*j);
//            }
//        }
//        for (int i = 3; i <=3 ; i++) {
//            for (int j = 3; j >=i ; j--) {
//                System.out.println(" ");
//            }
//            for (int j = 0; j<i*2-1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        /*int i=20080901;
        int i1=i/10000;//年
        int i2=(i-i1*10000)/100;//月
        int i3=i-i1*10000-i2*100;//日
        System.out.println(i1+"-"+i2+"-"+i3);
        if (i1%4==0&&i1%100!=0||i1%400==0){//闰年
            if (i2==1||i2==3||i2==5||i2==7||i2==8||i2==10||i2==12){//大月
                if (1<=i3&&i3<=31){
                    System.out.println("合法");
                }
                else{
                    System.out.println("不合法");
                }
            }
            else if (i2==2) {//二月
                if (1 <= i3 && i3 <= 29) {
                    System.out.println("合法");
                } else {
                    System.out.println("不合法");
                }
            }
            else if (i2==4||i2==6||i2==9||i2==11) {//小月
                    if (1 <= i3 && i3 <= 30) {
                        System.out.println("合法");
                    } else {
                        System.out.println("不合法");
                    }
            }
            else {
                System.out.println("不合法");
            }
        }
        else {
            if (i2==1||i2==3||i2==5||i2==7||i2==8||i2==10||i2==12){//大月
                if (1<=i3&&i3<=31){
                    System.out.println("合法");
                }
                else{
                    System.out.println("不合法");
                }
            }
            else if (i2==2) {//二月
                if (1 <= i3 && i3 <= 28) {
                    System.out.println("合法");
                } else {
                    System.out.println("不合法");
                }
            }
            else if (i2==4||i2==6||i2==9||i2==11) {//小月
                if (1 <= i3 && i3 <= 30) {
                    System.out.println("合法");
                } else {
                    System.out.println("不合法");
                }
            }
            else {
                System.out.println("不合法");
            }*/
//        }
//        Random random=new Random();
//        int x=random.nextInt(100);
//        System.out.println(x);
//        Scanner sn=new Scanner(System.in);
//        int n=sn.nextInt();
//        System.out.println(n);
      /*  int i=1;
        while (i<=5){
            System.out.println(i);
            i++;
        }
        do {
            System.out.println(i);
            i++;
        }while (i<=5);*/
        //循环：while（）{if(){continue}}
        /*int i=1;
        while (i<=10){
            if (i==5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }*/
       /* int i=1;
        int sum=0;
        for (i=1;i<=100;i++) {
            sum = sum + i;
        }
        {
            System.out.println(sum);
        }*/

        /*for (int i = 1; i <=9; i++) {
            for (int j = 1; j <9; j++) {
                System.out.println(i+"*"+j+"="+i*j);*/
        /*int sum=0;
        for (int i = 1; i <=100; i++) {
            sum=sum+i;
            if (i%3==0){
                System.out.println(i);
            }
        }
        {
            System.out.println(sum);
        }*/
        /*for (int i = 1; i <=3 ; i++) {
            for (int j = 3; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j=0;j<i*2-1;j++){
                System.out.print("*");
            }
            {
                System.out.println();
            }
        }*/
//1.	用循环语句打印1000~9999中的对称数，对称数如：1221这类型的数字
        /*for (int i = 1000; i <=9999; i++) {
            int a = i / 1000;//第一位
            int b = i / 100 % 10;//第二位
            int c = i / 10%10;//第三位
            int d = i % 10;//第四位
        if (a==d&&b==c){
            System.out.println(a*1000+b*100+c*10+d);
        }
        }*/


//2.	计算出1～100中所有可以被3整除的数的和。
        /*int sum=0;
        for (int i = 1; i <=100; i++) {
            if (i%3==0){
                sum=sum+i;
            }
            }
        {
            System.out.println(sum);
        }*/

//3.	打印
	    /*
	            *
               ***
              ******

        for (int i = 1; i <=3; i++) {
            for (int j =3; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <i*2; j++) {
                System.out.print("*");
            }
            {
                System.out.println();
            }
        }

        */
//4.	给一个不知道位数的整数，计算它各个位的和。
 /*

        int sum=0;//存放和
        int x=789;//正常数字
        while (x >0){
            sum=sum+x%10;
            x=x/10;
        }
        {
            System.out.println("各位数字和是:"+sum);
        }

        */
//5.	一个球每次落下是弹起高度是落下高度的一半，落十次以后，弹起高度是5米，求球第一次落下的高度。
/*

        int x=5;
        for (int i = 0; i <10; i++) {
            x=2*x;
        }
        {
            System.out.println(x);
        }

*/

//6.	编程计算：有一条长阶梯，若每步跨2阶，则最最后剩一阶，若每步跨3 阶，则最后剩2阶，若每步跨5阶，则最后剩4阶，若每步跨6阶则最后剩5阶。只有每次跨7阶，最后才正好一阶不剩。请问这条阶梯最少共有多少阶？
        /*
        //我有请教老师
        for (int a= 0;true; a++) {
            if (a%2==1&&a%3==2&&a%5==4&&a%6==5&&a%7==0){
                System.out.println(a);
                break;
            }
        }

        */

//        8.	求一个0～100的所有可以被3和7整除的数据的和。
        //本题结果2208

        /*
        int sum=0;
        for (int a= 0;a<100; a++) {
            if (a%3==0||a%7==0){
                sum=sum+a;
            }
        }
        {
            System.out.println(sum);
        }
        */

//9.	打印1～100中不可以被7整除且各中位中都不可以包含7的数
        /*
        int a=0;
        int b=0;
        for (int i = 1; i <100; i++) {
            if (i%7==0&&i%10!=7&&(i/10%10)!=7){
                System.out.println(i);
            }
            }
            */


//        10.	编写一个菜单的选择程序：完成以下的功能：请输入你的选择条件：1：水煮鱼  2：土豆  3：青菜  4：退出
        /*
        int a=1;//水煮鱼
        int b=2;//土豆
        int c=3;//青菜
        int d=4;//退出
        Scanner sn=new Scanner(System.in);
        int n=sn.nextInt();
        if (n==a){
            System.out.println("1.水煮鱼");
        }
        else if (n==b){
            System.out.println("2.土豆");
        }
        else if (n==c){
            System.out.println("3.青菜");
        }
        else if (n==d){
            System.out.println("4.退出");
        }

        */


////
       /* int[]arr={35,26,78,9,20,61,15000,4500,8};
        int sum=0;
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i <arr.length; i++) {
            sum=sum+arr[i];
            if (max<arr[i]){
                max=arr[i];
            }
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("最大值"+max);
        System.out.println("最小值"+min);
        System.out.println("元素之和"+sum);*/

       /*
       int index=15000;
        int p=20;
        int[]arr={35,26,78,9,20,61,201,4500,8};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==p){
                System.out.println("值为p的元素下标是："+i);
            }
            if (arr[i]==index){
                arr[i]=201;
            }
        }
        int t=5;//arr为4的下标处后方插入
        int t1=1800;//要插入的值
        int[]arrx=new int[arr.length+1];
        for (int i = 0; i <t; i++) {
            arrx[i]=arr[i];
        }
        for (int i = t; i <arr.length; i++) {
            arrx[i+1]=arr[i];
        }
        arrx[t]=t1;
        System.out.println(Arrays.toString(arrx));

        */

//数组练习：
//1.	定义一个一维整形数组，并给初值，打印他所有的元素。
    /*

    int[]arr={15,6,7,4,9,2,3,12};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }

        */
//2.	定义一个一维字符串型数组，并给初值，打印他所有的元素。
        /*
        String[]arr={"H","E","L","L","0"};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }

        */

//3.	定义一个一维整形数组，并给初值，打印他最大的元素和最小的元素。
        /*

        int[]arr={1,6,7,4,9,2,3,12};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i <arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

        */

//4.	定义一个一维整形数组，并给初值，打印所有元素的和。
        /*
        int[]arr={8,6,7,12,9,56,78};
        int sum=0;
        for (int i = 0; i <arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println(sum);
        */

//5.	定义一个一维整形数组，并给初值，打印所有奇数。
        /*
        int[]arr={8,6,7,11,9,53,78};
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
        */

//6.	定义一个一维整形数组，并给初值，打印所有可以被三整除的数。
        /*
        int[]arr={8,6,7,11,9,53,78};
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]%3==0){
                System.out.println(arr[i]);
            }
        }
        */

//7.	定义一个一维整形数组，并给初值，先顺着打印，再反着打印。
        /*
        int[]arr={8,6,7,11,9,53,78};
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
        for(int i = arr.length-1; i >=0; i--) {
            System.out.println(arr[i]);
        }
        */

//8.	定义一个字符串名字数组，打印出姓“李”的人。提示:字符串的函数
        /*
        String[]arr={"刘小军","李想芸","王佳佳","阮露露"};

        for (int i = 0; i <arr.length; i++) {
           char c=arr[i].charAt(0);
            System.out.println(c);
        }
        if (c=="李"){}
        */

//9.	定义一个一维整形数组，给初值，用冒泡法排序。
        /*int[]arr={10,5,9,7,8,4,1,0};
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length-1; j++) {
               if (arr[j]>arr[j+1]){
                   int g=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=g;
               }
            }
            System.out.println(Arrays.toString(arr));
        }
        //System.out.println(Arrays.toString(arr));*/

//1.	随机输出x个1~6的数值（x由程序员手动输入）（结合循环、键盘类、随机类）
       /*

       Random random=new Random();
       int y=5;//手动输入的数值
       int x=random.nextInt(6);
        for (int i = 0; i <y; i++) {
            System.out.println(x);
        }

        */

//2.	做一个计算器程序，计算器中有+ - * / ，输入要相加或相乘等数值，输出结果。输出结	果后，问是否继续，继续输入’C’，开始下一轮计算。(结合键盘类、语句、循环)
       /* Scanner i=new Scanner(System.in);
        String c="c";
           while(true){
            if (c.equals("c")) {
                System.out.println("输入的第一个数值");
                double a = i.nextDouble();//输入的第一个数值
                System.out.println("输入的第二个数值");
                double b = i.nextDouble();//输入的第二个数值
                System.out.println("相加" + (a + b));
                System.out.println("相减" + (a - b));
                System.out.println("相成" + (a * b));
                System.out.println("相除" + (a / b));
                c = i.next();//输入为"c"赋值给c进行下一轮运运算
            }
            else {break;}
        }*/

       /*
        int a=1;//水煮鱼
        int b=2;//土豆
        int c=3;//青菜
        int d=4;//退出
        Scanner sn=new Scanner(System.in);

            while (true) {
                int n=sn.nextInt();
                if (n == a) {
                    System.out.println("1.水煮鱼");continue;
                } else if (n == b) {
                    System.out.println("2.土豆");continue;
                } else if (n == c) {
                    System.out.println("3.青菜");continue;
                } else if (n == d) {
                    System.out.println("4.退出");continue;
                }
        }

        */

        /*int n;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Input an integer");
            n = input.nextInt();
            if (n != 0) {
                System.out.println("You entered " + n);
                continue;
            } else {
                break;
            }
        }*/



        /*Scanner sc = new Scanner(System.in);
        while (true) {            //巧用while(true){}死循环
            System.out.println("请输入一个1-5的整数:");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("新建");
                    break;
                case 2:
                    System.out.println("打开文件");
                    break;
                case 3:
                    System.out.println("保存");
                    break;
                case 4:
                    System.out.println("刷新");
                    break;
                case 5:
                    System.out.println("退出");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误,请重新输入");
                    System.out.println("=================");
                    break;
            }
        }*/

////3.	要求用户输入一个0到2之间的整数，（结合键盘类、随机类、循环、语句）
//        (1)	系统随机出石头剪刀布
//        (2)	* 输入0“石头”，
//        (3)	* 输入1“剪刀”，
//        (4)	* 输入2就“布”，
//        (5)	* 决出胜负后问是否要继续，
//        (6)	* 如果回答“y”就重复以上过程，否则结束程序。
        /*
        Scanner rb=new Scanner(System.in);
        Random ra=new Random();
        String y="y";
        while (true) {
            if (y.equals("y")) {
                int x = ra.nextInt(3);
                int n = ra.nextInt(3);
                switch (x) {
                    case 0:
                        System.out.println("x石头");
                        break;
                    case 1:
                        System.out.println("x剪刀");
                        break;
                    case 2:
                        System.out.println("x布");
                        break;
                }
                switch (n) {
                    case 0:
                        System.out.println("n石头");
                        break;
                    case 1:
                        System.out.println("n剪刀");
                        break;
                    case 2:
                        System.out.println("n布");
                        break;
                }
                if ((x == 0 && n == 1) || (x == 1 && n == 2) || (x == 2 && n == 0)) {
                    System.out.println("x赢");
                } else if (x == n) {
                    System.out.println("平手");
                } else {
                    System.out.println("n赢");
                }
                y = rb.next();
            }
            else break;
        }
        */

//4.	猜奖活动（结合键盘类、随机类、语句、循环）
//        (1)	系统随机出一个数值，数值范围在1~99以内
//        (2)	用户输入一个数值
//        (3)	若两者值相同，便判定为猜中大奖，随即跳出
//        (4)	若没猜中可继续猜奖，最多只能猜五次

        /*
        Random ran=new Random();
        Scanner sca=new Scanner(System.in);
        int x=0;
        int y=0;
            for (int i = 0; i <5; i++) {
                x=ran.nextInt(100);
                System.out.println("请用户输入数字:");
                y=sca.nextInt();
                if (x==y){
                    System.out.println("中奖");
                }
                else {
                    System.out.println("没中奖");
                }
            }
        System.out.println("5次机会用完");

        */

//1.	有10个评委为参赛的选手打分，分数为1~100分。选手最后得分为：去掉一个最高分和一个最低分后其余8个分数的平均值。请编写一个程序实现用数组
    /*
    int[]arr={1,2,3,4,5,6,7,8,9};
    int max=arr[0];
    int min=arr[0];
    double sum=0.0;
    for (int i = 0; i <arr.length; i++) {
      if (100 >  arr[i] && 1 <= arr[i]) {
        sum = sum + arr[i];
      }
      if (max < arr[i]) {
        max = arr[i];
      }
      if (min > arr[i]) {
        min = arr[i];
      }
    }
    System.out.println("合计"+sum);
    System.out.println("最高分"+max);
    System.out.println("最低分"+min);
    System.out.println("平均分"+(sum-(max+min))/8);
*/

        /*
        int[]arr={0,1,2,3,4,5,6,7,8,9};
        int max=arr[0];
        int min=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("最大值"+max+"最小值"+min);
        */

//2.	编程完成两个数组的对接程序，如a={1,2,3}   b={6,2,4} 对接成 c={1,2,3,6,2,4}
        /*int[]arr1={1,2,3,1500};
        int[]arr2={6,2,4,78,1,26};
        int[]arr3=new int[arr1.length+arr2.length];
        for (int i = 0; i <arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int i = 0; i <arr2.length; i++) {
            arr3[i+arr1.length]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));*/

//3.	编写一个程序把一个数组从中间分成两个数组,如：c={1,2,3,4,5,6}分成{1,2,3}{4,5,6}
        /*int[]c={0,1,2,3,4,5,6,7,8,9};
        int[]c1=new int[3];
        int[]c2=new int[c.length-c1.length];
        for (int i = 0; i <c1.length; i++) {
            c1[i]=c[i];
        }
        for (int i =c1.length; i <c.length; i++) {
            c2[i-c1.length]=c[i];
        }
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));*/
/*4.	编程完成一组人员抽签程序（１０个人抽三个）,最好用数组删除的方法来做。随机数（选做题）

        		Random r=new Random();
        		int index=r.nextInt(10);*/
        /*int[]arr={0,1,2,3,4,5,6,7,8,9};
        //int[]arr={0,1500,2,18,4,99,6,76,58,19};
        int[]arr1=new int[arr.length-1];
        int[]arr2=new int[arr.length-2];
        int[]arr3=new int[arr.length-3];
        Random r=new Random();
        int index=r.nextInt(10);
        System.out.println("第一个数是"+arr[index]);
        for (int i = 0; i <index; i++) {
            arr1[i]=arr[i];
        }

            for (int i = index; i < arr1.length; i++) {
                arr1[i] = arr[i + 1];
            }
      System.out.println(Arrays.toString(arr1));
      index=r.nextInt(9);
      System.out.println("第二个数是"+arr1[index]);
      for (int i = 0; i <index; i++) {
          arr2[i]=arr1[i];
      }
          for (int i = index; i < arr2.length; i++) {
              arr2[i] = arr1[i + 1];
          }
      System.out.println(Arrays.toString(arr2));
      index=r.nextInt(8);
      System.out.println("第三个数是"+arr2[index]);
      for (int i = 0; i <index; i++) {
          arr3[i]=arr2[i];
      }
          for (int i = index; i < arr3.length; i++) {
              arr3[i] = arr2[i + 1];
      }
      System.out.println(Arrays.toString(arr3));*/
//5.	编写一个程序在完成数组的删除在数组中删除一个元素。

       /* int[]arr={7,8,9,776,25,30};
        int index=2;//要删除的数组下标值
        int[]arr1=new int[arr.length-1];
        for (int i = 0; i <index ; i++) {
            arr1[i]=arr[i];
        }
        for (int i = index; i <arr1.length; i++) {
            arr1[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr1));*/
//6.	5_1.编写一个程序在完成数组的插入在数组中插入一个元素。

        /*int[]arr={7,8,9,100,776,25,30};
        int index=2;//要删除的数组下标值
        int add=85;//要插入的元素
        int[]arr1=new int[arr.length+1];
        for (int i = 0; i <index ; i++) {
            arr1[i]=arr[i];
        }
        arr1[index]=add;
        for (int i = index; i <arr.length; i++) {
            arr1[i+1]=arr[i];
        }
        System.out.println(Arrays.toString(arr1));*/


//7.	求两个大数的精确加减法，a=46328648326846835684657654876576657652364652442384, b=47,提示：不可以用java类，要用数组的方法来做，一位一位的加处理进位。（选做题）
      /*int[] a={4,6,3,2,8,6,4,8,3,2,6,8,4,6,8,3,5,6,8,4,6,5,7,6,5,4,8,7,6,5,7,6,6,5,7,6,5,2,3,6,4,6,5,2,4,4,2,3,8,4};
      int[] b={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,4,7};
      int[] c=new int[a.length+1];
    for (int i = a.length-1; i <=0 ; i--) {
      int g=0;
      if (a[i]+b[i]+g>=10){
        c[i+1]=(a[i]+b[i]+g)%10;
        g=1;
      }
      else
      {c[i+1]=a[i]+b[i]+g;
      g=0;
      }
    }*/


//8.	定义一个一维整形数组，用随机数给初值，用冒泡法排序。
        /*Random random=new Random();
        int[]arr={random.nextInt(10),random.nextInt(10),random.nextInt(10),random.nextInt(10),random.nextInt(10),random.nextInt(10),random.nextInt(10)};
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arr));*/
/*9.	使用一维数组实现打地鼠游戏，要求如下：（选做题）
（1）在控制台输出一串10个数字，只有数字为1，表示地鼠出现的位置，每次位置随机变化，其它为0.
（2）要求用户输入一个数字代表打击的位置，输对了提示“打中了”,输错了提示“没打中”。
（3）提示信息显示后从（1）开始新的一轮循环*/
       //pass;


////////方法练习
//1.	输入一个成绩，判断他的的优良中差，优是90～100，良是80～90等。
    /*
    int x=0;//成绩
    if (x>=90&&x<=100)  {
        System.out.println("优");
    }
    else if (x>=80&&x<90){
        System.out.println("良");
    }
    else {
        System.out.println("差");
    }
    */


//2.	编程要求对一个整形数组进行降排序并输出（用改进冒泡法）
        /*
        int[]arr={7,3,5,9,15,6,12};
        boolean flag=true;
        for (int i = 0; i <arr.length; i++) {
            flag=false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                    flag=true;
                }
            }
            if (flag==false){break;}
        }
        */

//3.	编程实现一个投票选举程序，A,B,C三个候选人，用数组描述，写一个菜单程序投票选择。菜单程序退出以后打印投票结果。
/*
        String[] g={"A","B","C"};
        for (int i = 0; i <g.length; i++) {
            String c=g[i];
            switch (c){
                case"A":{
                    System.out.println("A获选");break;
                }
                case"B":{
                    System.out.println("B获选");break;
                }
                case"C":{
                    System.out.println("C获选");break;
                }
            }
        }
*/

/*
4.	打印    这题是由我们来决定打印几行,这里是3行。
	    *
	    ***
	    *****
        假设我输入5行
        *
		***
		*****
		*******
		*********       */

        /*
        int a=8;//循环的行数
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <i*2+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

//5.	打印n*n乘法口诀
        /*
        int n=3;//设定n
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
        */

//6.	计算1+2+3…+n的和是多少
        /*
        int n=9;//设定n值
        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
        */

//7.	有10个评委为参赛的选手打分，分数为1~100分。选手最后得分为：去掉一个最高分和一个最低分后其余8个分数的平均值。请编写一个功能(传入10个评委分数(用数组。10个评委分数可以写死))
        /*
        Scanner score=new Scanner(System.in);
        double sum=0;//评分合计
        double[]arr={score.nextDouble(),score.nextDouble(),score.nextDouble(),score.nextDouble(),score.nextDouble(),score.nextDouble(),score.nextDouble(),score.nextDouble(),score.nextDouble(),score.nextDouble()};
        double max=arr[0];//最高分
        double min=arr[0];//最低分
        for (int i = 0; i <arr.length; i++) {
            sum=sum+arr[i];
            if (max<arr[i]){
                max=arr[i];

            }
            if (min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println((sum-max-min)/8);
        */

//8.	编程完成两个数组的对接功能，如输入两个数组a={1,2,3}   b={6,2,4},对接后返回 c数组,(例如:c={1,2,3,6,2,4}
        /*
        int[]a={1,2,3};
        int[]b={6,2,4};
        int[]c=new int[a.length+b.length];
        for (int i = 0; i <a.length; i++) {
            c[i]=a[i];
        }
        for (int i = 0; i <b.length; i++) {
            c[i+a.length]=b[i];
        }
        System.out.println(Arrays.toString(c));
        */

//9.	计算n的M次方
    /*
    int n=2;
    int M=3;
        for (int i = 0; i <M-1; i++) {
            n=n*n;
        }
        System.out.println(n);
    */

//10.	编写一个对数组指定范围,截取到元素作为新数组返回,例如int[] arr={0,1,2,3,4,5}.输入0,2则返回数组中的0到2(不包含2)的元素
        /*
        int min=0;//指定截取的最小值
        int max=4;//制定截取的最大值
        int[] arr={0,1,2,3,4,5};
        for (int i = 0; i <arr.length; i++) {
            if (min<arr[i]&&arr[i]<max){
                System.out.println(arr[i]);
            }
        }
        */

//11.	使用冒泡排序对。对数组中的指定范围进行排序。例如输入1,5。则这个数组的1角标到5角标。进行排序
        /*
        int min=3;
        int max=7;
        int[]arr={0,1,2,3,4,5,6,7,8,9};
        for (int i = min; i <max+1; i++) {
            for (int j = min; j <max; j++) {
                if (arr[j]<arr[j+1]){
                    int g=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=g;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        */

//12.	在类中定义一个bark( )方法。此方法接收不同的基本数据类型进行重载，并根据被调用的版本，打印出不同类型的接收int打印狗吠（barking）、接收float型时打印咆哮（howling）信息。编写main( )来调用所有不同版本的方法。
//13.	修改上个程序，让两个重载方法各自接受两个类型不同的参数，但二者顺序相反。验证其是否工作。
    /*int[]arr={32,65,74,39,76,82,35};
    boolean f=true;
    for (int i = 0; i <arr.length; i++) {
      f=false;
      for (int j = 0; j <arr.length-1; j++) {
        if (arr[j]>arr[j+1]){
          int g=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=g;
          f=true;
          System.out.println(Arrays.toString(arr));
        }
      }
      if (f==false){
        break;
      }
    }
    System.out.println("输出"+Arrays.toString(arr));*/

//    1、题目：对10个数进行排序
    /*
    boolean flag=true;
    int[]arr={0,1,2,3,4,5,6,7,8,9};
    for (int i = 0; i <arr.length; i++) {
      flag=false;
      for (int j = 0; j <arr.length-1; j++) {
        if (arr[j]<arr[j+1]){
          int g=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=g;
          flag=true;
        }
      }
      if (flag==false){break;}
    }
    System.out.println(Arrays.toString(arr));
    */

//2、有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
    /*
    boolean flag=true;
    int[]arr={0,1,3,5,7,9,11,13,15,17};
    int x=6;//输入的数
    int[] arr1=new int[arr.length+1];
    for (int i = 0; i <arr.length; i++) {
      arr1[i] = arr[i];
      arr1[arr1.length - 1] = x;
    }
      for (int i = 0; i < arr1.length; i++) {
        flag = false;
        for (int j = 0; j < arr1.length - 1; j++) {
          if (arr1[j] > arr1[j + 1]) {
            int g = arr1[j];
            arr1[j] = arr1[j + 1];
            arr1[j + 1] = g;
            flag = true;
          }
        }
        if (flag == false) {
          break;
        }
      }
    System.out.println(Arrays.toString(arr1));
    */

/*3、消息加密的办法是：对消息原文中的每个字母，分别用该字母之后的第5个字母替换（例如：消息原文中的每个字母A都分别替换成字母F）。而你要获得消息原文，也就是要将这个过程反过来。
    密码字母：A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
    原文字母：V W X Y Z A B C D E F G H I J K L M N O P Q R S T U
    注意：只有字母会发生替换，其他非字母的字符不变，并且消息原文的所有字母都是大写的。*/

  /*
  String[]arr={"V","W","X","Y","Z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U"};//原文密码
  String[]arr1={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};//密码字母
      //arr变为arr1；
  String[]arr2={"V","W","X","Y","Z"};//要补充密码末端对应替换的字母
  String[]arr3=new String[arr.length+arr2.length];
      for (int i = 0; i <arr.length; i++) {
          arr3[i]=arr[i];
      }
      for (int i = 0; i <arr2.length; i++) {
          arr3[arr.length]=arr2[i];
      }
    for (int i = 0; i <arr1.length-5; i++) {
      arr1[i]=arr3[i+5];
      //arr3[i+5]=g;
        }
    System.out.println(Arrays.toString(arr1));
   */


//4、创建一维数组，实现随机打乱一个数组

    /*
    int[]arr={0,1,3,5,7,9,11,13,15,17};//初始数组
    Random random=new Random();
    int x=random.nextInt(10);//下标随机数
    for (int i = 0; i <x; i++) {
        int g = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = g;
      }
    for (int i =x+1; i < arr.length-1; i++) {
        int g = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = g;
    }
    System.out.println(Arrays.toString(arr));
    */

//5.创建一维数组，再创建一个数组，对两个有序的数组进行合并，并将重复的数字去掉的方法
   /*
   int[]arr1={7,8,2,5,3,10,4};
   int[]arr2={4,7,5,3,6};
   int[]arr3=new int[arr1.length+arr2.length];//先将两个数组合并

    for (int i = 0; i <arr1.length; i++) {
      arr3[i]=arr1[i];
    }
    for (int i =0; i <arr2.length; i++) {
      arr3[i+arr1.length]=arr1[i];
    }
      for (int i = 0; i <arr3.length-1; i++) {
          for (int j = 0; j <arr3.length-1-i; j++) {
              if (arr3[j]>arr3[j+1]){
                int c=arr3[j];
                arr3[j]=arr3[j+1];
                arr3[j+1]=c;
              }
          }
      }
    System.out.println("合并后的数组并做从小到大排序："+Arrays.toString(arr3));
    int j=0;
    int g=0;
    for (int i = 0; i <arr3.length-1; i++) {
        if (arr3[i] != arr3[i + 1]) {
            arr3[j] = arr3[i];
            j++;
        }
        arr3[j] = arr3[arr3.length - 1];
        g=j;
    }
    int[]arr4=new int[g+1];
    for (int k = 0; k <g+1; k++) {
        arr4[k]=arr3[k];
        }
    System.out.println("删除重复数之后的数组是"+Arrays.toString(arr4));
   */
//6.将一个数组逆序输出
    /*
    int[]arr={0,1,2,3,4,5,6,7,8};
    int[]arr1=new int[arr.length];
    for (int i = arr.length;i <=0; i++) {
        int g=arr[i];
        arr1[i]=arr[arr.length-1-i];
      arr1[arr.length-1-i]=g;
    }
    System.out.println(Arrays.toString(arr1));
    */


//7、创建一个一维数组，最大的元素与第一个元素交换，最小的元素与最后一个元素交换，输出数组。
  /*
  int[]arr={45,68,76,83,42};
  int max=arr[0];
  int min=arr[0];
  int c=0;
  int g=0;
    for (int i = 0; i <arr.length; i++) {
      if (max<arr[i]){
        max=arr[i];
        c=i;
      }
      if (min>arr[i]){
        min=arr[i];
        g=i;
      }
    }
    int x=arr[0];
    arr[0]=arr[c];
    arr[c]=x;
    x=arr[arr.length-1];
    arr[arr.length-1]=arr[g];
    arr[g]=x;

    System.out.println(Arrays.toString(arr));
    */

//8、已知一个数组A，将奇数位置元素存到B数组中，偶数元素存到C数组中
    /*
    int[]a={8,3,6,7,9,5,3,2,0};
    int[]b=new int[a.length];//偶数临时数组
    int[]c=new int[a.length];//奇数临时数组
    int x=0;
    int y=0;
      for (int i = 0; i <a.length ; i++) {
          if (a[i] % 2 == 0) {
              b[x] = a[i];
              x++;
          }
          if (a[i] % 2 != 0) {
              c[y] = a[i];
              y++;
          }
      }
      int[]d=new int[x];
      int[]e=new int[y];
      for (int i = 0; i <x; i++) {
          d[i]=b[i];
      }
      for (int i = 0; i <y; i++) {
          e[i]=c[i];
      }
      System.out.println("偶数"+Arrays.toString(d));
      System.out.println("奇数"+Arrays.toString(e));
      */

//9,已知一个数组A，把A数组的第三到第六位之间的元素删除.
      /*
      int[]arr={8,3,6,7,9,5,3,2,0};
      int[]arr1=new int[arr.length-4];
      for (int i = 0; i <3; i++) {
          arr1[i]=arr[i];
      }
      for (int i = 3; i <arr1.length; i++) {
          arr1[i]=arr[i+4];
      }
      System.out.println(Arrays.toString(arr1));
      */

/*10、现在有如下一个数组：
      int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
      要求将以上数组中的0项去掉，将不为0的值存入一个新的数组，生成新的数组为
      int newArr[]={1,3,4,5,6,6,5,4,7,6,7,5};  */
      /*
      int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
      int x=0;
      for (int i = 0; i <oldArr.length ; i++) {
          if (oldArr[i]!=0){
              oldArr[x]=oldArr[i];
              x++;
          }
      }
      int[] newArr=new int[x];
      for (int i = 0; i <x; i++) {
          newArr[i]=oldArr[i];
      }
      System.out.println("去零后："+Arrays.toString(newArr));
      */




 }
}
