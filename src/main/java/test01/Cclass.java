package test01;

import java.util.Scanner;

public class Cclass {
    public static void main(String [] args){

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
