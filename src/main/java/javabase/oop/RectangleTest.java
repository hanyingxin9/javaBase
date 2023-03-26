package javabase.oop;

/**
 * @description: 矩形面积的计算
 * @fileName: RectangleTest.java
 * @author: hanyingxin
 * @createAt: 2023/3/25 11:20
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class RectangleTest {
    public static void main(String [] args){

        Rectangle rectangle = new Rectangle();
        rectangle.printRectangle(10,9);
        System.out.println();
        double Area = rectangle.printRectangleAndFindArea(10, 9);
        System.out.println(Area);
    }
}

class Rectangle {

    //打印 iRectangle * jRectangle 矩形
    public void printRectangle(int iRectangle, int jRectangle) {

        for (int i = 0; i < iRectangle; i++) {
            for (int j = 0; j < jRectangle; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
        return;
    }

    //打印 iRectangle * jRectangle 矩形并计算矩形的面积
    public double printRectangleAndFindArea(int iRectangle, int jRectangle) {

        for (int i = 0; i < iRectangle; i++) {
            for (int j = 0; j < jRectangle; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();
        }
        return (iRectangle * jRectangle);
    }
}
