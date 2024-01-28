package com.jap.course3;


public class PetrolEngine extends Engine {
    private int capacity;
    PetrolEngine(){
        this(0,0,0,0,0);
    }
    PetrolEngine(int distance,int power,int rpm,int count,int litre_capacity){
        super(distance,power,rpm,count);
        capacity=litre_capacity;
    }
    public void setCapacity(int cap) {
        capacity=cap;
    }
    public int getCapacity() {
        return capacity;
    }
    public void burn() {
        System.out.println("Fuel started burn");
    }
    public String toString() {
        return super.toString()+"\n"+"Capacity : "+getCapacity();
    }
}

