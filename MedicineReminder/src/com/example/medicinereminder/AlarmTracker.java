package com.example.medicinereminder;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class AlarmTracker {
	private static final AlarmTracker tracker = new AlarmTracker();
	
	String alarmMessage;
    ArrayList<int[]> alarmTimes;
    int alarmCount;
    ArrayList<String> medicines;
    int reminder;
    ArrayList<GregorianCalendar> appointments;
    ArrayList<GregorianCalendar> refills;
    int missedAlarms;
    
    private AlarmTracker() {
    	
    }
    
    public static AlarmTracker getTracker() {
        return tracker;
    }
    
    public void setAlarmMessage(String message){
    	alarmMessage = message;
    }
    
    public void setAlarmTime(ArrayList<int[]> alarmTimes){
    	this.alarmTimes = alarmTimes;
    }
    
    public void setAlarmCount(int alarmCount){
    	this.alarmCount = alarmCount;
    }
    
    public void setMedicines(ArrayList<String> medicines){
    	this.medicines = medicines;
    }
    
    public void setReminder(int reminder){
    	this.reminder = reminder;
    }
    
    public void setAppt(ArrayList<GregorianCalendar> appts){
    	this.appointments = appts;
    }
    
    public void setRefill(ArrayList<GregorianCalendar> refill){
    	this.refills = refill;
    }
    
    public void setMissed(int missed){
    	this.missedAlarms = missed;
    }
    
}