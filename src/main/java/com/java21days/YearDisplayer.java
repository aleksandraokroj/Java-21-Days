package com.java21days ;

class YearDisplayer {
static int count=-1;
public static void main (String[] arguments){
int yearIn = 2016;
for (int i=1; i<=12; i++){
countDays(i, yearIn); 
for (int j = 1; j<=count; j++){
    System.out.println(j+"/"+i+"/"+yearIn);
}
}
}
    
static int countDays (int month, int year){

switch (month){
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12: 
        count = 31;
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        count= 30;
        break;
    case 2:
        if (year % 4 ==0)
            count = 29;
        else 
            count= 28;
        
}
return count;
}
}