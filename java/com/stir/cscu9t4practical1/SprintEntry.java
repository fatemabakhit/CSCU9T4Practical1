package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class SprintEntry extends Entry {

	private int repetitions;
	private int recovery;

   public SprintEntry (String n, int d, int m, int y, int h, int min, int s, float dist, int rep, int rec) {

	super(n, d,m, y, h,min, s, dist);
	this.repetitions = rep;
	this.recovery =rec;
	 Calendar inst = Calendar.getInstance();
	  inst.set(y, m-1 ,d , h,min,s);
	  dateAndTime = inst;
   distance = dist;
	
}

   public int getRepetitions() {
	return repetitions;
  }
   
   public void setRepetitions(int rep) {
	this.repetitions = rep;
  }

  public int getRecovery() {
	return recovery;
  }
  
  public void setRecovery(int rec) {
	this.recovery= rec;
  }
 
  public String getEntry () {
	   String result = getName()+" ran " + getDistance() + " km in "
	             +getHour()+":"+getMin()+":"+ getSec() + " on "
	             +getDay()+"/"+getMonth()+"/"+getYear()+"\n" +getRepetitions()+":" +getRecovery()+ ":";
	   return result;
   }
  }