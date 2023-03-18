package javabase.grammar;

import java.util.Scanner;

/**
 * @description: 流程控制
 * @fileName: ProcessControl.java
 * @author: hanyingxin
 * @createAt: 2023/3/10 9:34
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class ProcessControl_5 {
    public static void main(String [] args){

        /*
           流程控制
              顺序结构
              分支结构 :
                 1. if-else
                       if-else有三种结构 :

                           if(条件表达式){

                           }


                           if(条件表达式){

                           }else{

                           }


                           if(条件表达式1){

                           }else if(条件表达式2){

                           }else if(条件表达式3){

                           }else{

                           }
                            :  最后的else如果不需要处理可以直接不写

                           说明 :
                             1. else是可选的
                             2. 针对条件表达式 :
                                   1.如果多个条件表达式之间是互斥的关系（没有交集），
                                     那么哪个判断和执行语句放在上面还是下面无所谓
                                   2.如果多个条件表达式之间有交集，需要根据实际情况，
                                     考虑清楚应该把哪个结构声明在上面
                                   3.如果多个条件表达式之间有包含关系，通常情况下，
                                     需要把范围小的声明在范围大的上面，否则，范围小的没有机会执行。
                             3.  if-else结构可以嵌套，不过不要嵌套太多层（最多不要超过三层），超过三层考虑一下别的方式
                             4.  如果有多个if-else的时候，else就近原则匹配if



                           题目 : 键盘输入三个整数，排序输出

                          其中  if-else if-else结构要注意一点，就是每个的条件表达式范围问题，
                          按顺序从上到下，如果某个条件满足了，就直接跳出分支，不会再执行下面。
                          每个 else if 的条件表达式一定要看清范围，不要犯逻辑错误

                           从键盘获取不同类型的变量，需要使用Scanner类
                           1.导包   import java.util.Scanner;
                           2.实例化 Scanner scanner = new Scanner(System.in);
                           3.调用不同方法获取不同类型的值
                                   int num1 = scanner.nextInt();
                                   double num2 = scanner.nextDouble();
                                   String str = scanner.nextLine();
                           4.需要根据相应的方法，来输入指定类型的值。
                             如果输入的数据类型和要求的数据类型不一致
                             就会报异常 : InputMisMatchException 输入不匹配异常，导致程序终止

                           5.Scanner类没有提供字符char类型的输入,
                             如果想输入字符类型可以使用 next()/nextLine()接收字符串类型
                             再转成字符类型
                                   String charStr = scanner.nextLine();
                                   char charA = charStr.charAt(0);//索引位置

                      *** 随机数生成
                             例如想获取一个 (10,99)之间的随机数 :
                                 Math.random() -> [0.0,1.0)

                                 -->  (int)(Math.random()*(99-10+1) + 10) -> [0,100) -> [0,99]

                             **** 随机数生成规则 :  生成[a,b]区间

                                int randomValue =  (int)(Math.random() * (b-a+1) + a)


                 2. switch-case

                            switch(表达式){

                               case 常量1 :
                                      执行语句1;
                                      break;//可选
                               case 常量2 :
                                      执行语句2;
                                      break;
                               case 常量3 :
                                      执行语句3;
                                      break;
                               ……

                               default :
                                      执行语句n;
                                      //当以上的case未被命中时或者没有break中断时，走default执行语句
                                      break;//可选

                            }

                        说明 :
                           1. 根据switch表达式中的值，依此匹配各个case中的常量，
                              匹配成功就会进入对应case中调用执行语句。
                              调用完执行语句会继续向下执行其他case中的语句，
                              除非中途遇到break/return或者到switch-case结尾;

                           2. break关键字

                           3. switch中的表达式，只能是如下6种类型之一 :
                                byte short char int 枚举类型(jdk1.5) String类型(jdk1.7)

                           4. switch-case结构只能判断是不是某个值，而不能判断范围

                           5. default是可选的，可以没有，位置灵活，不过还是建议将default放在最后

                           6. 如果switch-case中多个case的执行语句相同，可以考虑合并多个case

                           例如 :
                             int num;
                             switch(num){
                               case 1:
                               case 2:
                               case 3:
                               case 4:
                                  System.out.println("....");
                                  break;
                               case 5:
                               case 6:
                               case 7:
                               case 8:
                                  System.out.println("....");
                                  break;
                               default :
                                  System.out.println("....");
                                  break;
                             }

                           7. 如果遇到累加的问题，可以尝试使用switch-case反向累加，比如给出某天是本年的第几天

                           8. 关于范围的分支结构使用 if-else ，不建议使用switch-case 如果要用
                              可以将switch的表达式值取模，缩小case个数

                           9. 凡是使用 switch-case的地方都可以使用 if-else替换，
                              但使用 if-else的地方不一定可以替换成 switch-case

                           10. 开发中如果某个场景下可以使用 switch-case ,并且 switch表达式取值不太多的时候
                               相比较 if-else 更推荐使用 switch-case,因为 switch-case 的执行效率更高


                      三种分支结构（三元运算符算是一个小的分支结构）
                           1. (逻辑表达式) ? 结果1 : 结果2
                           2. if-else
                           3. switch-case


              循环结构

                 1. for循环
                 2. while循环
                 3. do-while循环

                 for循环 :

                    for(int i = 0 ; i < 5 ; i++){

                    }

                 初始化语句只执行 1次,然后就不停的执行判断语句 ，循环体内容 ，累加 ……直到不符合条件退出循环

                 当变量是局部变量的时候一定要考虑到给局部变量初始化的问题，不然即使在后面可能也会赋不上值的情况
                 例如在后面的 if语句中赋值，没有执行到 if语句，那么就会编译错误。再例如 : 后面进入for循环
                 也会有初始值不满足循环条件无法进入的问题，所以局部变量的话一定要记得赋初始值。


                while循环 :

                   初始化语句
                   while(循环条件){
                      执行语句;
                      迭代语句;
                   }

                while循环语句不要忘了迭代条件，否则会进入死循环
                for循环和while循环可以相互转化
                for循环更适合循环次数可以确定的场景下
                while循环适合循环终止条件不确定的场景，适合 变量值叠加 终止循环场景
                此外，for循环和while循环的初始化条件的作用范围不同，for循环中定义的初始化变量出了for循环就失效了
                while循环的初始化变量是定义在循环体外，不会失效


                do-while循环  :

                   初始化语句
                   do{
                     执行语句;
                     迭代语句;
                   }while(循环条件);

               *** do-while循环 和 while循环最显著的区别就是 do-while循环不管初始化语句是否满足
               循环条件，一定会执行一遍循环体。

               do-while无论如何一定会执行一遍循环体中语句

               死循环的写法 :

                   1.for( ; ; ){

                   }

                   2.while(true){

                   }

               循环终止的条件 :

                   1. 不满足循环条件
                   2. break

                   3. 常见的做法
                      isFlag = true;
                      while(isFlag){

                        if(){
                          ...
                          isFlag = false;
                        }

                      }


               嵌套循环
                  外层控制行数，内层控制列数

               ***  输出100以内的质数 :

                        思路 : 使用boolean类型的值记录，执行过程中某种情况下改变isflag达到判断是否进入过循环

                        优化 : 合理的使用 break 和 控制循环层数

                            //*** 100以内的质数  优化 + 思路
                            boolean isflag = true;
                            for(int i = 2 ; i <= 100 ; i++) {
                               for(int j = 2 ; j <= Math.sqrt(i) ; j++){ //Math.sqrt(i)优化
                                   if(i % j == 0){
                                      isflag = false;
                                      break;//优化
                                   }
                               }
                               if(isflag == true){
                                  System.out.println(i);
                               }
                                //重置isflag
                                isflag = true;
                            }
         */




        /*

                      break 和 continue 关键字的使用

                     break 结束当前循环，直接跳出这个循环结构
                     continue 结束当次循环，跳出本次循环，进行下一次循环

                          相同点 :  break 和 continue 关键字后面都不能有执行语句。

                     带标签的 break 和 continue 关键字

                         break 和 continue 默认跳出的都是包裹此关键字最近的一层循环
                         可以通过使用标签的方式指定 break 和 continue 跳出的循环

                         例如 :

                     label : for(int i = 1 ; i <= 4 ; i++){

                               for(int j = 1 ; j <= 10 ; j++){

                                    if(j % 4 == 0){

                                          //break;
                                          //continue;
                                          //break label;跳出指定标识的循环结构
                                          //continue label;跳出指定标识的当次循环

                                    }
                               }

                           }


                    使用带标签的continue解决输出10000以内的质数问题

                    int count  = 0;//记录质数的个数
                    label :  for(int i = 2 ; i <= 100 ; i++) {
                                for(int j = 2 ; j <= Math.sqrt(i) ; j++){ //Math.sqrt(i)优化
                                   if(i % j == 0){
                                     continue label;
                                   }
                                }
                                count++;
                             }

         */

         /*
                    使用boolean值控制循环的方式 :

                         boolean isflag = true;

                         while(isflag){

                            if(...){
                              isflag = false;
                            }

                         }

          */

        /*
                  if
                  if-else
                  if-else if-else
                  if-else if
                  switch-case-default
                  for
                  while
                  do-while
                  break
                  continue
                  label :
                      break label
                      continue label

                  以上分支结构，循环结构，还有关键字break ,continue 以及boolean类型变量isFlag标识
                  等等需要灵活的运用，什么情况下使用什么结构效率最高，退出循环的方式


                  一段功能代码的好坏取决于

                      1. 正确性
                      2. 可读性
                      3. 健壮性
                      4. 高效率和低存储（时间复杂度 , 空间复杂度）

         */


        //例题 :
        int num = 20;
        switch(num){
            case 10 :
                System.out.println("case 10");
                break;
            case 20 :
                System.out.println("case 20");
                return;
            case 30 :
                System.out.println("case 30");
                break;
            default :
                //未被case命中或中途没有break,return就执行default
                System.out.println("other");
        }

        //输入月份,日期，计算出这一天是这年的多少天
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份 :");
        int month = scanner.nextInt();
        System.out.println("请输入天数 :");
        int day = scanner.nextInt();
        //记录总天数
        //不考虑闰年闰月
        int sumDay = 0;
        switch(month){
            case 12 :
                sumDay += 30;
            case 11 :
                sumDay += 31;
            case 10 :
                sumDay += 30;
            case 9 :
                sumDay += 31;
            case 8 :
                sumDay += 31;
            case 7 :
                sumDay += 30;
            case 6 :
                sumDay += 31;
            case 5 :
                sumDay += 30;
            case 4 :
                sumDay += 31;
            case 3 :
                sumDay += 29;
            case 2 :
                sumDay += 31;
            case 1 :
                sumDay += day;
                break;
        }
        System.out.println("这天是这一年里的第" + sumDay + "天");

        //从键盘输入年，月，日，判断这一天是当年的第几天
        System.out.println("请输入年份year");
        int yearValue = scanner.nextInt();
        System.out.println("请输入月份month");
        int monthValue = scanner.nextInt();
        System.out.println("请输入日期day");
        int dayValue = scanner.nextInt();

        //考虑闰年的总日期 :
        //把 if 判断扔到 switch-case中，写一个switch-case就好了,
        //不要把if-else判断放在外面，否则需要写两个 switch-case
        int sumDayIncludeRun = 0;

        switch (monthValue) {

                case 12:
                    sumDayIncludeRun += 30;
                case 11:
                    sumDayIncludeRun += 31;
                case 10:
                    sumDayIncludeRun += 30;
                case 9:
                    sumDayIncludeRun += 31;
                case 8:
                    sumDayIncludeRun += 31;
                case 7:
                    sumDayIncludeRun += 30;
                case 6:
                    sumDayIncludeRun += 31;
                case 5:
                    sumDayIncludeRun += 30;
                case 4:
                    sumDayIncludeRun += 31;
                case 3:
                    if ((yearValue % 4 == 0 && yearValue % 100 != 0) || yearValue % 400 == 0) {
                        sumDayIncludeRun += 29;
                    } else {
                        sumDayIncludeRun += 28;
                    }
                case 2:
                    sumDayIncludeRun += 31;
                case 1:
                    sumDayIncludeRun += dayValue;
                    break;
                default:
                    break;
            }

            System.out.println("考虑闰年总天数" + sumDayIncludeRun);

        //
        //
        //输入两个正整数 , 输出它们的最大公约数和最小公倍数
        System.out.println("请输入正整数 m ");
        int m = scanner.nextInt();
        System.out.println("请输入正整数 n");
        int n = scanner.nextInt();

        //求出 m 和 n 的最大值和最小值
        int max = (m > n) ? m : n;
        int min = (m > n) ? n : m;
        //获取输入参数的最大公约数
        int maxGongYue = 1;
        for(int i = 2; i <= min ; i++){
            if(max % i == 0 && min % i == 0){
                maxGongYue = i;
            }
        }
        //获取输入参数的最小公倍数
        int minGongBei = 0;
        for(int i = max ,j = 2; i <= m * n ; i = (max * (j++))){
            if(i % max == 0 && i % min == 0){
                minGongBei = i;
                break;
            }
        }
        System.out.println("正整数" + m + "和正整数" + n + "的最大公约数和最小公倍数分别是" + maxGongYue + "\t" + minGongBei);


        /*
             *
            * *
           * * *
            * *
             *
         */

        //
        //
        for(int i = 1 ; i <= 3; i++) {
            for (int k = 3 - i; k >= 0; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1 ; i <= 2 ; i++){
            for(int k = 0 ; k <= i ; k++){
                System.out.print(" ");
            }
            for(int j = 2 ; j >= i ; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

        //九九乘法表
        for(int i = 1 ;i <= 9 ; i++){
            for(int j = 1 ; j <= i ; j++){

                System.out.print(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.println();
        }

        //*** 100以内的质数  优化 + 思路
        boolean isflag = true;
        for(int i = 2 ; i <= 100 ; i++) {
            for(int j = 2 ; j <= Math.sqrt(i) ; j++){ //Math.sqrt(i)优化
                if(i % j == 0){
                    isflag = false;
                    break;//优化
                }
            }
            if(isflag == true){
                System.out.println(i);
            }
            //重置isflag
            isflag = true;
        }








    }
}
