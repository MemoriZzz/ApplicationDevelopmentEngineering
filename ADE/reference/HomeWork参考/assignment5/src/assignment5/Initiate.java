package assignment5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Initiate {
	
	public ArrayList<String> iniName(){
		ArrayList<String> firstName=new ArrayList<String>();
		ArrayList<String> middleName=new ArrayList<String>();
		ArrayList<String> lastName=new ArrayList<String>();
		ArrayList<String> name=new ArrayList<String>();
		
		firstName.add("Jack");
		firstName.add("Rose");
		firstName.add("Evan");
		firstName.add("Max");
		firstName.add("John");
		firstName.add("Allen");
		firstName.add("Mary");
		firstName.add("Alex");
		firstName.add("Hana");
		firstName.add("Lisa");
		
		middleName.add(" .A. ");
		middleName.add(" .B. ");
		middleName.add(" .C. ");
		middleName.add(" .R. ");
		middleName.add(" .J. ");
		middleName.add(" .C. ");
		middleName.add(" .M. ");
		middleName.add(" .I. ");
		middleName.add(" .V. ");
		middleName.add(" .C. ");
		
		lastName.add("Black");
		lastName.add("Smith");
		lastName.add("Stuart");
		lastName.add("Williams");
		lastName.add("King");
		lastName.add("Bush");
		lastName.add("Brown");
		lastName.add("Robinson");
		lastName.add("Prior");
		lastName.add("Rice");

		for (String s:firstName) {
			for (String d:middleName) {
				for (String f:lastName) {
					String nameF=s+d+f;
					name.add(nameF);
				}
			}
		}
		
		
		return name;
		
	}
        
        public ArrayList<VitalSigns> iniVitalSigns() throws ParseException{
         ArrayList<VitalSigns> vitalSignsList=new ArrayList<VitalSigns>();
         String vitalSignsID;
         String date;
         
         for(int i=0;i<9000;i++){
             VitalSigns vitalSigns = new VitalSigns();
             vitalSignsID=String.valueOf(i+1);
             Random rand = new Random();
             int hb = rand.nextInt(70)+60;
              int systolicBloodPressure=rand.nextInt(100)+90;
              double a=11;
			
			while(a<=3.6||a>=10.3){
				a=(rand.nextInt(10)+3)+rand.nextDouble();
			}
			//hDLCholesterol=30% of totalCholesterol,1~3
			double b=11;
			while(b<=1.08||b>=3.09){
				
				b=(rand.nextInt(10)-7)+rand.nextDouble();
			}
             
              
              String sb1 = "2016";
              String sb2 = "10";
              String sb3 = String.valueOf(rand.nextInt(30)+1);
              String sb4;
              int randHour = rand.nextInt(24)+1;
             
              if(randHour>=10)
              {
                  sb4 = String.valueOf(randHour);
              }
              else{
                  sb4 = String.valueOf("0"+randHour);
              }
             
              String sb = sb3+"-"+sb2+"-"+sb1+"-"+sb4+"00";
              date = sb;
              SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-hhmm");
              Date d=sdf.parse(date);
              String tsp=sdf.format(d);  
              vitalSigns.setTimestamp(tsp);
              vitalSigns.setHeartbeat(hb);
              vitalSigns.setTotalCholesterol(a);
              vitalSigns.setHdlCholesterol(b);
              vitalSigns.setSystolicBloodPressure(systolicBloodPressure);
              vitalSigns.setVitalSignsID(vitalSignsID);
              vitalSignsList.add(vitalSigns);
         }
        
              return vitalSignsList;
         
     }
        
        
        
        public ArrayList<Person> iniParentList(ArrayList<String> name,ArrayList<VitalSigns> vitalSignsList){
            ArrayList<Person> parentList=new ArrayList<Person>();
		String personalID;
		for(int i=0;i<1000;i++){
			Person person=new Person();
			
			Random r=new Random(); 
			//id
                        personalID=String.valueOf(i+1);
			//String personalID="";
			//for(int j=0;j<4;j++){
			//	String d=String.valueOf(r.nextInt(10));
			//	personalID=personalID+d;
			//}
			//name
			int numName=r.nextInt(1000);
			String pName=name.get(numName);
			//age
			int k=20+r.nextInt(45);
		
			//totalCholesterol
			
			//smoker,diabetes,diabetes
			boolean smoker=false;
			if(r.nextInt(10)%2==0){
				smoker=true;
			}
			boolean diabetes=false;
			if(r.nextInt(10)%2==0){
				diabetes=true;
			}
			boolean treated=false;
			if(r.nextInt(10)%2==0){
				treated=true;
			}
                        String gender="male";
                        if(r.nextInt(10)%2==0){
				gender="female";
			}
			//systolicBloodPressure
			
			//
			person.setPersonalID(personalID);
			person.setName(pName);
			person.setAge(k);
                        person.setGender(gender);
			
			person.setSmoker(smoker);
			person.setDiabetes(diabetes);
			
			person.setTreated(treated);
                        person.doLabel();
                      
                        ArrayList<VitalSigns> jianzhile =new ArrayList<VitalSigns>();
                        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			jianzhile.add(vitalSignsList.get((i+1)*5-5));
			jianzhile.add(vitalSignsList.get((i+1)*5-4));
			jianzhile.add(vitalSignsList.get((i+1)*5-3));
			jianzhile.add(vitalSignsList.get((i+1)*5-2));
			jianzhile.add(vitalSignsList.get((i+1)*5-1));
                        sortSigns(jianzhile);
			for(int q=0;q<5;q++){
				person.getVitalSignsList().add(jianzhile.get(q));
			}
                        double a=0.0;
                        double b=0.0;
                        int systolicBloodPressure=0;
                        for(VitalSigns v:person.getVitalSignsList()){
                            a=a+v.getTotalCholesterol();
                            b=b+v.getHdlCholesterol();
                            systolicBloodPressure=systolicBloodPressure+v.getSystolicBloodPressure();
                        }
                        a=a/person.getVitalSignsList().size();
                        b=b/person.getVitalSignsList().size();
                        systolicBloodPressure=(int)(systolicBloodPressure/person.getVitalSignsList().size());
			person.setTotalCholesterol(a);
			person.setHdlCholesterol(b);
                        person.setSystolicBloodPressure(systolicBloodPressure);
			parentList.add(person);
                }
                return parentList;
        }
        public ArrayList<Person> iniChildrenList(ArrayList<String> name,ArrayList<VitalSigns> vitalSignsList){
            String personalID;
            ArrayList<Person> childrenList=new ArrayList<Person>();
              for(int i=1000;i<1400;i++){
			Person person=new Person();
			Random r=new Random(); 
			//id
                        personalID=String.valueOf(i+1);
			//String personalID="";
			//for(int j=0;j<4;j++){
			//	String d=String.valueOf(r.nextInt(10));
			//	personalID=personalID+d;
			//}
			//name---!!! name is allowed to be the same
			int numName=r.nextInt(1000);
			String pName=name.get(numName);
			//age
			int k=r.nextInt(20);
			//totalCholesterol
			
			//smoker,diabetes,diabetes
			boolean smoker=false;
			if(r.nextInt(10)%2==0){
				smoker=true;
			}
			boolean diabetes=false;
			if(r.nextInt(10)%2==0){
				diabetes=true;
			}
			boolean treated=false;
			if(r.nextInt(10)%2==0){
				treated=true;
			}
                        String gender="male";
                        if(r.nextInt(10)%2==0){
				gender="female";
			}
			//systolicBloodPressure
		
			//
			person.setPersonalID(personalID);
			person.setName(pName);
			person.setAge(k);
                        person.setGender(gender);
		
			person.setSmoker(smoker);
			person.setDiabetes(diabetes);
			
			person.setTreated(treated);
			person.doLabel();
                        
                        ArrayList<VitalSigns> jianzhile =new ArrayList<VitalSigns>();
			
			jianzhile.add(vitalSignsList.get((i+1)*5-5));
			jianzhile.add(vitalSignsList.get((i+1)*5-4));
			jianzhile.add(vitalSignsList.get((i+1)*5-3));
			jianzhile.add(vitalSignsList.get((i+1)*5-2));
			jianzhile.add(vitalSignsList.get((i+1)*5-1));
			
			sortSigns(jianzhile);
			for(int q=0;q<5;q++){
				person.getVitalSignsList().add(jianzhile.get(q));
			}
                        
                        double a=0.0;
                        double b=0.0;
                        int systolicBloodPressure=0;
                        for(VitalSigns v:person.getVitalSignsList()){
                            a=a+v.getTotalCholesterol();
                            b=b+v.getHdlCholesterol();
                            systolicBloodPressure=systolicBloodPressure+v.getSystolicBloodPressure();
                        }
                        a=a/person.getVitalSignsList().size();
                        b=b/person.getVitalSignsList().size();
                        systolicBloodPressure=(int)(systolicBloodPressure/person.getVitalSignsList().size());
			person.setTotalCholesterol(a);
			person.setHdlCholesterol(b);
                        person.setSystolicBloodPressure(systolicBloodPressure);
			childrenList.add(person);
		
		}
              return childrenList;
        }
        public ArrayList<Person> iniGrandparentList(ArrayList<String> name,ArrayList<VitalSigns> vitalSignsList){
            String personalID;
            ArrayList<Person> grandparentList=new ArrayList<Person>();
            for(int i=1400;i<1800;i++){
			Person person=new Person();
			Random r=new Random(); 
			//id
                        personalID=String.valueOf(i+1);
			
			//name---!!! name is allowed to be the same
			int numName=r.nextInt(1000);
			String pName=name.get(numName);
			//age
			int k=65+r.nextInt(35);
			//totalCholesterol
			
			//smoker,diabetes,diabetes
			boolean smoker=false;
			if(r.nextInt(10)%2==0){
				smoker=true;
			}
			boolean diabetes=false;
			if(r.nextInt(10)%2==0){
				diabetes=true;
			}
			boolean treated=false;
			if(r.nextInt(10)%2==0){
				treated=true;
			}
                        String gender="male";
                        if(r.nextInt(10)%2==0){
				gender="female";
			}
			//systolicBloodPressure
			
			person.setPersonalID(personalID);
			person.setName(pName);
			person.setAge(k);
                        person.setGender(gender);
		
			person.setSmoker(smoker);
			person.setDiabetes(diabetes);
			
			person.setTreated(treated);
			person.doLabel();
                       
                        ArrayList<VitalSigns> jianzhile =new ArrayList<VitalSigns>();
			
			jianzhile.add(vitalSignsList.get((i+1)*5-5));
			jianzhile.add(vitalSignsList.get((i+1)*5-4));
			jianzhile.add(vitalSignsList.get((i+1)*5-3));
			jianzhile.add(vitalSignsList.get((i+1)*5-2));
			jianzhile.add(vitalSignsList.get((i+1)*5-1));
			
			sortSigns(jianzhile);
			for(int q=0;q<5;q++){
				person.getVitalSignsList().add(jianzhile.get(q));
			}
                        
                        double a=0.0;
                        double b=0.0;
                        int systolicBloodPressure=0;
                        for(VitalSigns v:person.getVitalSignsList()){
                            a=a+v.getTotalCholesterol();
                            b=b+v.getHdlCholesterol();
                            systolicBloodPressure=systolicBloodPressure+v.getSystolicBloodPressure();
                        }
                        a=a/person.getVitalSignsList().size();
                        b=b/person.getVitalSignsList().size();
                        systolicBloodPressure=(int)(systolicBloodPressure/person.getVitalSignsList().size());
			person.setTotalCholesterol(a);
			person.setHdlCholesterol(b);
                        person.setSystolicBloodPressure(systolicBloodPressure);
			grandparentList.add(person);
		
		}
            return grandparentList;
        }
	public ArrayList<Person> iniPerson(ArrayList<Person> parentList,ArrayList<Person> childrenList,ArrayList<Person> grandparentList){
		ArrayList<Person> personList=new ArrayList<Person>();
		for(Person p:parentList)personList.add(p);
                for(Person p:childrenList)personList.add(p);
                for(Person p:grandparentList)personList.add(p);
		return personList;
	}
	
	
	
	
	
	
	public ArrayList<Family> iniFamily(ArrayList<Person> parentList,ArrayList<Person> childrenList,ArrayList<Person> grandparentList){
		ArrayList<Family> familyList=new ArrayList<Family>();
		
		for (int i = 0; i < 500; i++) {
				Family family=new Family();
                                Random rr=new Random(); 
                                int size;
                                size=rr.nextInt(3)+2;
                                family.setFamilySize(size);
                                
                                
				family.getPersonList().add(parentList.get(2*i));
				family.getPersonList().add(parentList.get(2*i+1));
                                //System.out.println("family id   "+size);
                                for(int j=0;j<size-2;j++){
                                    int kind=rr.nextInt(2);
                                    if(kind==0){
                                        int index=rr.nextInt(childrenList.size());
                                        family.getPersonList().add(childrenList.get(index));
                                        //System.out.println(childrenList.get(index).getName()+" child");
                                        childrenList.remove(index);
                                    }else{
                                        int index=rr.nextInt(grandparentList.size());
                                        family.getPersonList().add(grandparentList.get(index));
                                        //System.out.println(grandparentList.get(index).getName()+" old");
                                        grandparentList.remove(index);
                                    }
                                }

                               
                                family.setFamilyId(String.valueOf(i));
				familyList.add(family);
                                //System.out.println("done  ");

		}
		return familyList;
	}
	public ArrayList<House> iniHouse(ArrayList<Family> familyList){
		ArrayList<House> houseList=new ArrayList<House>();
		for (int i = 0; i <125 ; i++) {
				House house=new House();
				house.getFamilyList().add(familyList.get(2*i));
				house.getFamilyList().add(familyList.get(2*i+1));
				house.setHouseId(String.valueOf(i));
				houseList.add(house);
                                
			
		}
		return houseList;
		
	}
	public ArrayList<Community> iniCommunity(ArrayList<House> houseList){
		ArrayList<Community> communityList=new ArrayList<Community>();
		for (int i = 1; i < 6; i++) {
				Community community=new Community();
				community.getHouseList().add(houseList.get(5*i-4));
				community.getHouseList().add(houseList.get(5*i-3));
				community.getHouseList().add(houseList.get(5*i-2));
				community.getHouseList().add(houseList.get(5*i-1));
				community.getHouseList().add(houseList.get(5*i));
                                community.setCommunityId(String.valueOf(i));
                               
				communityList.add(community);
		}
		return communityList;
	}
	
	public City iniAll() throws ParseException{
		ArrayList<Community> communityList =this.iniCommunity(this.iniHouse(this.iniFamily(this.iniParentList(this.iniName(),this.iniVitalSigns()),this.iniChildrenList(this.iniName(),this.iniVitalSigns()),this.iniGrandparentList(this.iniName(),this.iniVitalSigns()))));
		City city=new City();
		for(Community c:communityList){
			city.getCommunityList().add(c);
		}
		return city;
		
	}
        //input an ArrayList then output an sorted ArrayList(day&hours)
	
	public ArrayList<VitalSigns> sortSigns(ArrayList<VitalSigns> jianzhile){
		//sort days first
		String ha=jianzhile.get(0).getTimestamp();
		String hb=jianzhile.get(1).getTimestamp();
		String hc=jianzhile.get(2).getTimestamp();
		String hd=jianzhile.get(3).getTimestamp();
		String he=jianzhile.get(4).getTimestamp();
		
		//receive dates
		String nimei[]={ha,hb,hc,hd,he};
		//get days
		String temp1[]=ha.split("-");
		int aa=Integer.parseInt((temp1[0]));
		String temp2[]=hb.split("-");
		int ab=Integer.parseInt((temp2[0]));
		String temp3[]=hc.split("-");
		int ac=Integer.parseInt((temp3[0]));			
		String temp4[]=hd.split("-");
		int ad=Integer.parseInt((temp4[0]));			
		String temp5[]=he.split("-");
		int ae=Integer.parseInt((temp5[0]));
		
		int nidaye[]={aa,ab,ac,ad,ae};
		//bubble sorting
		for(int x=0;x<nidaye.length;x++){
			for(int y=0;y<nidaye.length-1-x;y++){
				if(nidaye[y]<nidaye[y+1]){
					int madan=nidaye[y];
					nidaye[y]=nidaye[y+1];
					nidaye[y+1]=madan;
					
//					String nainaide=nimei[y];
//					nimei[y]=nimei[y+1];
//					nimei[y+1]=nainaide;
					
					//jianzhile.list changes according to the number array
					
					
					VitalSigns wocao=jianzhile.get(y);
					VitalSigns wori=jianzhile.get(y+1);
					jianzhile.set(y, wori);
					jianzhile.set(y+1, wocao);
				   }
			}
		}
		
		//sorts hours
		String h1=jianzhile.get(0).getTimestamp();
		String h2=jianzhile.get(1).getTimestamp();
		String h3=jianzhile.get(2).getTimestamp();
		String h4=jianzhile.get(3).getTimestamp();
		String h5=jianzhile.get(4).getTimestamp();
		
		
		String nimei1[]={h1,h2,h3,h4,h5};
		int aaa=Integer.parseInt(h1.substring(h1.length()-5,h1.length()-3)+h1.substring(h1.length()-2));
		int abb=Integer.parseInt(h2.substring(h2.length()-5,h2.length()-3)+h2.substring(h2.length()-2));
		int acc=Integer.parseInt(h3.substring(h1.length()-5,h1.length()-3)+h3.substring(h1.length()-2));
		int add=Integer.parseInt(h4.substring(h1.length()-5,h1.length()-3)+h4.substring(h1.length()-2));
		int aee=Integer.parseInt(h5.substring(h1.length()-5,h1.length()-3)+h5.substring(h1.length()-2));
		int nidaye1[]={aaa,abb,acc,add,aee};
		//******************************************************************************
		for(int x=0;x<nidaye1.length;x++){
			for(int y=0;y<nidaye1.length-1-x;y++){
				if(nidaye[y]==nidaye[y+1]){
					//happen only when the day is same
					if(nidaye1[y]<nidaye1[y+1]){
					int madan=nidaye1[y];
					nidaye1[y]=nidaye1[y+1];
					nidaye1[y+1]=madan;
					
//					String nainaide=nimei[y];
//					nimei[y]=nimei[y+1];
//					nimei[y+1]=nainaide;
					
					VitalSigns wocao=jianzhile.get(y);
					VitalSigns wori=jianzhile.get(y+1);
					jianzhile.set(y, wori);
					jianzhile.set(y+1, wocao);
				   }
				}
				
			}
		}
		//for (int i = 0; i < nidaye1.length; i++) {
		//	System.out.println(jianzhile.get(i).getTimestamp());
		//}
		//System.out.println("**********************************************");
		return jianzhile;
	}
}
