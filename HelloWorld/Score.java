package HelloWorld;

import org.jcp.xml.dsig.internal.dom.DOMUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Score {
    Scanner scanner = new Scanner(System.in);

    public static void score(double x) {
        if (x >= 90 && x <= 100) {
            System.out.println("优");
        } else if (x >= 80 && x < 90) {
            System.out.println("良");
        } else {
            System.out.println("差");
        }
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public Scanner getScanner() {
        return scanner;
    }

    public static void Voting(int[] arr) {//选A 填0选B 填1 .选C 填 2  弃权不填或填其它
        int m = 0;
        int j = 0;
        int k = 0;
        int d = 0;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    ++m;
                    break;
                case 1:
                    ++j;
                    break;
                case 2:
                    ++k;
                    break;
                default:
                    ++d;
                    break;
            }
        }
        System.out.println("A得票:" + m + " B得票:" + j + " C得票:" + k + " 无效票 " + d);
    }

    public static void print(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void power(int n, int m) {
        int sum = 1;
        for (int i = 0; i < m; i++) {
            sum = sum * n;
        }
        System.out.println(sum);
    }

    public static void sum(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            c = i + c;
        }
        System.out.println(c);
    }

    public static void AverageScore(double[] arr) {
        double max = arr[0];
        double min = arr[0];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (1 <= arr[i] && arr[i] <= 100) {
                sum = arr[i] + sum;
                if (max < arr[i]) {
                    max = arr[i];
                }
                if (min > arr[i]) {
                    min = arr[i];
                }
            } else {
                System.out.println("本评分重评");
            }
        }
        System.out.println("选手获得的平均分为" + (sum - max - min) / 8);
    }

    public static void ArraySplicing(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
    }

    public static void MultiplicativePithy(int n) {
        for (int j = 1; j < n + 1; j++) {
            for (int i = 1; i < n + 1; i++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }

    public static void Arrayinterception(int min, int max, int[] arr) {
        int temp = 0;//存放符合的元素个数
        int minindex = 0;//获取第一个下标：不与最小值相等时+1
        Arrays.sort(arr);//首先先进行排序。
        int p = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min <= arr[i] && arr[i] < max) {
                temp++;//可以求得符合条件的元素个数，进而求出最终数组的长度
            }
            if (arr[i] < min) {
                minindex = i + 1;//随着循环的增加  这里的i是最接近min的那个i
            }
            if (arr[i] == min) {
                minindex = i - p;////随着循环的增加  这里的i是第一次出现相等的i
                p++;
            }
        }
        int[] newarr = new int[temp];
        for (int i = 0; i < temp; i++) {

            newarr[i] = arr[i + minindex];
        }
        System.out.println(temp);//最终数组的长度
        System.out.println(minindex);//第一个下标
        System.out.println(Arrays.toString(newarr));
    }

    public static void MulitSort(int a, int b, int[] arr) {
        int[] newarr = new int[b - a + 1];
        for (int i = 0; i < a - 1; i++) {
            arr[i] = arr[i];
        }
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = arr[i + a];

        }
        Arrays.sort(newarr);
        for (int i = 0; i < newarr.length; i++) {
            arr[i + a] = newarr[i];
        }
        for (int i = b + 1; i < arr.length; i++) {
            arr[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void bark(int a) {
        System.out.println("darking");
    }

    public static void bark(float a) {
        System.out.println("howling");
    }

    public static void bark(float a, int b) {
        System.out.println("float and int");
    }

    public static void bark(int b, float a) {
        System.out.println("int and float");
    }

    public static void sort(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        int n = 0;
        int[] d = new int[c.length];
        for (int i = 0; i < c.length; i++) {
            boolean f = true;
            A:
            for (int j = 0; j < d.length; j++) {
                if (c[i] == d[j]) {
                    f = false;
                    break A;
                }
            }
            if (f) {
                d[n++] = c[i];
            }
        }
        c = new int[n];
        for (int i = 0; i < c.length; i++) {
            c[i] = d[i];
        }
    }

    public static void main(String[] args) {
        /*int x = 3;
        int[] a = {7, 23, 15};
        int[] b = {1, 23, 0, 4, 0, 66, 7, 8, 29, 0};
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        int n = 0;
        int l=0;
        int[] d = new int[c.length];
        System.out.println(Arrays.toString(d));
        for (int i = 0; i < c.length; i++) {
            boolean f = true;
            A:for (int j = 0; j < d.length; j++) {
                if(c[i]==0){l++;}
                if (c[i] == d[j]) {
                    f = false;
                    break A;
                }
            }
            if (f) {
                d[n++] = c[i];
            }
        }
        if (l>1){
        c = new int[n+1];}
        else{c = new int[n];}
        for (int i = 0; i < c.length; i++) {
            c[i] = d[i];
        }
        System.out.println(Arrays.toString(c));*/


        Candy cd=new Candy();
        cd.color="黑";
        cd.havge=80;
        cd.nk();

        int x=5;
        for (int i = 0; i <x ; i++) {
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print(" ");
                for (int k = 0; k <5; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

}

}


