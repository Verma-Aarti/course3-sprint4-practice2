package com.jap.course3;

public class CNG extends Engine {
    private String gasquality;
    private int gasquantity;
    private double pollution_factor;
    CNG(){
        this(0,0,0,0,0);
    }
    CNG(int distance,int power,int rpm,int count,int quantity){
        super(distance,power,rpm,count);
//        gasquality=quality;
        setQuality();
        setPollutionFactor();
        gasquality=getQuality();
        pollution_factor=getPollutionFactor();
        gasquantity=quantity;
    }
    public void setQuality() {
        if(gasquantity>100) {
            gasquality="Good";
        }
        else {
            gasquality="Bad";
        }
    }
    public String getQuality() {
        return gasquality;
    }
    public void setPollutionFactor() {
        if(gasquality.equalsIgnoreCase("good")) {
            pollution_factor=8.34;
        }
        else {
            pollution_factor=4.23;
        }
    }
    public double getPollutionFactor() {
        return pollution_factor;
    }
    public double  getareaPolluted() {
        return super.getDisplacement()*getPollutionFactor();
    }
    public int getquantity() {
        return gasquantity;
    }
    public String toString() {
        return super.toString()+"\n"+"Gas Quantity : "+getquantity()+"\n"+"Gas Quality : "+getQuality()+"\n"+"Pollution Factor : "+
                getPollutionFactor()+"\n"+"Area Polluted : "+getareaPolluted();
    }
}

