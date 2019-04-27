/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Jiya
 */
public class WorkRequest {
    private String message;
    private String status;
    private Date date;
    private UserAccount sender;
    private UserAccount receiver;

    public WorkRequest()
    {
        date = new Date();
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public String toString()
    { return message;
            
            }
    
}
