package com.java21days; 

class ZipCode{
private String zipCode = "";

 ZipCode (String inZipCode){
setZipCode(inZipCode);
 }

public void setZipCode (String inZipCode){
if (inZipCode.length() == 5) {
    this.zipCode = inZipCode;
}
    }
public String getZipCode(){
    return zipCode;
}
public static void main (String[] arguments){
    ZipCode zip1 = new ZipCode("80278");
    ZipCode zip2 = new ZipCode ("123456");
    if (zip1.getZipCode() != ""){
        System.out.println("Zip1: "+ zip1.getZipCode());
    }
    if (zip2.getZipCode() != ""){
    System.out.println("Zip2: "+ zip2.getZipCode());
    }
    
    
}
} 