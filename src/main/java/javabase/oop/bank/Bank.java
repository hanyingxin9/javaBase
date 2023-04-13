package javabase.oop.bank;

/**
 * @description: 银行
 * @fileName: Bank.java
 * @author: hanyingxin
 * @createAt: 2023/4/14 0:07
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class Bank {

    /*
       存放多个客户的数组
     */
    private Customer [] customers;

    /*
      记录客户的数目
     */
    private int customersOfNumber;

    public Bank(){

    }

    public Bank(int number){
        customers = new Customer[number];
    }

    /*
      添加客户
     */
    public void addCustomer(String firstName , String lastName){
        Customer customer = new Customer(firstName,lastName);
        customers[customersOfNumber++] = customer;
    }

    /*
      获取客户的个数
     */
    public int getCustomerOFNumber(){
        return customersOfNumber;
    }

    /*
      获取指定位置上的客户
     */
    public Customer getCustomer(int index){
        //要对index作出限制，否则可能出现空指针（数组未定义时）或者角标越界（数组定义后）异常
        if(index < 1 || index > this.customersOfNumber){
            //可以选择抛出异常
            return null;
        }else{
            return customers[index - 1];
        }

    }




}
