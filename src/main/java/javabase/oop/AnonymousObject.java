package javabase.oop;

/**
 * @description: 匿名对象的使用
 * @fileName: AnonymousObject.java
 * @author: hanyingxin
 * @createAt: 2023/3/26 10:45
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class AnonymousObject {
    public static void main(String [] args){

           //通过创建的实例对象来调用方法 ， 有对象名 anonymous
           Anonymous anonymous = new Anonymous();
           anonymous.sendEmail();

           //直接使用 new出来的结构调用方法 ， 没有对象名 属于匿名对象
           new Anonymous().sendEmail();
           //注意 : 每次使用匿名对象 new Anonymous()实际上都是新创建了一个对象 不同于使用实例对象调用
           new Anonymous().name = "Tom";
           new Anonymous().printName();// null

           //匿名对象的常见使用场景，一个类中需要另外一个类作为这个类方法的形参 ， 调用时直接向里面传匿名对象
           //虽然匿名对象看着只能调用一次，但它作为类中方法的形参（局部变量）被放入栈中存储，可以在方法里面调用多次
           AnonymousFactory anonymousFactory = new AnonymousFactory();
           anonymousFactory.show(new Anonymous());


    }
}

//匿名对象的常见使用场景
class AnonymousFactory{

    public void show(Anonymous anonymous){
        anonymous.sendEmail();
        anonymous.printName();
    }
}

class Anonymous{

    String name;

    public void sendEmail(){
        System.out.println("发送邮件");
    }

    public void printName(){
        System.out.println(name);
    }
}
