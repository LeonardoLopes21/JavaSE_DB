package services;

import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Formatter {

    public static String fixLocalDateFormatting(LocalDate data){
        return (Formatter.formatNumbers(data.getDayOfMonth())+ "/" + formatNumbers(data.getMonth().getValue()) + "/" + data.getYear());
    }

    public static String formatNumbers(int num){
        String num2 = (num > 9 ? "" + num : "0" + num);
        return num2;
    }

    public static String formatHour(LocalTime time){

        String hour = formatNumbers(time.getHour()) + ":" + formatNumbers(time.getMinute());
        return hour;

    }
    
    public LocalDate getLocalDate(String date){
        
        LocalDate result = LocalDate.of(Integer.parseInt(date.split("-")[2]), Integer.parseInt(date.split("-")[1]), Integer.parseInt(date.split("-")[0]));


        return result;

        
    }
    
    public static void turnInvisible(JTextField a){
        a.setVisible(false);
    }
    
    public static void turnVisible(JTextField a){
        a.setVisible(true);
    }

    

}
