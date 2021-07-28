package com.epam.javaIntro.time;

public class Time {
	private int seconds;
	private int minutes;
	private int hours;
	
	public Time() {
	 this.seconds = 0;
	 this.minutes = 0;
	 this.hours = 0;
	}
	
	public Time(int hours, int minutes, int seconds) {
		this.setSeconds(seconds);
		this.setMinutes(minutes);
		this.setHours(hours);
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [seconds=" + seconds + ", minutes=" + minutes + ", hours=" + hours + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + seconds;
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
		Time other = (Time) obj;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (seconds != other.seconds)
			return false;
		return true;
	}

	public void setSeconds(int seconds) {
		if (seconds >= 0 && seconds < 60) {
			this.seconds = seconds;
		} else {
			this.seconds = 0;
		}
	}
	
	public void setMinutes(int minutes) {
		if (minutes >= 0 && minutes < 60) {
			this.minutes = minutes;
		} else {
			this.minutes = 0;
		}
	}
	
	public void setHours(int hours) {
		if (hours >= 0 && hours < 24) {
			this.hours = hours;
		} else {
			this.hours = 0;
		}
	}
	
	public void changeForHours(int hours) {
		if ((this.hours + hours) >= 24) {
			this.hours = (this.hours + hours) % 24;
		} else {
			this.hours += hours; 
		}
	}
	
	public void changeForMinutes(int minutes) {
		if ((this.minutes + minutes) >= 60) {
			this.minutes = (this.minutes + minutes) % 60;
			this.changeForHours((this.minutes + minutes) / 60);
		} else {
			this.minutes += minutes;
		}
	}
	
	public void changeForSeconds(int seconds) {
		if ((this.seconds + seconds) >= 60) {
			this.seconds = (this.seconds + seconds) % 60;
			this.changeForMinutes((this.seconds + seconds) / 60);
		} else {
			this.seconds += seconds;
		}
	}
	
	public void showTime() {
		System.out.printf("Время %02d:%02d:%02d\n", hours, minutes, seconds);
	}
}
