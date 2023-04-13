package javabase.oop;

/**
 * @description: this关键字的使用
 * @fileName: ThisKeyWord.java
 * @author: hanyingxin
 * @createAt: 2023/4/12 13:32
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class ThisKeyWord {
    public static void main(String [] args){

        PersonPeople personPeople = new PersonPeople();
        personPeople.setId(18);
        System.out.println(personPeople.getId());
        personPeople.eat();


    }
}

class PersonPeople {

    private int id;
    private String name;

    /*
       构造器中也可以通过this. 调用方法
     */
    public PersonPeople(){
        this.eat();
    }

    /*
       构造器中调用空参构造器
     */
    public PersonPeople(int id){
        this();
        this.id = id;
    }

    public PersonPeople(String name){
        this();
        this.name = name;
    }

    /*
        在构造器中使用this , 这时 this表示为正在创建的对象
     */
    public PersonPeople(int id , String name){
          //this.id = id;
          //this.name = name;
          //使用this显式的调用其他构造器 ， 其他构造器在调用空参构造器
          this(id);

    }

    /*
       在方法中使用this , this表示为当前对象
     */
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    /*
       使用this调用方法 ， 此时this表示为当前对象
     */
    public void eat(){
        System.out.println("人要吃饭");
        this.sleep();
    }

    public void sleep(){
        System.out.println("人要睡觉");
    }



}
