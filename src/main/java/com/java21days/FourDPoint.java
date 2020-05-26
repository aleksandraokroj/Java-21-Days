package com.java21days;
import java.awt.Point;

class FourDPoint extends Point{
    int z;
    int a;
    FourDPoint (int x, int y, int z, int a){
        super(x,y);
        this.z = z;
        this.a = a;
    } 
    
    public static void main (String[] arguments){
        FourDPoint point = new FourDPoint(5,5,12,13);
        System.out.println("Punkt to: ( " +point.x+", "+point.y+", "+point.z+", "+point.a+")");
    }
}