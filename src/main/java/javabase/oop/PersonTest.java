package javabase.oop;

/**
 * @description: Person类的测试
 * @fileName: PersonTest.java
 * @author: hanyingxin
 * @createAt: 2023/3/24 21:23
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class PersonTest {
    public static void main(String [] args){

        //实例化 Person类 , 创建 Person类的对象
        Person person = new Person();
        //通过 对象.属性 调用实例的属性
        person.name = "Tom";
        person.age = 18;
        person.isMale = true;

        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println(person.isMale);

        //通过 对象.方法 调用实例的方法
        person.eat();
        person.sleep();
        person.speak("Chinese");

    }
}

class Person{

    //定义Person类的属性
    String name;
    int age;
    boolean isMale;

    //定义Person类的方法
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void speak(String language){
        System.out.println("人可以说" + language);
    }

}
