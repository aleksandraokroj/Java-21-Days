package com.java21days;

class WordNumber {
public static void main (String[] arguments){
    if (arguments.length>0) {
        long num = 0;
        char firstChar = arguments[0].charAt(0);
        char secondChar = arguments[0].charAt(1);
        char fifthChar = arguments[0].charAt(4);
        switch (firstChar){
            case 'j': 
                num = 1L;
                break;
            case 'd':
                if (secondChar == 'w')
                    num = 2L;
                if (fifthChar == 'w')
                    num = 9L;
                if (fifthChar == 's')
                    num = 10L;
                break;
            case 't':
                num = 3L;
                break;
            case 'c':
                num = 4L;
                break;
            case 'p':
                num = 5L;
                break;
            case 's':
                if (secondChar == 'z')
                    num = 6L;
                if (secondChar == 'i')
                    num = 7L;
                break;
            case 'o':
                num = 8L;
                break;
                
        }
        System.out.println("Liczba to "+ num);
    }
}


}