package javabase.grammar;

/**
 * @description: 关键字
 * @fileName: KeyWord.java
 * @author: hanyingxin
 * @createAt: 2023/3/7 11:19
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class KeyWord_2 {
    public static void main(String []args){

       /* keyword 关键字（关键字均小写）

           用于定义数据类型 : class interface enum byte char short int long float double boolean void
           用于定义流程控制 : if else if-else switch case default while do for break continue return
           访问权限修饰符 : public protected default private
           用于定义类，函数，变量修饰符 : abstract final static synchronized
           用于定义类和类之间，类和接口之间 : extends implements
           用于定义建立实例，引用实例，判断实例 : new this super instanceof
           用于异常处理的关键字 : try catch finally throw throws
           用于包的关键字 : package import
           其他修饰符 : native strictfp transient volatile assert
           用于定义数据类型值的字面值 : true false null
           保留字 : goto const
        */

        /*  Identifier 标识符
            标识符位置 : 类名 接口名 枚举类名 方法名 变量名 包名等等

            标识符命名规则 :   ->  规则不通过编译报错
               由26个英文大小写字母(a-z A-Z),0-9,$,_ 组成
               数字不可以开头
               不可以使用关键字和保留字，但可以包括关键字和保留字
               java中严格区分大小写，长度无限制
               标识符不能包含空格

            标识符命名规范 :   -> 规范不遵守编译不报错，尽量遵守
               包名 : xxxx 全小写
               类名，接口名，枚举类 : XxxYyyZzz 大驼峰
               变量名，方法名 : xxxYyyZzz 小驼峰
               常量名 : XXX_YYY_ZZZ 全大写，中间使用下划线连接

            java使用unicode字符集，但标识符命名还是要遵守规则规范
         */

    }
}
