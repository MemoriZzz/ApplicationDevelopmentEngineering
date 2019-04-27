package Business;

import java.util.Date;

public class Account {
    
    private String routingNumber;
    private String accountNumber;
    private String bankName;
    private String balance;
    //private Date createdOn;

    //public Account(){  //insert constructor的时候不要选中复选框
        //this.createdOn = new Date();
    //}//任何时候创建一个新的Account obj,都会自动生成一个创建时间传给createOn这个参数 

    //getters & setters,其中createOn只有getter没有setter
    public String getRoutingNumber() {
        return routingNumber;
    }
    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getBalance() {
        return balance;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }
    //public Date getCreatedOn() {
        //return createdOn;
    //}
    
    @Override
    public String toString(){
        return bankName;
    }


}
