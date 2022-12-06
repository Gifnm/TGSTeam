/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author ASUS
 */
public class testCalendar {
    public static void main(String[] args) {
   
       DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd--");
        Calendar cal = Calendar.getInstance();
        
        System.out.println(cal.get(Calendar.DAY_OF_MONTH)-1);
    
    }
}
