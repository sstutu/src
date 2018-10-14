package HelloWorld.面向对象;

public class DTShape extends TShape {
    double a;
    double b;
    double c;
    DTShape(double a,double b,double c){
      this.a=a;
      this.b=b;
      this.c=c;
    }
    double area() {
        if (super.isT() != false) {
            if (isT() != false) {
                double p = a + b + c;
                double area = Math.sqrt((p - a) * (p - b) * (p - c));
                return area;
            } else return -1;//不是三角形
        } else return -1;//不是等腰三角形
    }
    void showHigh(){
        if (isT()!=false) {
            System.out.println("a边的腰高" + 2 * area() / a);
            System.out.println("a边的腰高" + 2 * area() / b);
            System.out.println("a边的腰高" + 2 * area() / c);
        }
        else{
            System.out.println("不是等边三角形");
        }

    }
    boolean isT(){//判断是不是等腰三角形
        //if (a==b||a==c||c==b)
        if ((((a+b)>c&&(a-b)<c)&&a==b)||(((a+b)>c&&(a-b)<c)&&a==c)||(((a+b)>c&&(a-b)<c)&&c==b)){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        double a=30;
        double b=1;
        double c=1;
        DTShape k=new DTShape(a,b,c);
        System.out.println(k.isT());
        System.out.println(k.area());
        k.showHigh();
    }
}



