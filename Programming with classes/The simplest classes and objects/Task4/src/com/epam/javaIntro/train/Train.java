package com.epam.javaIntro.train;

public class Train {
	private String destination;
	private String departureTime;
	private int number;
	
	public Train(String destination, int number, String departureTime) {
		this.destination = destination;
		this.number = number;
		this.departureTime = departureTime;
	}
	
	@Override
	public String toString() {
		return String.format("Место прибытия: %s\n"
						   + "Время отправления: %s\n"
						   + "Номер поезда: %d",
						   destination, departureTime, number);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + number;
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
		Train other = (Train) obj;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	public static void sortByNumber(Train[] trains) {
		Train tempTrain;
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < trains.length - 1; i++) {
				if (trains[i].number > trains[i + 1].number) {
					tempTrain = trains[i];
					trains[i] = trains[i + 1];
					trains[i + 1] = tempTrain;
					flag = true;
				}
			}
		}
	}
	
	public static void sortByDestination(Train[] trains) {
		Train tempTrain;
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < trains.length - 1; i++) {
				int compare = trains[i].destination.compareTo(trains[i + 1].destination);
				if (compare > 0) {
					tempTrain = trains[i];
					trains[i] = trains[i + 1];
					trains[i + 1] = tempTrain;
					flag = true;
				} else if (compare == 0) {
					if (trains[i].departureTime.compareTo(trains[i + 1].departureTime) > 0) {
						tempTrain = trains[i];
						trains[i] = trains[i + 1];
						trains[i + 1] = tempTrain;
						flag = true;
					}
				}
			}
		}
	}
	
	public static void printTrainByNumber(Train[] trains, int number) {
		for (Train train : trains) {
			if (train.number == number) {
				System.out.println("Номер поезда: " + train.number +
								   "\nНазвание пункта назначения: " + train.destination +
								   "\nВремя отправления: " + train.departureTime);
			}
		}
	}
	
	public static void printTrains(Train[] trains) {
		for (Train train : trains) {
			System.out.println("Номер поезда: " + train.number +
							   "\nНазвание пункта назначения: " + train.destination +
					           "\nВремя отправления: " + train.departureTime);
		}
	}
}
