package com.jap.course3;

import java.util.Random;
public class Engine {
    private long modelno;
    private int displacement;
    private int maxPower;
    private int maxRPM;
    private int count_of_cylinders;
    private static Random rand;
    static {
        rand=new Random();
    }

    Engine(){
        this(0,0,0,0);
    }
    Engine(int distance,int power,int rpm,int count){
        modelno=Math.abs(rand.nextLong());
        displacement=distance;
        maxPower=power;
        maxRPM=rpm;
        count_of_cylinders=count;
    }

    public void setDisplacement(int distance) {
        displacement=distance;
    }
    public void setMaxpower(int power) {
        maxPower=power;
    }
    public void setMaxrpm(int rpm) {
        maxRPM=rpm;
    }
    public void setcount(int count) {
        count_of_cylinders=count;
    }
    public int getDisplacement() {
        return displacement;
    }
    public int getMaxpower() {
        return maxPower;
    }
    public int getMaxrpm() {
        return maxRPM;
    }
    public int getCount() {
        return count_of_cylinders;
    }
    public long getModelno() {
        return modelno;
    }
    public void start() {
        System.out.println("Engine started");
    }
    public void stop() {
        System.out.println("Engine stopped");
    }

    public String toString() {
        return "Model No : "+getModelno()+"\n"+"Displacement : "+getDisplacement()+"\n"+"Max Power : "+getMaxpower()
                +"\n"+"Maximum RPM : "+getMaxrpm()+"\n"+"Cylinders Count : "+getCount();
    }

}

