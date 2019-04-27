/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author yyneu
 */
import java.io.File;  
import javax.swing.filechooser.FileFilter;  

  

public class MyFileFilter extends FileFilter  
{  
    private String ext;  
    public MyFileFilter(String extString)  
    {  
        this.ext = extString;  
    }  
    
    public boolean accept(File f) {  
        if (f.isDirectory()) {  
            return true;  
        }  
        String extension = getExtension(f);  
        if (extension.toLowerCase().equals(this.ext.toLowerCase()))  
        {  
            return true;  
        }  
        return false;  
    }  
    public String getDescription() {  
        return this.ext.toUpperCase();  
    }  
    
    private String getExtension(File f) {  
        String name = f.getName();  
        int index = name.lastIndexOf('.');  
        if (index == -1)  
        {  
            return "";  
        }  
        else  
        {  
            return name.substring(index + 1).toLowerCase();  
        }  
    }  
}  