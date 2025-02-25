/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;

/**
 *
 * @author yyneu
 */
public class AccountDirectory {
    public ArrayList<Account> accountList;
    
    public AccountDirectory(){
        this.accountList=new ArrayList<Account>();
    }

    public ArrayList<Account> getAccountlist() {
        return accountList;
    }

    public void setAccountlist(ArrayList<Account> accountlist) {
        this.accountList = accountlist;
    }
    
    public Account addAccount(){
        Account account = new Account();
        accountList.add(account);
        return account;
    }
    
    public void deleterAccount(Account account){
        accountList.remove(account);
    }
    
    public Account searchAccount(String accountNumber){
        for(Account account: accountList){
            if(account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        return null;
    }
}
