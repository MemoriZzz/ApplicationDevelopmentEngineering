package Business;
import java.util.ArrayList;
import Business.VitalSigns;
import java.util.List;

public class VitalSignsHistory {
    private ArrayList<VitalSigns>vitalSignHistory;
    
    public VitalSignsHistory(){
        vitalSignHistory=new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    public VitalSigns addVitals()
    {
        VitalSigns vs= new VitalSigns();
        vitalSignHistory.add(vs);
        return vs;
    }
    public void deleteVitals(VitalSigns v)
    {
      vitalSignHistory.remove(v);
      
    }
    
    
    public List<VitalSigns> getAbnormalList(double maxbp,double minbp){
        List<VitalSigns> abnList=new ArrayList<>();
        for(VitalSigns vs:vitalSignHistory){
            if(vs.getBloodPressure()>maxbp|| vs.getBloodPressure()<minbp){
                abnList.add(vs);
        
            }
        
        }
        return abnList;
    
    }
}


