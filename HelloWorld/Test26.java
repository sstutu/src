package HelloWorld;

public class Test26 {

    public static void main(String[] args)  {//1
        try {//2
           throw new Exception("a Exception");//3
        }
      catch (Exception e){//3
          System.out.println("error:"+e.getMessage());//4
      }finally {//5
            System.out.println("a finally cause");//6
        }
    }
}

