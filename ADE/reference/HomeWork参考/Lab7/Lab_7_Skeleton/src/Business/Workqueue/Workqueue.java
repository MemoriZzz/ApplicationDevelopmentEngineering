/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Workqueue;

import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class Workqueue {
    
    private ArrayList<WorkRequest> workRequestList;
    public Workqueue()
    {
        workRequestList = new ArrayList<WorkRequest>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void setWorkRequestList(ArrayList<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }
    
    public WorkRequest addRequest()
    {
        WorkRequest wq = new WorkRequest();
        workRequestList.add(wq);
        return wq;
    }
}
