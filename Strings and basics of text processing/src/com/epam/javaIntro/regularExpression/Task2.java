package com.epam.javaIntro.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 2.���� ������, ���������� ��������� ����� (xml-��������):
 * <notes>
 *    <note id = "1">
 *       <to>����</to>
 *       <from>�����</from>
 *       <heading>�����������</heading>
 *       <body>������� ��� ������!</body>
 *    </note>
 *    <note id = "2">
 *        <to>����</to>
 *        <from>����</from>
 *        <heading>������ �����������</heading>
 *        <body/>
 *    </note>
 * </notes>
 * �������� ����������, ����������� ��������������� ���������� ���������� �����
 * xml-��������� � ��� ��� (����������� ���, ����������� ���, ���������� ����,
 * ��� ��� ����). ������������ �������� ��������� XML ��� ������� ������ ������ ������.
 */

public class Task2 {
	public static String XMLParser(String XML) {
		StringBuilder strBuilder = new StringBuilder();
        Pattern pOpen = Pattern.compile("<\\w.+?>");
        Pattern pClose = Pattern.compile("</\\w+>");
        Pattern pBody = Pattern.compile(">.+?<");
        Pattern pEmpty = Pattern.compile("<\\w.+?/>");

        String [] lines = XML.split("\n\\s*"); /* ��������� xml ��������� */

        /* ��������� ���������� ������ ������ */
        for (String line : lines) {
            Matcher mOpen = pOpen.matcher(line);
            Matcher mClose = pClose.matcher(line);
            Matcher mBody = pBody.matcher(line);
            Matcher mEmpty = pEmpty.matcher(line);
            if (mEmpty.find()) {
                strBuilder.append(mEmpty.group());
                strBuilder.append(" - ��� ��� ����\n");
            }
            else if (mOpen.find()) {
                strBuilder.append(mOpen.group());
                strBuilder.append(" - ����������� ���\n");
            }
            if (mBody.find()) {
                strBuilder.append(mBody.group().substring(1));
                strBuilder.append("\b - ���������� ����\n");
            }
            if (mClose.find()) {
                strBuilder.append(mClose.group());
                strBuilder.append(" - ����������� ���\n");
            }

        }
        return strBuilder.toString();
		
	}
	
	public static void main(String[] args) {
		String XML = "<notes>\n"
				   + "    <noteid=\"1\">\n"
			       + "        <to>����</to>\n"
				   + "		  <from>�����</from>\n"
				   + "		  <heading>�����������</heading>\n"
				   + "		  <body>������� ��� ������!</body>\n"
				   + "	  </note>\n"
				   + "	  <noteid=\"2\">\n"
				   + "		  <to>����</to>\n"
				   + "		  <from>����</from>\n"
				   + "		  <heading>�����������������</heading>\n"
				   + "		  <body/>\n"
				   + "	  </note>\n"
				   + "</notes>\n";
		System.out.println(XMLParser(XML));
	}
}
