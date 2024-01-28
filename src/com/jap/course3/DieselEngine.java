package com.jap.course3;

public class DieselEngine extends Engine {
    int coalkg;
    int dieselpower;
    DieselEngine(){
        this(0,0,0,0,0);
    }
    DieselEngine(int distance,int power,int rpm,int count,int coal){
        super(distance,power,rpm,count);
        coalkg=coal;
        dieselpower=super.getMaxpower()*10;
    }
    public void setCoal(int coal) {
        coalkg=coal;
    }
    public int getCoal() {
        return coalkg;
    }
    public void setPowerOfEngine() {
        dieselpower=super.getMaxpower()*10;
    }
    public String toString() {
        return super.toString()+"\n"+"Coal used : "+getCoal()+"\n"+"Diesel power : "+dieselpower;
    }
}
