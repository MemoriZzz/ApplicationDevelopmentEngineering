package Business;

public class VitalSigns {
    
    private double temperature;
    private double bloodPressure;
    private int pulse;
    private String date;
    
    //getters and setters
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public double getBloodPressure() {
        return bloodPressure;
    }
    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    public int getPulse() {
        return pulse;
    }
    public void setPulse(int pulse) {
        this.pulse = pulse;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }   
    
    //date 栏出现的内容不是String形式，而是源代码，因此需要override
  
    @Override
    public String toString(){
        return this.date;
    }
   
}




