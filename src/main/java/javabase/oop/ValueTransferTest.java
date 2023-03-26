package javabase.oop;

/**
 * @description: 方法形参的值传递机制
 * @fileName: ValueTransferTest.java
 * @author: hanyingxin
 * @createAt: 2023/3/26 14:18
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class ValueTransferTest {
    public static void main(String [] args){


              ValueTransfer valueTransfer = new ValueTransfer();
              int m = 10;
              int n = 20;
              valueTransfer.swap(m , n);
              //输出的还是10 和 20 , 因为这里输出的是实参 m 和 n
              //值传递时，因为 m 和 n 是基本数据类型 ， 所以他们把数据值赋给了形参 ，
              //形参在方法中交换了数据 ， 但随着方法执行完毕这两个形参局部变量就弹出栈了 ，
              //在 main方法中输出的还是两个实参的值 ， 他们并没有参与运算 ， 所以还是原来的数据
              System.out.println("m : " + m + " n : " + n);

              //传递引用类型数据测试
              Data data = new Data();
              data.m = 10;
              data.n = 20;
              valueTransfer.swap(data);
              System.out.println(data.m + " " + data.n);

    }
}

class ValueTransfer{

    //在本类中封装一个交换参数值的方法 ，传递基本类型参数
    public void swap(int m , int  n){
           int temp = m;
           m = n;
           n = temp;
    }

    //传递引用类型参数
    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }

}

class Data{

    int m;
    int n;

}