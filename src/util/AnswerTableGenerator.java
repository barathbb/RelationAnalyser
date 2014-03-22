package util;

import java.util.List;

public class AnswerTableGenerator {

	public static String generateAnswersHTML( int questionindex)	//Gotta add lsit
	{
		String html = "";
		
			html += "<tr>";
			html += "<td class=\"1\" id=\""+questionindex+"\">";
			html += "m";
			html += "</td>";
			html += "<td class=\"2\" id=\""+questionindex+"\">";
			html += "m";
			html += "</td>";
			html += "</tr>";
			
			html += "<tr>";
			html += "<td class=\"3\" id=\""+questionindex+"\">";
			html += ",";
			html += "</td>";
			html += "<td class=\"4\" id=\""+questionindex+"\">";
			html += "m";
			html += "</td>";
			html += "</tr>";
			
			html += "<tr>";
			html += "<td class=\"5\" id=\""+questionindex+"\">";
			html += "m";
			html += "</td>";
			html += "<td class=\"6\" id=\""+questionindex+"\">";
			html += "m";
			html += "</td>";
			html += "</tr>";
			
			html += "<tr>";
			html += "<td class=\"7\" id=\""+questionindex+"\">";
			html += "k";
			html += "</td>";
			html += "<td class=\"8\" id=\""+questionindex+"\">";
			html += "m";
			html += "</td>";
			html += "</tr>";
			
			html += "<tr>";
			html += "<td class=\"9\" id=\""+questionindex+"\">";
			html += "d";
			html += "</td>";
			html += "<td class=\"10\" id=\""+questionindex+"\">";
			html += "j";
			html += "</td>";
			html += "</tr>";
			
//			html += "<tr>";
//			html += "<td class=\"\" id=\"\">";
//			html += "";
//			html += "</td>";
//			html += "<td class=\"\" id=\"\">";
//			html += "";
//			html += "</td>";
//			html += "</tr>";
//		
			return html;
		
	}
	
}
