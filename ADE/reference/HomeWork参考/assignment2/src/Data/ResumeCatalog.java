/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import java.util.ArrayList;
import java.util.regex.Pattern;

/**
 *
 * @author yyneu
 */
public class ResumeCatalog {
private ArrayList<Resume> resumeCatalog;
    
    public ResumeCatalog() {
        
        resumeCatalog =new ArrayList<Resume>();
    }

    public ArrayList<Resume> getResumeCatalog() {
        return resumeCatalog;
    }

    public void setResumeCatalog(ArrayList<Resume> resumeCatalog) {
        this.resumeCatalog = resumeCatalog;
    }
    
    public Resume addResume(){
        Resume vs =new Resume();
        resumeCatalog.add(vs); 
        return vs;
    }
    
    public void deleteResume(Resume v)
    {
        resumeCatalog.remove(v);
    }
    public  boolean isNumeric(String str){ 
        Pattern pattern = Pattern.compile("[0-9]*"); 
        return pattern.matcher(str).matches();  
} 
    public boolean isFloat(String testString)
{
   if(!testString.contains("."))
   {
    return isNumeric(testString);
   }
   else
   {
    String[] floatStringPartArray=testString.split("\\.");
    if(floatStringPartArray.length==2)
    {
     if(isNumeric(floatStringPartArray[0])&&isNumeric(floatStringPartArray[0])){
         return true;
     }
     else return false;
    }
    else 
        return false;
    
   }
   }
}

