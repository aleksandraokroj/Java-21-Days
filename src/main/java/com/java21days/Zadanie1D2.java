package com.java21days; 

public class Zadanie1D2 {
    public static void main (String[] arguments){
      float kwota = 14000;
      System.out.println("Inwestycha początkowa to "+kwota+"zł");
      kwota = kwota +( kwota * .4F);
      System.out.println("Inwestycja po pierwszym roku to "+kwota+"zł");
      kwota -= 1500F;
      System.out.println("Inwstycha po dwóch latach to "+kwota+"zł");
      kwota = kwota + (kwota * .12F);
      System.out.println("Inwestycja po trzech latach byłaby warta "+kwota + "zł");
      
     
      
      
      
      
}
}