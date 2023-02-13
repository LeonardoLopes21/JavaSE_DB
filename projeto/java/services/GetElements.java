package services;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class GetElements {
    public static int scanInt(){
        Scanner inputy = new Scanner(System.in);
        int temp = inputy.nextInt();
        return temp;
    }
    public static String scanString(){
        Scanner inputy = new Scanner(System.in);
        String temp = inputy.nextLine();
        return temp;
    }
    public static double scanDouble(){
        Scanner inputy = new Scanner(System.in);
        double temp = inputy.nextDouble();
        return temp;
    }
    public static LocalDate getLocalDate(String date){
        
        LocalDate result = LocalDate.of(Integer.parseInt(date.split("-")[2]), Integer.parseInt(date.split("-")[1]), Integer.parseInt(date.split("-")[0]));


        return result;

        
    }
    
    public static LocalTime getLocalTime (String date){
        
        LocalTime result = LocalTime.of(Integer.parseInt(date.split(":")[0]), Integer.parseInt(date.split(":")[1]));


        return result;

        
    }
}
