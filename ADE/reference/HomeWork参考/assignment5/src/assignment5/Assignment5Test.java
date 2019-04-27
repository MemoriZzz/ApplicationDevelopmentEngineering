/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author yyneu
 */
public class Assignment5Test {
    private int agePoint;
    private int hdlPoint;
    private int totalCholesterolPoint;
    private int smokePoint;
    private int systolicPoint;
    private int diabetesPoint;
    private int totalPoint;
    private String risk;
    private boolean smoke;
    private boolean treated; 
    private boolean diabetes;
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ParseException {
        // TODO code application logic here
         Assignment5Test a = new Assignment5Test();
         a.run();

    }
     public void run() throws IOException, ParseException{
       
      
        System.out.println("******************Welcome to the Framingham Heart Study*************************");
        System.out.println("*********Welcome to the CITY LEVEL ECOSYSTEM*************** ");
        System.out.println("*********Please enter the choice below for Reports*************** ");
       
        System.out.println("1.CITY LEVEL REPORTS");
        System.out.println("2.COMMUNITY LEVEL REPORTS");
        System.out.println("3.HOUSE LEVEL REPORTS");
        System.out.println("4.FAMILY LEVEL REPORTS");
        System.out.println("5.PERSON LEVEL REPORTS");
        System.out.println("6.PERSON YOURSELF LEVEL REPORT");
        // main panel
        
        
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a choice. Please enter a number for example just enter 1 for department level reports");
         // Scans the next token of the input as an int.
        
       
         Initiate ww=new Initiate();
         ArrayList<VitalSigns> vitalSignsList = ww.iniVitalSigns();
        
         City city = ww.iniAll();
         
         
         ArrayList<Person> iniParentList = ww.iniParentList(ww.iniName(),vitalSignsList);
         ArrayList<Person> iniChildrenList = ww.iniChildrenList(ww.iniName(),vitalSignsList);
         ArrayList<Person> iniGrandparentList = ww.iniGrandparentList(ww.iniName(),vitalSignsList);
         ArrayList<Person> iniPersonList = ww.iniPerson(iniParentList, iniChildrenList, iniGrandparentList);
         ArrayList<Person> personList = new ArrayList<Person>();
         for(Person p:iniPersonList){
             Point point = new Point();
             agePoint=point.agePoint(p.getAge(), p.getGender());
             hdlPoint=point.hdlPoint(p.getHdlCholesterol(), p.getGender());
             totalCholesterolPoint=point.totalCholesterolPoint(p.getTotalCholesterol(), p.getAge(), p.getGender());
             smokePoint=point.smokePoint(p.isSmoker(), p.getAge(), p.getGender());
             systolicPoint=point.systolicPoint(p.getSystolicBloodPressure(), p.isTreated(), p.getGender());
             diabetesPoint=point.diabetesPoint(p.isDiabetes(), p.getAge());
             totalPoint=point.totalPoint(agePoint, hdlPoint, totalCholesterolPoint, smokePoint, systolicPoint,diabetesPoint);
             risk=point.report(totalPoint);
             point.setAgePoint(agePoint);
             point.setHdlPoint(hdlPoint);
             point.setTotalCholesterolPoint(totalCholesterolPoint);
             point.setSmokePoint(smokePoint);
             point.setSystolicPoint(systolicPoint);
             point.setDiabetesPoint(diabetesPoint);
             point.setTotalPoint(totalPoint);
             point.setRisk(risk);//calculate different person's point
             p.setPoint(point);
             personList.add(p);
         }
        
         ArrayList<Family> familyList = ww.iniFamily(iniParentList, iniChildrenList, iniGrandparentList);
         ArrayList<House>  houseList = ww.iniHouse(familyList);
         ArrayList<Community> communityList = ww.iniCommunity(houseList);
         //initialize all object list
        
        int choice = reader.nextInt();
        switch (choice) {
          //choose selecetion  
         
            case 1: System.out.println("***************City LEVEL REPORTS STARTS******************");
                    System.out.println("Please choose your question.Please input 1-2");
                    System.out.println("1 How many people have high risk of getting a heart disease in this city?");
                    System.out.println("2 How many women have high risk of getting a heart disease compared to men?");
                    choice=reader.nextInt();
                   
              switch(choice){
                  case 1:
                  int communityMember1=0;
                      for(Person p:personList){
                             if(p.getPoint().getRisk().equals("high"))communityMember1++;
                                 }
//calculate high risk member in the city;
                  System.out.println("There are "+communityMember1+" people have high risk of getting a heart disease in this city");
                  System.out.println("***************City LEVEL REPORT ENDS******************");
                  break;
                  
                  case 2:
                   int communityMemberMale=0;
                   int communityMemberFemale=0;
                   int differ=0;
                    for(Person p:personList){
                              if(p.getGender().equals("male")&p.getPoint().getRisk().equals("high"))
                                communityMemberMale++;
                                else if(p.getGender().equals("female")&p.getPoint().getRisk().equals("high"))
                                 communityMemberFemale++;
                   }
                   if(communityMemberMale>communityMemberFemale)differ=communityMemberMale-communityMemberFemale;
                   else differ=communityMemberFemale-communityMemberMale;
                    //calculate the differ of men and women of high risk in the city.
                   System.out.println("There are "+communityMemberFemale+" who have high risk;And there are "+communityMemberMale+" male who have high risk.The differ is "+differ);
                   System.out.println("***************City LEVEL REPORT ENDS******************");
                   break;
           
                           }
           
            
            case 2: System.out.println("***************Community LEVEL REPORTS STARTS******************");
            System.out.println("Please choose your question.Please input 1-3");
            System.out.println("1 The percentage of people have high risk of getting a heart disease in each community?");
            System.out.println("2 How many women have high risk of getting a heart disease in different community?");
            System.out.println("3 What is average health status of each community");
                         choice=reader.nextInt();
                      
                  switch(choice){
                  case 1:
                          for(Community c:communityList)
                      {
                             int communityMember1=0;
                             int communityMemberAll=0;
                             for(House h:c.getHouseList())
                             for(Family f:h.getFamilyList())
                                 for(Person p:f.getPersonList()){
                                     communityMemberAll++;
                                    if(p.getPoint().getRisk().equals("high"))
                                    communityMember1++;
                                 }
                         double percentage=100*communityMember1/communityMemberAll;
                         //calculate high risk member percentage of each community.
                         System.out.println("This "+c.getCommunityId()+" community high risk percentage is: "+percentage+"%");
                         }
                         System.out.println("***************Community LEVEL REPORT ENDS******************");
                  break;
                  
                  case 2:
                  for(Community c:communityList)
                      {
                           int communityMember2=0;
                         for(House h:c.getHouseList())
                             for(Family f:h.getFamilyList())
                                 for(Person p:f.getPersonList()){
                                    if(p.getGender().equals("female")&p.getPoint().getRisk().equals("high"))
                                    communityMember2++;
                                 }
                         c.setMember(communityMember2);
                         }
                   //calculate different community's high risk female number
                  for(Community c:communityList){
                      System.out.println("This community has "+c.getMember()+" women who  have high risk of getting disease.");
                  }
                 
                  System.out.println("***************Community LEVEL REPORT ENDS******************");
                  break;
                  
                  case 3:
                  for(Community c:communityList)
                      {
                             int communityPoint3=0;
                             int communityMemeber3=0;
                         for(House h:c.getHouseList())
                             for(Family f:h.getFamilyList())
                                 for(Person p:f.getPersonList()){
                                    communityPoint3=communityPoint3+p.getPoint().getTotalPoint();
                                    communityMemeber3++;
                                 }
                             double averagePoint=communityPoint3/communityMemeber3;
                             c.setRisk(c.report((int)averagePoint));
                         }
                  //calculate the average point of each community,and get the risk status.
                         for(Community c:communityList)System.out.println("This "+c.getCommunityId()+" community status is "+c.getRisk());
                         System.out.println("***************Community LEVEL REPORT ENDS******************");
                  break;
                   }
                  
           
              case 3: System.out.println("***************House LEVEL REPORTS STARTS******************");
              System.out.println("Please choose your question.Please input 1-2");
              System.out.println("1 What is the largest health point in all house?");
              System.out.println("2 The average health rate of each house");
              System.out.println("3 How many men have low risk of getting a heart disease in each House?");
                         choice=reader.nextInt();
                         switch(choice){
                  case 1:
                  int highHousePoint=0;
                  for(House h:houseList){
                      int housePoint=0;
                      for(Family f:h.getFamilyList())
                          for(Person p:f.getPersonList()){
                              housePoint=housePoint+p.getPoint().getTotalPoint();
                          }
                      if(highHousePoint<housePoint)highHousePoint = housePoint;
                  }
                  //calculate whole points of each hosue,and compare each other toget the highest house point.
                  System.out.println("The largest one health point of all house is "+highHousePoint);
                         System.out.println("***************House LEVEL REPORT ENDS******************");
                  break;
                  
                  case 2:
                         for(House h:houseList){
                             int housePoint2=0;
                             int houseMemeber2=0;
                             for(Family f:h.getFamilyList())
                                 for(Person p:f.getPersonList()){
                                    housePoint2=housePoint2+p.getPoint().getTotalPoint();
                                    houseMemeber2++;
                                 }
                             double averagePoint=housePoint2/houseMemeber2;
                             h.setRisk(h.report((int)averagePoint));
                         }
                         //calculate average point of each house and report it risk.
                         for(House h:houseList)System.out.println("This "+h.getHouseId()+" house's average rate is "+h.getRisk());
                         System.out.println("***************House LEVEL REPORT ENDS******************");
                  break;
                  
                  case 3:
                  
                           
                         for(House h:houseList){
                             int houseMember3=0;
                             for(Family f:h.getFamilyList())
                                 for(Person p:f.getPersonList()){
                                    if(p.getGender().equals("male")&p.getPoint().getRisk().equals("low"))
                                    houseMember3++;
                                 }
                         h.setMember(houseMember3);
                         }
                         //calculate the male who has low risk member in each house
                  for(House h:houseList){
                      System.out.println("This "+h.getHouseId()+" house has "+h.getMember()+" men who  have low risk of getting disease.");
                  }
                  
                  System.out.println("***************Community LEVEL REPORT ENDS******************");
                  break;
                  //case 3: System.out.println("Show the rate of growth in the number of people who have risk of getting a heart disease in each house.");
                    //      rp.reportAll(houseList,"House");
                      //    System.out.println("***************House LEVEL REPORT ENDS******************");
                 // break;
                   }
                
             
              case 4:  System.out.println("***************Family LEVEL REPORTS STARTS******************");
              System.out.println("Please choose your question.Please input 1-2");
              System.out.println("1 How many familires' people both have low risk ?");
              System.out.println("2 How many families have at least one high risk member");
                          choice = reader.nextInt();
                          switch(choice){
                  case 1:
                         int familyNumber=0;
                         for(Family f:familyList){
                             int personI=0;
                            
                            for(Person p:f.getPersonList()){
                                if(p.getPoint().getRisk().equals("low"))
                                    personI++;
                            }
                            //calculate the low risk person number
                            if(personI==f.getPersonList().size())
                                familyNumber++;
                         }
                         //calculate the family number which has both low risk people
                         System.out.println("There are "+familyNumber+" familires both have low risk in "+familyList.size()+" families");
                         System.out.println("***************Family LEVEL REPORT ENDS******************");
                  break;
                  
                  case 2:
                  int familyNumber2=0;
                         for(Family f:familyList){
                
                            for(Person p:f.getPersonList()){
                                if(p.getPoint().getRisk().equals("high")){
                                 
                                   familyNumber2++;
                                   break;
                                }
                            }
                         }
                            //calculate the family mumber which has at least one high risk people.
                      System.out.println("There are "+familyNumber2+" familires have at least one high risk member in "+familyList.size()+" families.");
                         System.out.println("***************Family LEVEL REPORT ENDS******************");
                  break;
                  
                   }
               
             
              case 5: System.out.println("***************Person LEVEL REPORTS STARTS******************");
              System.out.println("Please choose your question.Please input 1-3");
              System.out.println("1 How many people above 30 years old have high risk of getting a heart disease?");
              System.out.println("2 The average health point of all people:");
              System.out.println("3 The must common health status of people:");
               choice = reader.nextInt();  
                 switch(choice){
                  case 1:
                  ArrayList<Person> personList51 = new ArrayList<Person>(); 
                         for(Person p:personList){
                             if(p.getAge()>30&p.getPoint().getRisk().equals("high")) personList51.add(p);
                         }
                         //calculate the people who above 30 years old and have high risk
                         System.out.println("There are "+personList51.size()+" people above 30 years old have high risk.");
                         System.out.println("***************Person LEVEL REPORT ENDS******************");
                  break;
                  
                  case 2:
                    
                    int allHealthPoint=0;
                    double averageHealthPoint=0.0;
                    for(Person p:personList){
                            allHealthPoint=allHealthPoint+p.getPoint().getTotalPoint();
                         }
                    averageHealthPoint=allHealthPoint/personList.size();
              //add all people point and then get the average point of all people
                    System.out.println("The average health point of all is "+averageHealthPoint);
                    
                         System.out.println("***************Person LEVEL REPORT ENDS******************");
                  break;
                  
                  case 3: 
                        int veryHealth=0;
                        int low=0;
                        int medium=0;
                        int high=0;
                        for(Person p:personList){
                            if(p.getPoint().getRisk().equals("very health"))veryHealth++;
                            else if(p.getPoint().getRisk().equals("low"))low++;
                            else if(p.getPoint().getRisk().equals("medium"))medium++;
                            else if(p.getPoint().getRisk().equals("high"))high++; 
                        }
                        //calculate each status people member
                        int[] num = new int[4];
                        num[0]=veryHealth;
                        num[1]=low;
                        num[2]=medium;
                        num[3]=high;
                         HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
                         hashMap.put(veryHealth, "very Health");
                         hashMap.put(low, "low");
                         hashMap.put(medium, "medium");
                         hashMap.put(high, "high");
                         //assign key to each status
                        int z=0;
                        for(int i=0;i<4;i++)
                            for(int j=0;j<3-i;j++){
                                if(num[j]>num[j+1])
                                   z=num[j+1];
                                num[j+1]=num[j];
                                num[j]=z;
                            }
                        //bubble sort the different status member
                        System.out.println("The most common health status is "+hashMap.get(num[3]));
                          System.out.println("***************Person LEVEL REPORT ENDS******************");
                  break;
                   }
              
              
              case 6: System.out.println("***************Enter your informtaion as patient******************");
                            Person a = new Person();
                            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                            //Scanner sc = new Scanner(System.in);
                            System.out.println("Your gender:male/female");
                            String strGender = in.readLine();
                            System.out.println("Your age:");
                            String strAge = in.readLine();
                            System.out.println("Smoking? Y/N:");
                            String strSmoke = in.readLine();
                            if(strSmoke.equals('y')||strSmoke.equals("Y"))
                            smoke=true; 
                            else smoke=false;
                            System.out.println("HdlCholesterol:");
                            String strHdlCholesterol = in.readLine();
                            System.out.println("TotalCholesterol:");
                            String strTotalCholesterol = in.readLine();
                            System.out.println("SystolicBloodPressure:");
                            String strSystolicBloodPressure = in.readLine();
                            System.out.println("Treated? Y/N:");
                            String strTreated = in.readLine();
                            if(strTreated.equals('y')||strTreated.equals("Y"))
                            treated=true; 
                            else treated=false;
                            System.out.println("Diabetes? Y/N:");
                            String strDiabetes = in.readLine();
                            if(strDiabetes.equals('y')||strTreated.equals("Y"))
                            diabetes=true; 
                            else diabetes=false;
                            //get the user input
                            
                            a.setGender(strGender);
                            a.setAge(Integer.parseInt(strAge));
                            a.setSmoker(smoke);
                            a.setHdlCholesterol(Double.parseDouble(strHdlCholesterol));
                            a.setTotalCholesterol(Double.parseDouble(strTotalCholesterol));
                            a.setSystolicBloodPressure(Integer.parseInt(strSystolicBloodPressure));
                            a.setTreated(treated);
                            a.setDiabetes(diabetes);
                            Point point=new Point();
                            agePoint=point.agePoint(a.getAge(),a.getGender());
                            hdlPoint=point.hdlPoint(a.getHdlCholesterol(), a.getGender());
                            totalCholesterolPoint=point.totalCholesterolPoint(a.getTotalCholesterol(),a.getAge(),a.getGender());
                            smokePoint=point.smokePoint(a.isSmoker(), a.getAge(), a.getGender());
                            systolicPoint=point.systolicPoint(a.getSystolicBloodPressure(), a.isTreated(), a.getGender());
                            diabetesPoint=point.diabetesPoint(a.isDiabetes(),a.getAge());
                            totalPoint=point.totalPoint(agePoint, hdlPoint, totalCholesterolPoint, smokePoint, systolicPoint,diabetesPoint);
                            risk=point.report(totalPoint);
                            //calculat the point according to the user input and get the risk report
                            System.out.println("Your risk point is "+totalPoint);
                            System.out.println("Your risk status is "+ risk);
                            System.out.println("***************Enter your informtaion as patient******************");   
        }
         
     }
    
}
