package javabase.oop;

/**
 * @description: 类中成员的说明和测试
 * @fileName: UserTest.java
 * @author: hanyingxin
 * @createAt: 2023/3/25 8:59
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class UserTest {
    public static void main(String [] args){

           User user = new User();
           user.eat("饺子");


    }
}

/*
   类中成员 :

      1. 成员变量属性  局部变量（方法内变量， 方法形参， 代码块内变量， 构造器内变量， 构造器形参）
      2. 方法
      3. 构造器
      4. 代码块
      5. 内部类

 */
class User{

    //成员变量
    public String name;
    protected int age;
    boolean isMale;
    private double weight;

    User(){

    }

    User(int age){//局部变量 : 构造器形参
        this.age = age;
        boolean isMarry = false;//局部变量 : 构造器内变量
    }

    public void eat(String food){//局部变量 : 方法形参
        String mothod = null;//局部变量 : 方法内变量
        System.out.println(mothod + " " + food);
    }

    {
        //代码块内变量
        String habbit = "乒乓球";
    }

}
