package javabase.oop;

/**
 * @description: 重载方法测试
 * @fileName: OverLoadTest.java
 * @author: hanyingxin
 * @createAt: 2023/3/26 12:15
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class OverLoadTest {
    public static void main(String [] args){

               OverLoad overLoad = new OverLoad();
               System.out.println(overLoad.mol(12));
               System.out.println(overLoad.mol(12,12));
               System.out.println(overLoad.mol("144"));
               //
               System.out.println(overLoad.max(2,3));
               System.out.println(overLoad.max(2.0,3.0));
               System.out.println(overLoad.max(1.0,2.0,3.0));

               //如果有参数正好对应的方法就直接调用该方法
               overLoad.show("hello");
               //可变个数的形参调用 ， 也可以一个参数不传
               overLoad.show();
               //此时默认调用的还是确定参数的方法，把该方法注释就会调用可变参数的方法
               overLoad.show("hello");
               overLoad.show("hello","world");


    }
}

class OverLoad{

    //重载方法 : 执行平方运算
    public int mol(int num){
        return (num * num);
    }

    //重载方法 : 执行相乘运算
    public int mol(int num,int numr){
        return (num * numr);
    }

    //重载方法 : 执行输出字符串信息
    public String mol(String str){
        return str;
    }

    //重载方法 : 求两个int值中的最大值
    public int max(int i , int j){
        return (i > j) ? i : j;
    }
    //重载方法 : 求两个double值中的最大值
    public double max(double i , double j){
        return (i > j) ? i : j;
    }
    //重载方法 : 求三个double值中的最大值
    public double max(double i , double j , double k){
        return (i > j) ? ((i > k) ? i : k) : ((j > k) ? j : k);
    }

    public void show(int a , char b , double c){}

    //判断下列方法是否是否构成重载
    //public void show(int x , char y , double z){}               no
    //public int show(int n , double c , char b){return 0;}       yes
    //public void show(int a , double b , char c){}               yes
    //public boolean show(int c , char b){return false;}          yes
    //public void show(double c){}                                yes
    //public double show(int x , char y , double z){return 0.0;}  no
    //public void shows(double c){}                               no


    public void show(String str){}
    //可变个数的形参
    public void show(String ...str){}

    //可变个数的形参与传递相同类型的数组效果是一致的，所以这两种不构成重载就是一个方法

    //    public void show(String [] str){
    //        可变参数的形参在方法里面调用的时候和数组使用方法一样
    //        for(int  i = 0 ; i < str.length ; i++) {
    //            System.out.println(str[i]);
    //        }
    //    }

    //可变个数的形参在参数中只能有一个并且必须定义在参数末尾，否则编译器不知道哪里是可变个数的形参的结束位置
    public void show(int i , String ... str){}





}
