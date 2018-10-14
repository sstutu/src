package HelloWorld.面向对象;

public class TShape {
    double a;
    double b;
    double c;
    TShape(){}
    TShape(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    double area(){//使用海伦公式求三角形面积
        if (isT()!=false) {
            double p = a + b + c;
            double area = Math.sqrt((p - a) * (p - b) * (p - c));
            return area;
        }
        else return -1;
    }
    boolean isT(){
        if ((a+b)>c&&(a-b)<c)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        double a=2;
        double b=2;
        double c=2;
        TShape m=new TShape(a,b,c);
        System.out.println(m.area());
    }
}
