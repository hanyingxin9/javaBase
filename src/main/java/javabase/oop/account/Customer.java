package javabase.oop.account;

/**
 * @description:  银行客户
 * @fileName: Customer.java
 * @author: hanyingxin
 * @createAt: 2023/4/13 23:44
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class Customer {

    /*
      姓
     */
    private String firstName;

    /*
      名
     */
    private String lastName;

    /*
      银行账户
     */
    private Account account;


    public Customer(){

    }

    public Customer(String firstName , String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
