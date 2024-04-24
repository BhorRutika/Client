package Utility;
import java.io.*;
import java.net.*;
import java.text.*;
import java.util.*;

public class CurrentDateTime_Comparison {
    public static void main(String[] args) {
        // Get the current system time in HH:MM format
        SimpleDateFormat systemTimeFormat = new SimpleDateFormat("HH:mm");
        String systemTime = systemTimeFormat.format(new Date());

        try {
            // Connect to the server and retrieve its time
            URL url = new URL("http://it.mh-hsc.ac.in/Exam/");
            URLConnection connection = url.openConnection();
            connection.connect();

            // Get the server time in HH:MM format from the "Date" header field
            SimpleDateFormat serverTimeFormat = new SimpleDateFormat("HH:mm");
            String serverTime = serverTimeFormat.format(new Date(connection.getDate()));

            // Parse the times into Date objects
            Date systemDate = systemTimeFormat.parse(systemTime);
            Date serverDate = serverTimeFormat.parse(serverTime);

            // Calculate the time difference in minutes
            long timeDifferenceMinutes = (serverDate.getTime() - systemDate.getTime()) / (60 * 1000);
            System.out.println(systemDate.getTime()+"--"+serverDate.getTime()+"--"+timeDifferenceMinutes);
            

            // Check if the time difference is within the range of 5 minutes
            if (Math.abs(timeDifferenceMinutes) <= 5) {
                System.out.println("Computer time is within 5 minutes of server time.");
            } else {
                System.out.println("Computer time is more than 5 minutes away from server time.");
            }
        } catch (IOException | ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
