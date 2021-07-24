package com.epam.javaIntro.calendar;

import java.util.ArrayList;

public class Calendar {
	private ArrayList<Date> dates;
	
	public Calendar() {
		this.dates = new ArrayList<Date>();
	}
	
	public void printDates() {
		System.out.println("Даты  календаря: ");
		for (Date date : dates) {
			System.out.println(date.toString());
		}
	}
	
	public void addDate(Date date) {
		dates.add(date);
	}
	
	public void deleteDate(Date date) {
		dates.remove(date);
	}
	
	public ArrayList<Date> getDates() {
		return dates;
	}

	public void setDates(ArrayList<Date> dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		return dates.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dates == null) ? 0 : dates.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calendar other = (Calendar) obj;
		if (dates == null) {
			if (other.dates != null)
				return false;
		} else if (!dates.equals(other.dates))
			return false;
		return true;
	}

	public static class Date {
	    private String date;
	    private DateType dateType;
		
	    public Date(String date, DateType dateType) {
	    	this.date = date;
	    	this.dateType = dateType;
	    }
	    
		public String getDate() {
			return date;
		}


		public void setDate(String date) {
			this.date = date;
		}


		public DateType getDateType() {
			return dateType;
		}


		public void setDateType(DateType dateType) {
			this.dateType = dateType;
		}

		@Override
		public String toString() {
			return String.format("Дата: %s\n"
							   + "Тип дня: %s\n",
							   date, dateType.getValue());
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((date == null) ? 0 : date.hashCode());
			result = prime * result + ((dateType == null) ? 0 : dateType.hashCode());
			return result;
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
			if (date == null) {
				if (other.date != null)
					return false;
			} else if (!date.equals(other.date))
				return false;
			if (dateType != other.dateType)
				return false;
			return true;
		}

		public static enum DateType {
			HOLIDAY("Праздник"),
			WEEKEND("Выходной"),
			WEEKDAY("Будний");
			
			private final String value;
			
			private DateType(String value) {
				this.value = value;
			}
			
			public String getValue() {
				return value;
			}
		}
	}
}
