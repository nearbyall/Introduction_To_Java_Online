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
		return String.format("��� �����: %s\n"
						   + "��� ������: %s\n"
						   + "������� ������: %s ��\n",
						   discType, rubberType, diametr);
	}
	
	public void changeWheel(Wheel wheel) {
		this.discType = wheel.discType;
		this.rubberType = wheel.rubberType;
		this.diametr = wheel.diametr;
		System.out.println("������ ���� ��������!\n");
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
