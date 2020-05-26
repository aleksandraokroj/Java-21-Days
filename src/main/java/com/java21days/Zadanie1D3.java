package com.java21days;
import java.util.StringTokenizer;

class Zadanie1D3 {
    public static void main (String[] arguments){
        StringTokenizer st1;
        
        String data = "25/01/2000";
        
        st1 = new StringTokenizer (data, "/");
        System.out.println("Dzień moich urodzin to: " + st1.nextToken());
        System.out.println("Miesiąc moich urodzin to: " + st1.nextToken());
        System.out.println("Rok moich urodzin to: " + st1.nextToken());
        
        
        
       
    }
}