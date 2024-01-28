package com.jap.course3;

public class ElectricEngine extends Engine {
    private int engine_voltage;
    ElectricEngine(){
        this(0,0,0,0,0);
    }
    ElectricEngine(int distance,int power,int rpm,int count,int voltage){
        super(distance,power,rpm,count);
        engine_voltage=voltage;
    }
    public void setVoltage(int voltage) {
        engine_voltage=voltage;
    }
    public int getVoltage() {
        return engine_voltage;
    }
    public int getelectricConsumption() {
        return super.getDisplacement()*engine_voltage;
    }
    public String toString() {
        return super.toString()+"\n"+"Voltage :"+getVoltage();
    }
}


