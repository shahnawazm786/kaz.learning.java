package Practical;

import Algebra.Cube;
import Algebra.Rectangle;

public class Demo {
    public static void main(String[] args){
        Rectangle rec=new Rectangle(20,30);
        System.out.println(rec.Area());
        Cube c=new Cube(20,30,40);
        System.out.println(c.Volume());
    }
}
