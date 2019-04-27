/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CAC
 */
public class IniAll {
    
    public ArrayList loadCourseLoad(ArrayList<Course>Courselist,String path){
        ArrayList<CourseLoad> CourseLoadList=new ArrayList<CourseLoad>();
        
        try {
               // read file content from file
               StringBuffer sb= new StringBuffer("");

               FileReader reader = new FileReader("courseLoad.txt");
               BufferedReader br = new BufferedReader(reader);
               String str = null;
               
               int i=-1;

               while((str = br.readLine()) != null) {
                   i++;
                   String arr[]=str.split(",");
                   CourseLoad cl=new CourseLoad();
                   cl.setCourseLoadId(arr[i]);
                   cl.getGrade().put(arr[i+1],Courselist.get(i) );
                  // cl.setSeatAssignment(arr[i+2]);
                   CourseLoadList.add(cl);
               }
                br.close();
                reader.close();
         }
         catch(FileNotFoundException e) {
                     e.printStackTrace();
                   } catch (IOException ex) {         
            Logger.getLogger(IniAll.class.getName()).log(Level.SEVERE, null, ex);
        }
         return CourseLoadList;
    }
    
    
    
    public ArrayList loadTranscript(ArrayList<CourseLoad>CourseLoadList,String path){
        ArrayList<Transcript> transcriptList=new ArrayList<Transcript>();
        try {
               // read file content from file
               StringBuffer sb= new StringBuffer("");

               FileReader reader = new FileReader("Transcript.txt");
               BufferedReader br = new BufferedReader(reader);
               String str = null;
               
               int i=-1;

               while((str = br.readLine()) != null) {
                   i++;
                   String arr[]=str.split(",");
                   Transcript ts=new Transcript();
                   ts.getCourseLoadList().put(arr[i], CourseLoadList.get(i));
                   
                   transcriptList.add(ts);
               }
                br.close();
                reader.close();
         }
         catch(FileNotFoundException e) {
                     e.printStackTrace();
                   } catch (IOException ex) {         
            Logger.getLogger(IniAll.class.getName()).log(Level.SEVERE, null, ex);
        }
         return transcriptList;
    }
    public ArrayList loadStudent(ArrayList<Transcript>transcriptList,String path){
        ArrayList<Student> StudentList=new ArrayList<Student>();
        try {
               // read file content from file
               StringBuffer sb= new StringBuffer("");

               FileReader reader = new FileReader("Student.txt");
               BufferedReader br = new BufferedReader(reader);
               String str = null;
               
               int i=-1;

               while((str = br.readLine()) != null) {
                   i++;
                   String arr[]=str.split(",");
                   Student su=new Student();
                   su.setName(arr[i]);
                   su.setStatus(arr[i+1]);
                   su.setEmployment(arr[i+2]);
                   su.setTranscript(transcriptList.get(i));         
                   StudentList.add(su);
               }
                br.close();
                reader.close();
         }
         catch(FileNotFoundException e) {
                     e.printStackTrace();
                   } catch (IOException ex) {         
            Logger.getLogger(IniAll.class.getName()).log(Level.SEVERE, null, ex);
        }
         return StudentList;
    }
    
    public ArrayList loadStudentAcconut(ArrayList<Student>StudentList,String path){
        ArrayList<StudentAccount> studentAcconutList=new ArrayList<StudentAccount>();
        try {
               // read file content from file
               StringBuffer sb= new StringBuffer("");

               FileReader reader = new FileReader("C:\\Users\\CAC\\Desktop\\StudentAccount.txt");
               BufferedReader br = new BufferedReader(reader);
               String str = null;
               
               int i=-1;

               while((str = br.readLine()) != null) {
                   i++;
                   String arr[]=str.split(",");
                   StudentAccount sa=new StudentAccount();
                   
                   sa.setStudentId(Integer.valueOf(arr[i]));
                   sa.setUserName(arr[i+1]);
                   sa.setStudent(StudentList.get(i));
                   sa.setCreditOwned(Integer.valueOf(arr[i+2]));
                   sa.setDollarAmount(Integer.valueOf(arr[i+3]));
                   sa.setStatus(arr[i+4]);
                   
                   studentAcconutList.add(sa);
               }
                br.close();
                reader.close();
         }
         catch(FileNotFoundException e) {
                     e.printStackTrace();
                   } catch (IOException ex) {         
            Logger.getLogger(IniAll.class.getName()).log(Level.SEVERE, null, ex);
        }
         return StudentList;
    
    }
  }

