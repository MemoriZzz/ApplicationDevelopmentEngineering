/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;

public class VitalSignHistory {
    
   private ArrayList <VitalSigns> array;// 声明: ArrayList <Type> obj;
   
   //Constructor
   public VitalSignHistory(){
       
       array = new ArrayList <VitalSigns>();//构造器里初始化obj
   }
   //Getter and  Stter
   public ArrayList<VitalSigns> getVitalSignHistory() {
       return array;
   }
   public void setVitalSignHistory(ArrayList<VitalSigns> vitalSignHistory) {
       this.array = vitalSignHistory;
   }
   
   //创建一个增加信息的method: 声明一个属于VitalSigns类的变量vs，把vs的值加给VitalSignHistory，return vs
   
   public VitalSigns addMethod(){
       VitalSigns element = new VitalSigns();
       array.add(element);
       return element;
   }
   
   //创建一个删除信息的method：
   public void deleteMethod(VitalSigns element){
       array.remove(element);
   }

}


