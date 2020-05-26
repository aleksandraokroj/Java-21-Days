package com.java21days;

class MarsRobot{
    String status;
    int speed;
    float temperature;
    MarsRobot (String inStatus, int inSpeed, float inTemperature){
        inStatus = status;
        inSpeed = speed;
        inTemperature  = temperature;
}
    
    void checkTemperature(){
        if (temperature < -62){
        status = "powrót do domu";
        speed = 5;
        }
    }
    
    void showAttributes(){
        System.out.println("Status: "+status);
        System.out.println("Prędkość: "+speed);
        System.out.println("Temperatura: "+temperature);
    }
    
    public static void main (String[] arguments){
        MarsRobot spirit = new MarsRobot("eksploracja", 5, -23);
        spirit.showAttributes();
        
    }
}