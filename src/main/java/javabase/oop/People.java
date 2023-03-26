package javabase.oop;

/**
 * @description:   People类内存解析
 * @fileName: People.java
 * @author: hanyingxin
 * @createAt: 2023/3/25 10:45
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class People {

    //姓名
    private String name;
    //年龄
    private int age;
    //性别
    private int sex;

    //学习方法
    public static void study(){
        System.out.println("studying");
    }

    //显示年龄方法
    public void showAge(){
        System.out.println(age);
    }

    //增加年龄方法
    public int addAge(int i){
        age += i;
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
        //在本类的方法中直接可以调用方法
        study();
    }

    public static void main(String [] args){

        People people = new People();
        //实例化对象之后可以通过 对象.方法 来调用该方法
        //如果是在本类的 main方法中不通过对象调用方法的话该方法就要定义为静态方法 （static）
        study();
        people.setAge(12);
        people.showAge();
        int age = people.addAge(3);
        people.showAge();

    }

}
