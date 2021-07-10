package com.epam.javaIntro.state;

/*
 * 3.������� ������ ������ �����������, ��������� ������ �������, �����, �����.
 *   �12ваыфв ������� �� ������� �������, ���������� ��������, �������, ��������� ������. 
 */

public class Main {
	public static void main(String[] args) {
		//�������� ������� � ���������� � ��� �� ���� �������
		District district1 = new District("�������������");
		district1.addCity(new City("������", false, false, false));
		district1.addCity(new City("���������", false, false, true));
		
		District district2 = new District("�������");
		district2.addCity(new City("�����", true, true, true));
		district2.addCity(new City("��������", false, false, false));
		
		District district3 = new District("���������");
		district3.addCity(new City("�������", false, false, false));
		district3.addCity(new City("�����", true, false, true));
		
		District district4 = new District("�������");
		district4.addCity(new City("�����", false, false, true));
		district4.addCity(new City("�������", false, false, false));
		
		District district5 = new District("�����������");
		district5.addCity(new City("�������", true, false, true));
		district5.addCity(new City("����������", false, false, false));
		
		District district6 = new District("����������");
		district6.addCity(new City("��������", false, false, false));
		district6.addCity(new City("���������", false, false, false));
		
		//�������� �������� � ���������� � ��� �� ���� �������
		Region region1 = new Region("�������");
		region1.setSquare(25);
		region1.addDistrict(district1);
		region1.addDistrict(district2);
		
		Region region2 = new Region("���������");
		region2.setSquare(30);
		region2.addDistrict(district3);
		region2.addDistrict(district4);
		
		Region region3 = new Region("�����������");
		region3.setSquare(35);
		region3.addDistrict(district5);
		region3.addDistrict(district6);
		
		//�������� ����������� � ���������� � ���� ��������
		State state = new State("��������");
		state.addRegion(region1);
		state.addRegion(region2);
		state.addRegion(region3);
		
		state.printCapitalOfState();
		state.printCentersOfRegions();
		state.printCountOfRegions();
		state.printSquare();
	}
}
