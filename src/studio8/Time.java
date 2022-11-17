package studio8;

import java.util.Objects;

public class Time {
private int hour;
private int minute;
private boolean miltaryTime;

	public int getHour() {
	return hour;
}

public void setHour(int hour) {
	this.hour = hour;
}

public int getMinute() {
	return minute;
}

public void setMinute(int minute) {
	this.minute = minute;
}

	public boolean isMiltaryTime() {
	return miltaryTime;
}

public void setMiltaryTime(boolean miltaryTime) {
	this.miltaryTime = miltaryTime;
}


	public Time(int hour, int minute, boolean miltaryTime) {
	super();
	this.hour = hour;
	this.minute = minute;
	this.miltaryTime = miltaryTime;
}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public String toString () {
		if (miltaryTime) {
		return hour + ":"+minute;
		}
		else if (hour>12) {
			int x=hour-12;
			return x+":"+minute+ " "+ "P.M.";
		}
		else {
			return hour+":"+minute+ " "+ "A.M.";
		}
}

	public static void main(String[] args) {
		Time T= new Time (23,50, false);
		System.out.println(T);
    	
    }

}