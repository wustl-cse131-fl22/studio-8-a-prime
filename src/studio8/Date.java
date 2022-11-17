package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Date {
private int month;
private int day;
private int year;
private boolean isHoliday;

    public int getMonth() {
	return month;
}

public void setMonth(int month) {
	this.month = month;
}

public int getDay() {
	return day;
}

public void setDay(int day) {
	this.day = day;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public boolean isHoliday() {
	return isHoliday;
}

public void setHoliday(boolean isHoliday) {
	this.isHoliday = isHoliday;
}

	public Date(int month, int day, int year, boolean isHoliday) {
	super();
	this.month = month;
	this.day = day;
	this.year = year;
	this.isHoliday = isHoliday;
}
	
@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

public String toString () {
	return month + "/"+day+ "/"+year+" "+"\n"+isHoliday ;
}

	public static void main(String[] args) {
		Date T= new Date(1, 20, 2002, false);
		Date A=new Date(7, 9, 2002, false);
		Date F=new Date(8, 28, 2002, false);
		Date Four=new Date(07, 04, 2002, true);
		Date Chirst=new Date(12, 25, 2002, true);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(Chirst);
		list.add(Four);
		list.add(T);
		list.add(A);
		list.add(F);
		
		for (Date d:list) {
		System.out.println(d);
		if(T.equals(d)){
		System.out.println("Happy Brithday Tyrus");
		}
		}
		
    }

}
