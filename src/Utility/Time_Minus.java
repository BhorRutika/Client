package Utility;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Time_Minus {
    public static void main(String[] args) {
        // Get local date time
       

      
        LocalTime time1= LocalTime.now();
  
        LocalTime time2=LocalTime.of(14,43,12);;
        
        long hours = ChronoUnit.HOURS.between(time1, time2); 
        
        // Calculating the difference in Minutes 
        long minutes 
            = ChronoUnit.MINUTES.between(time1, time2) % 60; 
  
        // Calculating the difference in Seconds 
        long seconds 
            = ChronoUnit.SECONDS.between(time1, time2) % 60; 
  
        // Printing the difference 
        System.out.println( 
            "Difference is " + hours + " hours " + minutes 
            + " minutes " + seconds + " seconds.");
       
       
    }
}
