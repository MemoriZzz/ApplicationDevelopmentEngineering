package Business;

import java.util.ArrayList;

public class AccountDirectory {
    
    private ArrayList <Account> list;

    public AccountDirectory() { //insert constructor 的时候不要选中复选框
        list = new ArrayList<Account>();
    }
    
    //getters & setters
    public ArrayList<Account> getList() {
        return list;
    }
    public void setList(ArrayList<Account> list) {
        this.list = list;
    }
    
    // 3 Methods
    
    public Account addMethod(){
        Account info = new Account();
        list.add(info);
        return info;
    }
    
    public void deleteMethod(Account info){
        list.remove(info);
    }
    
    public Account searchMethod(String accountNumber){
        for(Account info: list){
            if(info.getAccountNumber().equals(accountNumber)) {
                return info;
            }
        }
        return null;
    }
    
}



