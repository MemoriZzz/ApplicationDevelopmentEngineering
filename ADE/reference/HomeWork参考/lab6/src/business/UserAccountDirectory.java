/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author yyneu
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory()
    {
        userAccountList=new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    public UserAccount addUserAccount(){
        UserAccount userAccount = new UserAccount();
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public void deleteUserAccount(UserAccount ua){
        userAccountList.remove(ua);
    }
}
