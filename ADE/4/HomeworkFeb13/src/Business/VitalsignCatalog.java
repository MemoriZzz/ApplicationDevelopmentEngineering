/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;

/**
 *
 * @author rachelwang
 */
public class VitalsignCatalog {
    
    private ArrayList<Vitalsign> vitalsignCatalog;
    
    public VitalsignCatalog(){
        vitalsignCatalog = new ArrayList<Vitalsign>();
    }
    
    public ArrayList<Vitalsign> getVitalsignCatalog(){
        return vitalsignCatalog;
    }
    
    public Vitalsign addVitalsign(){
        Vitalsign v = new Vitalsign();
        vitalsignCatalog.add(v);
        return v;
    }
    
    public void deleteVitalsign(Vitalsign v){
        vitalsignCatalog.remove(v);
    }
    //无search功能
    
}
