package javabase.oop;

/**
 * @description: 封装性
 * @fileName: AnimalTest.java
 * @author: hanyingxin
 * @createAt: 2023/3/29 10:56
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class AnimalTest {
    public static void main(String [] args){

        Animal animal = new Animal();
        animal.name = "大黄";
        animal.age = 2;
        //animal.legs = 4;

        System.out.println(animal.toString());

        //不允许用户直接为属性赋值 ， 设置为私有并向外暴露方法 ， 在方法中做出限制
        animal.setLegs(2);
        //System.out.println(animal.legs);
        //需要getLegs()方法获取私有变量legs的值
    }
}

class Animal{

    String name;
    int age;
    private int legs;

    //四种权限修饰符都可以修饰类的内部结构 : 属性 方法 构造器 内部类 （代码块不行）
    public int gradeA;
    protected int gradeB;
    int gradeC;
    private int gradeD;

    public void setLegs(int legs){

        if(legs >= 0 && legs / 2 == 0){
            this.legs = legs;
        }else{
            //throw new Exception("legs不符合要求");
            this.legs = 0;
        }

    }

    public int getLegs(){
        return legs;
    }


    public void eat(){
        System.out.println("动物进食");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", legs=" + legs +
                '}';
    }
}

