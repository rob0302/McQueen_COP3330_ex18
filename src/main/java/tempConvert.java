/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.util.Scanner;
public class tempConvert {
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.print("Press C to convert from Fahrenheit to Celsius or F to convert Celsius to Fahrenheit: ");
String tempType = sc.nextLine();

if(tempType.equals("C") || tempType.equals("c")){
    System.out.print("Enter temperature in Fahrenheit: ");
    float F = sc.nextFloat();
    int temp =(int)((F - 32) * 5/9);
    System.out.print("The temperature in Celsius is "+temp);
}else if(tempType.equals("F") || tempType.equals("f")){
    System.out.print("Enter temperature in Celsius: ");
    float C = sc.nextFloat();
    int temp =(int)((C * 9/5) + 32);
    System.out.print("The temperature in Fahrenheit is "+temp);
}



    }
}
