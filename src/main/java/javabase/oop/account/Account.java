package javabase.oop.account;

/**
 * @description: 账户信息
 * @fileName: Account.java
 * @author: hanyingxin
 * @createAt: 2023/4/13 23:31
 * @updateBy: hanyingxin
 * @remark: Copyright
 */
public class Account {

    /*
      账号
     */
    private int id;

    /*
      余额
     */
    private double balance;

    /*
      年利率
     */
    private double annualInterestRate;


    public Account(){

    }

    public Account(int id , double balance , double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /*
      取钱方法
     */
    public void withdraw(double amount){
        //余额低于取的钱，直接结束方法
        if(this.balance < amount){
            System.out.println("余额不足");
            return;
        }
        balance -= amount;
        System.out.println("取钱成功" + amount);

    }

    /*
      存钱方法
     */
    public void deposit(double amount){
        //存钱钱数为负值，直接退出
        if(amount < 0){
            System.out.println("存钱不能为负数");
            return;
        }
        balance += amount;
        System.out.println("存入成功" + amount);
    }
}
