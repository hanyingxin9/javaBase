package javabase.grammar;
/**
 * @description: 运算符
 * @fileName: Operator.java
 * @author: hanyingxin
 * @createAt: 2023/3/7 11:19
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class Operator_4 {
    public static void main(String []args){

        /*
           运算符 :
             算术运算符 （正负）+ -  + - * / % （前后）++ -- （连接）+
                运算符两边是什么数据类型就得到什么数据类型 例如 : int/int  double/int
                取余 %  结果的符号与被模数的符号相同
                开发中经常使用取余操作 % 判断能否除尽 或者按余数分类
                自增（++） 自减（--）
                   （前）++  先自增 1再做运算
                   （后）++  先做运算再自增 1
                   （前）--  先自减 1再做运算
                   （后）--  先做运算再自减

                    ***  不管是前还是后，不要忘了本身加 1或者减 1
                      int a = 10;
                      int b = --a; or int b = a--;
                      无论无何 a 一定减一了，关键看 b

                    ***  使用自增不会改变本身变量的数据类型
                         short s = 1;
                         s = s + 1; 错误不兼容的类型 将int赋值short
                         s++;       正确

                    byte b = 127;
                    b++;
                    -> b = -128;

                    取余操作最多取到 模数-1 例如 : a % b -> 0,1,2,3,4...b-1
                    * 提取三位数每位的值

             赋值运算符
                   =  +=  -=  /=  %=
                   += -= /= %= 不会改变变量本身的数据类型，推荐使用这种，不改变类型 没有bug
                   例如 : short s = 10;
                         s = s + 2; 错误不兼容的类型
                         s += 2;    正确 +=不改变short类型

                   *  int n = 10;
                      n += (n++) + (++n);
                      -> n = 32

             比较运算符（关系运算符）
                 ==  !=  <  >  <=  >=  instanceof
                 比较运算符的结果是 boolean true or false

             逻辑运算符  :   逻辑运算符两边都是boolean类型的值
                 & 逻辑与   && 短路与
                 | 逻辑或   || 短路或
                 ! 逻辑非   ^  逻辑异或

             a       b       a&b      a&&b      a|b      a||b      !a     a^b(相同为false,不同为true)
             true   true     true     true      true     true     false   false
             true   false    false    false     true     true     false   true
             false  true     false    false     true     true     true    true
             false  false    false    false     false    false    true    false

             逻辑运算符中的 & | ^ 要和位运算符中的 & | ^ 区分开
             逻辑运算符两边都是boolean类型的，而位运算符两边都是数值类型

             区分 &（逻辑与）  && （短路与）

             boolean b1 = true;
             int num1 = 10;
             b1 = false;
             if(b1 & (num1++ > 0)){
                System.out.println("逻辑与无论左边为 true 还是 false 都会判断执行右边");
             }else{
                ...
             }

             boolean b2 = true;
             int num2 = 10;
             b2 = false;
             if(b2 && (num2++ > 0)){
               System.out.println("短路与，在左边操作数为false的情况下不会再去判断执行右边，因为对于与操作总体已经为false");
             }else{
                ...
             }

             区分 | （逻辑或）  || （短路或）

             短路与或的本质是惰性运算，在已经确定总体true或false的情况下不去判断执行右边操作数
             ->  1  短路与 左侧出false
             ->  2  短路或 左侧出true

             不管是 短路与或 还是 逻辑与或 最后的结果是一样，开发推荐使用短路与或  &&  ||

              ***
                 boolean x = true;
                 boolean y = false;
                 short z = 42;
                 if((z++ == 42) && (y = true)){
                    z++;
                 }
                 if((x=false)||(++z==45)){
                    z++;
                 }
                 System.out.println(z);
              ***  -> z = 46;

             位运算符 : *** 直接对整数（float ,double不行）二进制的运算
                << 左移         在一定限度内，左移相当于乘2，如果移动的正好将 1 置于符号位,直接成负数
                >> 右移         在一定限度内，右移相当于除以2，正数右移左边高位补 0 负数右移左边高位补 1
                >>> 无符号右移   相比右移，无符号右移就是左边高位无论正负都使用 0 来补
                & 与           按位与，每两个二进制位置上对应 0或1 相与 ，都为 1 则为 1 ，有一个或两个都是0 则为 0
                | 或           按位或，每两个二进制位置上对应的 0或1 相或 ，只要有一个 1 则为 1，两个都是 0 才为 0
                ^ 异或         按位异或，对应两个相同为 0 ，不同为 1
                ~ 取反         二进制数包括符号位全部取反 ，取反完再取反就是本身（都是对二进制数进行操作）

               交换两个变量值方法 :
               int num1 = 10;
               int mun2 = 20;

               1.  int temp = num1;    定义临时变量（推荐）
                   num1 = num2;
                   num2 = temp;

               2.  累加 不用定义临时变量 但相加操作可能会超出数据范围，非数值类型不能直接进行加减操作。
                   只适用于数值类型的加减
                   num1 = num1 + num2;
                   num2 = num1 - num2;
                   num1 = num1 - num2;

               3.  利用位运算符异或的特性 m = (m^n)^n 不用定义临时变量 不会超出数据范围
                   但也只是适用于数值类型的交换操作
                   num1 = num1 ^ num2;  使用位运算符  m = (m^n)^n
                   num2 = num1 ^ num2;
                   num1 = num1 ^ num2;

         三元运算符
              (条件表达式) ? 表达式1 : 表达式2 ;
              条件表达式的结果为boolean类型 ,  表达式为true,执行表达式1,表达式为false,执行表达式2

              其中表达式1 和 表达式2 不一定是同种数据类型 , 但必须可以使用同一种数据类型接收
              比如 :  double max = (3 > 2) ? 1 : 2.0;

              三元运算符可以嵌套使用，把另一个三元运算符当作外层三元运算符的表达式，实现嵌套使用

              三个数比出最大值 :  不建议三元运算符嵌套太多层，可读性太差
              int a = 10;
              int b = 20;
              int c = -30;
              int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

              凡是能用三元运算符的地方都可以替换成 if-else 语句，
              但是使用 if-else语句的地方不一定可以替换为三元运算符，
              如果两种都可以用，建议使用 三元运算符，执行效率高

              运算符优先级 : 不需要太关注运算符的优先级，遇到优先级不确定的地方就是用 () 提高优先级

         */


        //三个数比出最大值 : 三元运算符的嵌套使用
        int a = 10;
        int b = 20;
        int c = -30;
        int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max);

    }
}
