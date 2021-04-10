package Practical;

import Algebra.EnapsulationExample;

public class Demo1 {
    public static void main(String[] args){
        EnapsulationExample enapsulationExample=new EnapsulationExample();
        System.out.println(enapsulationExample.getHeight());
        System.out.println(enapsulationExample.getWidth());
        System.out.println(enapsulationExample.Area());
        System.out.println(enapsulationExample.Premeter());
        EnapsulationExample enapsulationExample1=new EnapsulationExample(100,200);
        System.out.println(enapsulationExample1.getHeight());
        System.out.println(enapsulationExample1.getWidth());
        System.out.println(enapsulationExample1.Area());
        System.out.println(enapsulationExample1.Premeter());
    }
}
