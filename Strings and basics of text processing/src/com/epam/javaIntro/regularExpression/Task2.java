package com.epam.javaIntro.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 2.Дана строка, содержащая следующий текст (xml-документ):
 * <notes>
 *    <note id = "1">
 *       <to>Вася</to>
 *       <from>Света</from>
 *       <heading>Напоминание</heading>
 *       <body>Позвони мне завтра!</body>
 *    </note>
 *    <note id = "2">
 *        <to>Петя</to>
 *        <from>Маша</from>
 *        <heading>Важное напоминание</heading>
 *        <body/>
 *    </note>
 * </notes>
 * Напишите анализатор, позволяющий последовательно возвращать содержимое узлов
 * xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега,
 * тег без тела). Пользоваться готовыми парсерами XML для решения данной задачи нельзя.
 */

public class Task2 {
	public static String XMLParser(String XML) {
		StringBuilder strBuilder = new StringBuilder();
        Pattern pOpen = Pattern.compile("<\\w.+?>");
        Pattern pClose = Pattern.compile("</\\w+>");
        Pattern pBody = Pattern.compile(">.+?<");
        Pattern pEmpty = Pattern.compile("<\\w.+?/>");

        String [] lines = XML.split("\n\\s*"); /* разбиваем xml построчно */

        /* проверяем содержимое каждой строки */
        for (String line : lines) {
            Matcher mOpen = pOpen.matcher(line);
            Matcher mClose = pClose.matcher(line);
            Matcher mBody = pBody.matcher(line);
            Matcher mEmpty = pEmpty.matcher(line);
            if (mEmpty.find()) {
                strBuilder.append(mEmpty.group());
                strBuilder.append(" - тег без тела\n");
            }
            else if (mOpen.find()) {
                strBuilder.append(mOpen.group());
                strBuilder.append(" - открывающий тег\n");
            }
            if (mBody.find()) {
                strBuilder.append(mBody.group().substring(1));
                strBuilder.append("\b - содержимое тега\n");
            }
            if (mClose.find()) {
                strBuilder.append(mClose.group());
                strBuilder.append(" - закрывающий тег\n");
            }

        }
        return strBuilder.toString();
		
	}
	
	public static void main(String[] args) {
		String XML = "<notes>\n"
				   + "    <noteid=\"1\">\n"
			       + "        <to>Вася</to>\n"
				   + "		  <from>Света</from>\n"
				   + "		  <heading>Напоминание</heading>\n"
				   + "		  <body>Позвони мне завтра!</body>\n"
				   + "	  </note>\n"
				   + "	  <noteid=\"2\">\n"
				   + "		  <to>Петя</to>\n"
				   + "		  <from>Маша</from>\n"
				   + "		  <heading>Важноенапоминание</heading>\n"
				   + "		  <body/>\n"
				   + "	  </note>\n"
				   + "</notes>\n";
		System.out.println(XMLParser(XML));
	}
}
