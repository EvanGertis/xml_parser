package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class Main {
	
	private static final String FILENAME = "./src/resources/exercise.xml";
	private static Document doc;
	private static ArrayList<String> keyterms;
	private static ArrayList<String> descriptions;
	
	public static void main(String args[]) {
		System.out.println("Step 1 read xml document");
		Document doc = readXML(FILENAME);
		
		System.out.println("Step 2 for each key add keyterm and description to respective arrays");
		proccessKeyTermsAndDescriptions(doc);
		
		System.out.println("Step 3 print header");
		printHeader();
		
		System.out.println("Step 4 print body w/ keyterms and descriptions");
		printBodyWithKeyTermsAndDescriptions(keyterms,descriptions);
		
		System.out.println("Step 5 print footer");
		printFooter(keyterms,descriptions);
		
		// Instantiate the Factory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	}
	
    private static InputStream readXmlFileIntoInputStream(final String fileName) {
        System.out.println("processing:" + fileName);
    	return Main.class.getClassLoader().getResourceAsStream(fileName);
    }
	
	public static Document readXML(String fileName) {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
    	// This is used to prevent xml injection attacks    	
    	try(InputStream inputStream = new FileInputStream(fileName)){
    		dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
    		DocumentBuilder db = dbf.newDocumentBuilder();
    		doc = db.parse(inputStream);
    		doc.getDocumentElement().normalize();
    	}
    	catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    		return doc;
	}
	
	public static void proccessKeyTermsAndDescriptions(Document doc) {
		System.out.println(doc.getDocumentElement().getNodeName());
		
		//TODO: add keyterms to array.
		
		
		//TODO: add descriptions to array.
		
	}
	
	public static void printHeader() {
		//TODO: Add DOCTYPE
		StringBuilder header = new StringBuilder();
		header.append("<!DOCTYPE HTML>\n<html lang=\"en\">\n\t<head>\n\t\t<title>Word Matching Exercise</title>\n\t\t<style>\n*:focus {outline: 2px solid blue; outline-offset: 2px;}\n\t\tdetails {padding:3px;}\n\t\t</style>\n\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"${pageContext.request.contextPath}/static/css/boxes.css\" />\n\t\t<script type=\"text/javascript\" src=\"${pageContext.request.contextPath}/static/js/event1.js\">");
		header.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"${pageContext.request.contextPath}/static/css/style.css\" />");
		header.append("</");
		header.append("script>\n");
		header.append("<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-89940905-27\">");
		header.append("</");
		header.append("script>\n");
		header.append("<script src=\"${pageContext.request.contextPath}/static/js/jquery-1.7.2.min.js\">");
		header.append("</");
		header.append("script>\n");
		header.append("<script src=\"${pageContext.request.contextPath}/static/js/jquery-ui.min.js\">");
		header.append("</");
		header.append("script>\n");
		header.append("<script src=\"${pageContext.request.contextPath}/static/js/jquery.ui.touch-punch.min.js\">");
		header.append("</");
		header.append("script>\n");
		header.append("<script src=\"${pageContext.request.contextPath}/static/js/event1.js\">");
		header.append("</");
		header.append("script>\n");
		header.append("<script src=\"${pageContext.request.contextPath}/static/js/jquery.alerts.js\">");
		header.append("</");
		header.append("script>\n");
		header.append("<link href=\"${pageContext.request.contextPath}/static/js/jquery.alerts.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\">");
		header.append("<script type=\"text/javascript\" src=\"${pageContext.request.contextPath}/static/js/logging.js\">");
		header.append("</");
		header.append("script>\n</head>\n\t\t<body>");
		//Begin Body
        System.out.println(header.toString());
	}
	
	public static void printFooter(ArrayList<String> keyterms, ArrayList<String> descriptions) {
		//End Body
		StringBuilder footer = new StringBuilder();
		footer.append("\n\t\t</body>\n</html>\n");
		footer.append("");
		footer.append("<script type=\"text/javascript\">");
		footer.append("$(init);");
		footer.append("$( window ).unload(function() {");
		footer.append("removeStorage.removeItem(\"someVarKey1\");");
		footer.append("});");
		footer.append("function reset() {");
		footer.append("  var someVarName = true;");
		footer.append("sessionStorage.setItem(\"someVarKey1\", someVarName);");
		footer.append("window.location.reload();");
		footer.append("}");
		footer.append("function init() {");
		footer.append("	document.getElementById(\"resetButton\").style.display = \"none\";");
		footer.append("document.getElementById(\"resetButton\").style.visibility = \"hidden\";");
		footer.append("if (false && sessionStorage.getItem(\"someVarKey1\"))");
		footer.append("$(\"#one\").focus();");
        System.out.println("var numbers = [");
        footer.append("var numbers = [");
        //for (String description : descriptions){
        //     footer.append(dlArrayNumbers[i-numberOfInputs].replace ( /[^\d.]/g, "" ));
        //     System.out.println(dlArrayNumbers[i-numberOfInputs].replace ( /[^\d.]/g, "" ))
        //     footer.append(",");
        //     System.out.println(",");
        //}
        System.out.println("];");
        footer.append("];");
        footer.append("initialize(numbers);");
        footer.append("}");
        footer.append("</script>");
        footer.append("  <script>");
        footer.append("  answer = ");
        footer.append("\"");
        String answer = "";
//        for (description : descriptions) {
//             answer += elArray[i-numberOfInputs];
//             answer += ":";
//             answer += dlArray[i-numberOfInputs];
//             answer  += " "
//        }
        footer.append(answer);
        System.out.println(answer);
        footer.append("\"");
        footer.append(";");
        footer.append("\n");
        footer.append(" Iteration: is one time execution of the loop body.");
        footer.append("\n");
        footer.append("Loop Continuation Condition: is a Boolean expression that controls the execution of the loop.");
        footer.append("\n");
        footer.append("Infinite Loop: is a loop that runs forever due to an error in the code.");
        footer.append("\n");
        footer.append("Off-by-one: is an error in the program that causes the loop body to be executed one more or less time.");
        footer.append("  function show_answer() {");
        footer.append("	  jAlert(answer, \"Correct Match\");");
        footer.append("  }");
        footer.append("</script>");
        footer.append(" ");
        footer.append("<script type=\"text/javascript\" src=\"${pageContext.request.contextPath}/static/js/GetElementPosition3.js\"></script>");
        footer.append(" <script>");
        footer.append("    $(function(){");
        footer.append("  if (\"speechSynthesis\" in window) {");
        footer.append("    speechSynthesis.onvoiceschanged = function() {");
        footer.append("      var $voicelist = $(\"#voices\");");
        footer.append("");
        footer.append("      if($voicelist.find(\"option\").length == 0) {");
        footer.append("        speechSynthesis.getVoices().forEach(function(voice, index) {");
        footer.append("          var $option = $(\"<option>\")");
        footer.append("          .val(index)");
        footer.append("          .html(voice.name + (voice.default ? \" (default)\" :\"\"));");
        footer.append("          $voicelist.append($option);");
        footer.append("        });");
        footer.append("");
        footer.append("        $voicelist.form_select();");
        footer.append("      }");
        footer.append("    }");
        footer.append("  } ");
        footer.append("});     ");
        footer.append("audioOn = false;");
        footer.append("$(function() {");
        footer.append("$(\".menulink\").click(function(){");
        footer.append("  if (audioOn) {");
        footer.append("	$(\"#bg\").attr(\"src\",\"${pageContext.request.contextPath}/static/images/audioOff.png\");  ");
        footer.append("	audioOn = false;");
        footer.append("  }");
        footer.append("  else {");
        footer.append("	$(\"#bg\").attr(\"src\",\"${pageContext.request.contextPath}/static/images/audioOn.png\");");
        footer.append("	audioOn = true; speak(\" \");");
        footer.append("  }");
        footer.append("  return false;");
        footer.append("});");
        footer.append("});");
        footer.append(" </script>   ");
        System.out.println(footer);
	}
	
	public static void printBodyWithKeyTermsAndDescriptions(ArrayList<String> keyterms, ArrayList<String> descriptions) {
		
		
	}

}
