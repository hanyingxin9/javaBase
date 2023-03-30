package javabase.oop;

/**
 * @description: 构造器的测试
 * @fileName: ConstructorTest.java
 * @author: hanyingxin
 * @createAt: 2023/3/30 10:09
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class ConstructorTest {
    public static void main(String [] args){

         Contructor contructor = new Contructor();
         contructor.name = "王五";
         System.out.println(contructor.name);
         contructor.eat();
         Contructor contructor1 = new Contructor("汉三");
         System.out.println(contructor1.name);

    }
}

class Contructor{

    //属性
    private int no;
    String name;
    protected int grade;
    public boolean isflag;

    //默认空参的构造器
    public Contructor(){

    }

    //自定义有参构造器 ， 给某些属性初始化
    public Contructor(String name){
        this.name = name;
    }

    //全参构造器
    public Contructor(int no , String name , int grade , boolean isflag){
        this.no = no;
        this.name = name;
        this.grade = grade;
        this.isflag = isflag;
    }

    //方法
    public void eat(){
        System.out.println("吃饭。。。");
    }

}
