package javabase.oop;

/**
 * @description:  Student对象数组的赋值 遍历 排序等操作
 * 把 main中操作全部封装为方法，使 main中条理清楚，没有过多逻辑，只有方法调用
 * @fileName: StudentTest.java
 * @author: hanyingxin
 * @createAt: 2023/3/25 11:44
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class StudentTest {
    public static void main(String [] args){

        //定义Student对象数组
        Student [] student = new Student[20];

        //赋值
        for(int i = 0 ; i < student.length ; i++){
            student[i] = new Student();
            //设置学号
            student[i].setNumber(i + 1);
            //设置年级
            student[i].setState((int)(Math.random() * 12 + 1));
            //设置成绩
            student[i].setScore((int)(Math.random() * 101));
        }


        StudentTest studentTest = new StudentTest();
        //打印 3年级的学生信息
        studentTest.printStudentForState(student,3);

        System.out.println("****************************经过冒泡排序后************************************");

        //使用冒泡排序按学生成绩排序
        studentTest.studentBubbleSort(student);

        //遍历数组
        studentTest.printStudent(student);

    }

    //把 main方法中的逻辑封装成多个方法
    //打印指定数组指定年级的学生信息
    public void printStudentForState(Student [] student , int state){

        for (Student stu : student) {
            if (stu.getState() == state) {
//                  System.out.println(stu + " " + stu.getNumber() + " " + stu.getState() + " "  + stu.getScore());
                System.out.println(stu.toString());
            }
        }
    }

    //使用冒泡排序按学生成绩排序
    public void studentBubbleSort(Student [] student){
        //定义Student类型临时变量
        Student temp;
        for(int i = 0 ; i < student.length - 1 ; i++){
            for(int j = 0 ; j < student.length - 1 - i ; j++){
                if(student[j].getScore() > student[j + 1].getScore()){
                    temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }

    }

    //遍历数组
    public void printStudent(Student [] student){
        for(Student stu : student){
//            System.out.println(stu + " " + stu.getNumber() + " " + stu.getState() + " "  + stu.getScore());
            System.out.println(stu.toString());
        }
    }


}

class Student{

    //学号
    private int number;
    //年级
    private int state;
    //成绩
    private int score;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }

}

