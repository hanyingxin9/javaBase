package test01.javabase.grammar;

/**
 * @description: 变量
 * @fileName: Variable.java
 * @author: hanyingxin
 * @createAt: 2023/3/7 19:03
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class Variable_3 {
    public static void main(String[] args) {

        /*
             变量的定义 : 数据类型 变量名 = 变量值;
             变量的定义可以分成 变量的声明和变量的赋值 两部分
             变量先声明再使用
             变量定义在作用域内，只在作用域内有效，同一个作用域内不允许定义同名的变量
         */

        /*
             java是强类型语言
             按照数据类型分为 :
                基本数据类型 :
                    数值型 : byte short int long
                    字符类型 : char
                    布尔类型 : boolean
                    浮点类型 : float double
                引用数据类型 :  (地址值 or null)
                    类(包括字符串)（class）
                    接口（interface）
                    数组(array)
             按照变量声明位置分 :
                成员变量 :
                    实例变量
                    类变量（static 静态变量）
                局部变量 :
                    形参
                    方法局部变量
                    代码块局部变量
         */

        /*
           byte 1字节 -128-127
           short 2字节
           int 4字节   默认
           long 8字节  带 "L"

           float 4字节  精确到7位有效数字 存储数据范围大于long 带 "F"
           double 8字节  两倍于float 默认

           char 1字符 2字节 声明一个字符 声明转义字符 直接使用Unicode字符集表示字符
           ASCII 128 a->97 A->65
           Unicode 落地实现 UTF-8
           保存文件的时候使用的字符集一定要和解析文件时使用一样的字符集 例如统一使用UTF-8 或 统一使用GBK

           boolean true or false
           转义字符 反转义字符  \n  \\n  "  \"
         */

        /*
           基本数据类型之间的运算规则 :  7种（不包含boolean）
             自动类型提升 :
                当容量小的数据类型的变量和容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型
                容量大小指存储数据范围大小
                自动类型提升规则 : byte,char,short -> int -> long -> float -> double
                其中byte,char,short三种类型之间运算统一使用int接收

             强制类型转换 :  自动类型提升的逆运算
                使用强转符 ()
                不一定会损失精度（可能会也可能不会）
         */

        /*
            整型常量默认为int型
            浮点型常量默认为double型
         */

        /*
            字符串 String类型变量使用  -> 引用数据类型
            使用 "" 声明String类型变量
            String类型变量可以和8种基本数据类型做运算 ，+ 连接运算 ，运算结果还是String类型

            String类型和基本数据类型之间的转换

               String类型转基本数据类型 : 各包装类调用各自方法
                     byte a = Byte.parseByte(str);
                     char ?
                     short c = Short.parseShort(str);
                     int d = Integer.parseInt(str);
                     long e = Long.parseLong(str);
                     float f = Float.parseFloat(str);
                     double g = Double.parseDouble(str);

               基本数据类型转String类型 :
                     String s = String.valueOf(Obj obj);
                     String str = Character.toString(char);
         */
        String str = 123 + "";
        int i = Integer.parseInt(str);
        System.out.println(i);
        double v = Double.parseDouble(str);
        System.out.println(v);
        //
        String s = String.valueOf(i);
        System.out.println(s);
        //char -> String
        String c = Character.toString('c');
        System.out.println(c);

        /*
            进制转换
            计算机底层使用二进制存储
            二进制 0,1 以0b/0B开头
            十进制 0-9
            八进制 0-7 以数字0开头
            十六进制  0-9 A-F 0x/0X

            二进制正数 原码反码补码 三码相同
            二进制负数 原码为对应的二进制正数符号位取反 例如 : 8 -> 00001000 -8的原码 -> 10001000
                     反码为原码符号位不变，其他位按位取反
                     补码位反码 + 1

             计算机底层以补码的形式存储，给出的二进制一定是补码形式，
             正数三码合一，负数补码 -1 除符号位取反之后得到二进制负数的原码，按位加权得到十进制数值再取负号即为十进制
             解释 : byte b = (byte)128;
             -> b = -128;问题
         */
        byte b = (byte)128;
        System.out.println(b);

        /*
           二进制转十进制 :  按位加权取和
           十进制转二进制 :  辗转相除 2 取余，取余数的逆
           二进制转八进制 :  每三位看作一位，计算完前面加0
           二进制转十六进制 : 每四位看作一位，计算完前面加0x
           八进制，十六进制转二进制 : 每一位拆分成 三位/四位 ，得到各自对应的二进制
           八进制，十六进制，十进制相互转换 : 通过二进制进行转换

           遇到进制转换问题去Integer类中调用进制转换方法
         */

        /* 复习 查缺补漏

           java关键字全部小写
          《代码简洁之道》
          变量
             按照数据类型来分 ...
             按照声明位置来分 ...
          char型变量通常使用 '' 表示，但是也可以直接使用ASCII码表示 例如 :  char c = 97;
          所有数值底层都使用二进制存储，无论是正数还是负数都是用补码形式存储，二进制正数三码合一，二进制负数原码 反码 补码

          *由二进制正数的三码 -> 修改符号位得到对应的二进制负数的原码 -> 除符号位按位取反，+1 -> 得到二进制负数的补码

          十进制转二进制 : 辗转除2 取余的逆
          二进制和八进制，十六进制之间的转换
         */
    }
}
