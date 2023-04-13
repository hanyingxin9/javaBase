package javabase.oop.bank;

/**
 * @description: 银行顾客
 * @fileName: Customer.java
 * @author: hanyingxin
 * @createAt: 2023/4/14 0:07
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class Customer {

    private String firstName;
    private String lastName;
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

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }
}
