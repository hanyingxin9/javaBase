package javabase.oop;

/**
 * @description: 标准JavaBean对象
 * @fileName: Customer.java
 * @author: hanyingxin
 * @createAt: 2023/3/30 10:49
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class Customer {

    private int id;
    private String name;

    public Customer(){

    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
