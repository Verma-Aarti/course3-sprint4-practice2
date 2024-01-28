package com.jap.course3;

public class EngineImpl {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        PetrolEngine p=new PetrolEngine(23,450,34,4,46);
        System.out.println(p.toString());
        System.out.println("***************************");
        DieselEngine d=new DieselEngine(34,467,20,6,50);
        System.out.println(d.toString());
        System.out.println("****************************");
        CNG c=new CNG(45,600,30,8,40);
        System.out.println(c.toString());
        System.out.println("****************************");
        ElectricEngine e=new ElectricEngine(78,1000,50,15,400);
        System.out.println(e.toString());
    }

}

