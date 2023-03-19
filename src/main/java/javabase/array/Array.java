package javabase.array;

import java.util.Scanner;

/**
 * @description: 数组 Array
 * @fileName: Array.java
 * @author: hanyingxin
 * @createAt: 2023/3/14 15:24
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class Array {
    public static void main(String [] args){

        /*
            数组 Array :  多个相同数据类型按一定顺序排列的集合

            数组是有序排列的
            数组本身是引用数据类型，但是数组的元素可以是 基本数据类型 或 引用数据类型
            创建数组对象会在内存空间中开辟一整块的连续空间 （顺序表存储），
            而数组名中引用的是这块连续空间的首地址值
            数组的长度一旦确定就不能再修改
            数组直接通过索引（下标）的方式调用该索引位置上的元素，时间复杂度为常数级 o(1)

            数组的分类 :

               维度 :  一维数组， 二维数组 ， 多维数组

               按照数组元素的类型分为 :  基本数据类型元素的数组   引用数据类型元素的数组


             一维数组的使用 :

                  一维数组的声明和初始化 :

                       //声明和初始化分开
                       int [] ids; //数组的声明
                       ids = new int[]{1001,1002,1003,1004};  //数组的静态初始化 , 初始化和数组元素的赋值操作同时进行

                       //声明和初始化一起进行
                       String [] names = new String[5];       //数组的动态初始化 ， 初始化和数组元素的赋值操作分开进行


                      数组的静态初始化 :
                      int array = new int[]{1001,1002,1003,1004};
                      数组的动态初始化 :
                      int array = new int[4];

                      不管是哪种初始化方式 ， 只要初始化完成 ， 数组的长度就确定了  （array.length）


                   调用一维数组指定位置的元素 :  java数组下标从 0 开始

                        ***  通过索引（下标）的方式调用，注意索引是从 0 开始的 ， 到 （数组的长度 - 1）结束
                        --->  [0,....length-1]

                        为数组元素赋值的时候不要超出数组的范围，
                        否则会报 ArrayIndexOutOfBoundsException 数组下标越界


                   获取数组的长度 :

                        String [] names = new String[5];
                        int namesLength = names.length;

                        ->  namesLenth = 5;


                  遍历数组元素 :  使用循环遍历数组

                       for(int i = 0 ; i < names.length ; i++){
                            System.out.println(names[i]);
                       }


                  数组元素的默认初始化值 :

                        -> 数组元素是整型（byte,short,int,long） :  0
                        -> 数组元素是浮点型（float,double） :  0.0
                        -> 数组元素是字符型（char） :  0（ASCII码）  或  '\u0000' ，不是 '0'
                        -> 数组元素是布尔类型（boolean） : false

                        -> 数组元素是引用数据类型（类 ， 接口 ， 数组） :  null ，不是 "null"


                 数组的内存解析 :

                        栈（stack） :  局部变量
                        堆（heap）  :  new出来的结构 -> 对象 数组
                        方法区 :
                           常量池
                           静态域


                ***  一维数组的内存解析 :

                   int [] arr = new int[]{1,2,3};
                   String [] str = new String[5];
                   str[1] = "张三";
                   str[2] = "李四";
                   str = new String[3];
                   System.out.println(str[1]);

                   1. 静态初始化 ， new出来的放在堆空间中 ， 默认初始化数组元素都是 0 ，分别赋值上 1，2，3
                      然后把它们的首地址值赋给栈空间中的局部变量 arr , arr就指向了 堆中的数组

                   2. 动态初始化 ， new出来的String数组存放在堆中 ， 默认初始化数组元素为 null
                      将他们首地址值赋给栈空间中的局部变量 str ， str就指向了堆中的String数组

                   3. 根据存储在栈中局部变量 str 所引用的地址值根据索引找到str[1],str[2]并分别赋值

                   4. 在堆空间中新 new出来的String数组默认初始化数组元素为 null ,将首地址值赋给 str , 覆盖掉
                      原先的地址值 ， 所以栈中的 str变量就指向了新的数组 ，之前老数组没有引用指向它 ， 在某个时刻
                      被垃圾回收走 ， 当方法执行完毕时 ， 栈中的局部变量也被弹出栈 ， 没有引用指向 ， 堆中剩余的实例
                      也会被垃圾回收



            多维数组的使用 :

                 二维数组的使用 :

                     二维数组的声明和初始化  :

                            1.静态初始化 :

                                 int [][] arr = new int[][]{{1,2,3},{2,4},{5,6,7}};
                                 []位置无所谓，放在变量名前后均可
                                 无论是一维数组还是二维数组,静态初始化的时候都可以通过类型推断去掉 new ...
                                 前提是数组声明和初始化放在一行写
                                 例如 :  int [][] arr = {{1,2,3},{2,4},{5,6,7}};
                                        String [] str = {"张三","李四","王五"}; ->  String [] str = new String[]{"张三","李四","王五"};


                            2.动态初始化 :

                                 1.String [][] str = new String[3][2];
                                 2.String [][] str = new String[3][];


                     调用二维数组指定位置上的元素 :

                             System.out.println(arr[2][3]); -> arr数组第三行第四列的元素 ， 数组下标都是从 0 开始的


                     *** 注意  String [][] str = new String[3][];
                              System.out.println(str[1][0]);//空指针异常 ， 上面的语句只是在堆中定义了三个行，三个行里面还没有定义

                              正确的 :

                                 String [][] str = new String[3][];
                                 str[1] = new String[4];
                                 -> str[1][0] = null;

                    获取数组长度 :

                             String [][] str = new String[3][2];
                             System.out.println(str.length);// 3
                             System.out.println(str[1].length);//第二行数组的长度 2


                    遍历二维数组 :  双重 for循环

                             String [][] str = new String[3][2];

                             for(int i = 0 ; i < str.length ; i++){

                                 for(int j = 0 ; j < str[i].length ;j++){

                                     System.out.println(str[i][j]);
                                 }
                             }


                    二维数组的使用 :

                            规定 :  二维数组分为 外层数组的元素 和 内层数组的元素
                                        例如 : 外层数组  str[0] , str[1] ,...
                                              内层数组  str[0][0] , str[1][2] ,...

                            数组元素默认初始化值 :

                               针对初始化方式一 :  int [][] arr = new int[3][2];
                                  外层元素初始化值 : 地址值
                                  内层元素初始化值 : 与一维数组初始化情况相同，基本数据类型或者引用数据类型

                               针对初始化方式二 :  int [][] arr = new int[4][];
                                  外层元素初始化值 : null
                                  内层元素初始化值 : NullPointerException

                            举例 :

                            int [][] arr = new int[4][3];
                            System.out.println(arr[0]);// 该一维数组地址值 [I@15db221
                            System.out.println(arr[0][0]);// 0
                            System.out.println(arr);// 二维数组地址值 [[I@6du2322

                            String [][] str = new String[3][2];
                            System.out.println(str[1]);// 该一维数组地址值 [Ljava.lang.String;@78232d23
                            System.out.println(str[1][2]);// null

                            *** 在二维数组中,外层的一维数组存储的也是 引用数据类型变量 数组 ，
                            所以无论是二维数组变量还是一维数组变量 str , str[1] , arr , arr[0]
                            存储的要不是地址值要么是null

                            ***二维数组的内层数组的元素值看数据类型 ，要么存储的是基本数据类型 ， 要么存储的是引用数据类型的值


                            double [][] arr = new double[4][];
                            System.out.println(arr[1]);// null
                            System.out.println(arr[1][0]);// java.lang.NullPointerException 空指针异常


                    二维数组的内存解析 :

                        public static void main(String [] args) {

                            ...
                            int [][] arr = new int[4][];
                            arr[1] = new int[]{1,2,3};
                            arr[2] = new int[4];
                            arr[2][1] = 30;
                            ...

                       }

                       以上述代码为例，想象二维数组的内存解析，
                       随着main函数执行完毕，栈中元素弹出栈，堆中未被引用的实体被垃圾回收


                       ***引用类型数据类型存储要么是地址值 ， 要么是 null
                       所以 String数组中存储的并不是直接的字符串，而是地址值
                       只不过这个地址值又指向了方法区中常量池中的字符串


                       *** 数组的常见算法 :

                          1.数组元素的赋值 :
                                 杨辉三角   YangHuiSanJiao
                                 回形数     AnamorphosisNumber  ***

                          2.求数值型数组中元素的最大值 ，最小值 ，平均数 ，总和  Array_MaxMinSumAvg


                          3.数组的复制 ，反转 ，查找（线性查找 ，二分法查找）
                                 复制      ArrayCopy


                          4.数组元素的排序算法










         */

        //请输入学生人数，并依此作为数组中元素个数 输入每个学生的成绩 ,
        //计算最大值并以最大值为参考计算别的成绩的等级level
        //
        System.out.print("请输入学生人数 : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("请输入" + number + "个成绩 :");
        int [] grade = new int[number];

        //因为成绩最低为 0 分 ， 所以这里把最大值 maxGrade 设置为了 0 ，
        //开发中这种场景下最好将 maxGrade赋值为数组中第一个元素，保证最大值取值正确
        //例如数组中都是负数，最大值初始设置为 0 ，就有可能出现最大值错误，并非数组中元素的问题
        int maxGrade = 0;
        for(int  i = 0 ; i < grade.length ; i++){
            grade[i] = scanner.nextInt();
            if(grade[i] > maxGrade){
                maxGrade = grade[i];
            }
        }
        System.out.println("最高分是 : " + maxGrade);

        char level;
        for(int i = 0 ; i < grade.length ; i++){
            if(grade[i] >= (maxGrade - 10)){
                level = 'A';
            }else if(grade[i] >= (maxGrade - 20)){
                level = 'B';
            }else if(grade[i] >= (maxGrade - 30)){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("student\t" + i + "\tscore is\t" + grade[i] + "\tgrade is\t" + level);
        }




    }
}
