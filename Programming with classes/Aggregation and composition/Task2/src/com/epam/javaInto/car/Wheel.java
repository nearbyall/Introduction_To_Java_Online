package com.epam.javaInto.car;

public class Wheel {
	private String discType;
	private String rubberType;
	private String diametr;
	
	public Wheel(String discType, String rubberType, String diametr) {
		this.discType = discType;
		this.rubberType = rubberType;
		this.diametr = diametr;
	}
	
	@Override
	public String toString() {
		return String.format("Тип диска: %s\n"
						   + "Тип резины: %s\n"
						   + "Диаметр колеса: %s см\n",
						   discType, rubberType, diametr);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diametr == null) ? 0 : diametr.hashCode());
		result = prime * result + ((discType == null) ? 0 : discType.hashCode());
		result = prime * result + ((rubberType == null) ? 0 : rubberType.hashCode());
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
		Wheel other = (Wheel) obj;
		if (diametr == null) {
			if (other.diametr != null)
				return false;
		} else if (!diametr.equals(other.diametr))
			return false;
		if (discType == null) {
			if (other.discType != null)
				return false;
		} else if (!discType.equals(other.discType))
			return false;
		if (rubberType == null) {
			if (other.rubberType != null)
				return false;
		} else if (!rubberType.equals(other.rubberType))
			return false;
		return true;
	}

	public void changeWheel(Wheel wheel) {
		this.discType = wheel.discType;
		this.rubberType = wheel.rubberType;
		this.diametr = wheel.diametr;
		System.out.println("Колесо было заменено!\n");
	}
	
	public String getDiscType() {
		return discType;
	}
	
	public String getRubberType() {
		return rubberType;
	}
	
	public String getDiametr() {
		return diametr;
	}
	
	public void setDiscType(String discType) {
		this.discType = discType;
	}
	
	public void setRubberType(String rubberType) {
		this.rubberType = rubberType;
	}
	
	public void setDiametr(String diametr) {
		this.diametr = diametr;
	}
}
