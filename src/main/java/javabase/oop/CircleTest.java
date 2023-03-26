package javabase.oop;

/**
 * @description: 计算圆面积测试类
 * @fileName: CircleTest.java
 * @author: hanyingxin
 * @createAt: 2023/3/25 11:05
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class CircleTest {
    public static void main(String [] args){

               Circle circle = new Circle();
               circle.setRadius(3);
               double radius = circle.getRadius();
               double area = circle.findArea();
               System.out.println(area);

    }
}

class Circle{

    //圆的半径
    private double radius;
    //PI : 圆周率
    public static final double PI = 3.1415926;

    //圆半径的get/set方法
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    //计算圆面积的方法
    public double findArea(){
        return (radius * radius * PI);
    }


}

