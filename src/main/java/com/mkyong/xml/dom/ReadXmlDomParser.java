package com.mkyong.xml.dom;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.swing.text.Document;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.NodeList;

import com.sun.java.util.jar.pack.Attribute.Layout.Element;
import com.sun.org.apache.bcel.internal.classfile.Node;

import jdk.internal.org.xml.sax.SAXException;

public class ReadXmlDomParser {

    private static final String FILENAME = "src/main/resources/exercise.xml";

    public static void main(String[] args) {

        // Instantiate the Factory
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

        try (InputStream is = readXmlFileIntoInputStream("exercise.xml")) {

            // optional, but recommended
            // process XML securely, avoid attacks like XML External Entities (XXE)
            dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

            // parse XML file
            DocumentBuilder db = dbf.newDocumentBuilder();

            // read from a path
            //Document doc = db.parse(new File(FILENAME));

            // read from a project's resources folder
            Document doc = db.parse(is);

            // optional, but recommended
            // http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
            doc.getDocumentElement().normalize();

            System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
            // get <staff>
            NodeList list = doc.getElementsByTagName("wordmatch");
            ArrayList<String> keyterms = new ArrayList<String>();
            ArrayList<String> descriptions = new ArrayList<String>();

            for (int temp = 0; temp < list.getLength(); temp++) {

                Node node = list.item(temp);

                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element element = (Element) node;

                    // get staff's attribute
                    String id = element.getAttribute("id");

                    // get text
                    String key = element.getElementsByTagName("key").item(0).getTextContent();
                    String keyterm = element.getElementsByTagName("keyterm").item(0).getTextContent();
                    String description = element.getElementsByTagName("decription").item(0).getTextContent();
                    System.out.println("key :" + key);
                    System.out.println("keyterm :" + keyterm);
                    System.out.println("description :" + description);
                    
                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }
    
    private static void printHTML(ArrayList<String> keyterms, ArrayList<String> descriptions) {
    		StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE HTML>\n<html lang=\"en\">\n\t<head>\n\t\t<title>Word Matching Exercise</title>\n\t\t<style>\n*:focus {outline: 2px solid blue; outline-offset: 2px;}\n\t\tdetails {padding:3px;}\n\t\t</style>\n\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"${pageContext.request.contextPath}/static/css/boxes.css\" />\n\t\t<script type=\"text/javascript\" src=\"${pageContext.request.contextPath}/static/js/event1.js\">");
        sb.append("<link rel=\"stylesheet\" type=\"text/css\" href=\"${pageContext.request.contextPath}/static/css/style.css\" />");
        sb.append("</");
        sb.append("script>\n");
        sb.append("<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-89940905-27\">");
        sb.append("</");
        sb.append("script>\n");
        sb.append("<script src=\"${pageContext.request.contextPath}/static/js/jquery-1.7.2.min.js\">");
        sb.append("</");
        sb.append("script>\n");
        sb.append("<script src=\"${pageContext.request.contextPath}/static/js/jquery-ui.min.js\">");
        sb.append("</");
        sb.append("script>\n");
        sb.append("<script src=\"${pageContext.request.contextPath}/static/js/jquery.ui.touch-punch.min.js\">");
        sb.append("</");
        sb.append("script>\n");
        sb.append("<script src=\"${pageContext.request.contextPath}/static/js/event1.js\">");
        sb.append("</");
        sb.append("script>\n");
        sb.append("<script src=\"${pageContext.request.contextPath}/static/js/jquery.alerts.js\">");
        sb.append("</");
        sb.append("script>\n");
        sb.append("<link href=\"${pageContext.request.contextPath}/static/js/jquery.alerts.css\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\">");
        sb.append("<script type=\"text/javascript\" src=\"${pageContext.request.contextPath}/static/js/logging.js\">");
        sb.append("</");
        sb.append("script>\n</head>\n\t\t<body>");
        sb.append("");
        sb.append("<div id=\'maincontentstyle\'>\n");
        sb.append("\t<center>\n");
        sb.append("\t\t<div id=\'boxstyle\'>\n");
        String title = "";
        sb.append("\t\t\t<h3 id=\"title\">"+title+"</h3>\n");
        sb.append("\t\t\t\t<center>\n");
        sb.append("\t\t\t\t\t<div class=\'source\'>\n");
        sb.append("\t\t\t\t\t<div class=\'source\'>\n"); 
        System.out.println("The value of the dlArray is");
//        System.out.println(dlArray);
        System.out.println("The value of the elArray is");
//        System.out.println(elArray);
//        dlArray = shuffleDescriptions(dlArray);



//        for (let i = numberOfInputs; i < elArray.length+numberOfInputs; i++){
//            sb.append("\t\t\t\t\t\t<div id=\"s");
//            id   = i-numberOfInputs+1;//elArray[i-numberOfInputs].replace ( /[^\d.]/g, '' );
//            System.out.println("id "+id);
//            sb.append(id);
//            sb.append("\" class=\'draggyBox-small ui-draggable\'>\n");
//            sb.append("\t\t\t\t\t\t\t");
//            sb.append(elArray[i-numberOfInputs]);
//            sb.append('\n');
//            sb.append('\t\t\t\t\t\t</div>\n');
//        }
//        elArray = shuffleKeys(elArray);
//        System.out.println("The value of the dlArray is")
//        System.out.println(dlArray)
//        System.out.println("The value of the elArray is")
//        System.out.println(elArray)
//        sb.append("\t\t\t\t\t</div>\n");
//        sb.append("\t\t\t\t\t</center>\n");

        //create description inputs
        sb.append("\t\t\t\t\t<table id=\"tablestyle\">\n");
        // for (let i = numberOfInputs; i < dlArray.length+numberOfInputs; i++){
        //     sb.append("\t\t\t\t\t\t<tr>\n");
        //     sb.append("\t\t\t\t\t\t<td id=\"row");
        //     id   =  i-numberOfInputs+1;//dlArray[i-numberOfInputs].replace ( /[^\d.]/g, "" );
        //     sb.append("id "+id);
        //     sb.append(id);
        //     sb.append("\">\n");
        //     sb.append("\t\t\t\t\t\t\t<div id=\"t");
        //     sb.append(id);
        //     sb.append("\" class=\"ltarget ui-droppable\">");
        //     sb.append("</div>\n"); 
        //     sb.append("\t\t\t\t\t\t</td >\n");
        //     sb.append("\t\t\t\t\t\t<td id=\"d");
        //     sb.append(id);
        //     sb.append("\">\n");
        //     sb.append("\t\t\t\t\t\t\t");
        //     sb.append(dlArray[i-numberOfInputs]);
        //     html += "\n";
        //     html +="\t\t\t\t\t\t\t</td >\n" 
        //     html +="\t\t\t\t\t\t</tr>\n";
        // }
        sb.append("\t\t\t\t\t</table>\n");
        sb.append("\t\t\t\t</center>\n");
        sb.append("\t\t</div>\n");
        sb.append("\t</center>\n");
        sb.append("</div>");
        sb.append("<span style=\"padding: 3px\"> <button id =\"one\" class=\"button\" type=\"button\" onClick=\"show_answer");
        sb.append("()");
        sb.append("\"");
        sb.append(">");
        sb.append("Show Answer");
        sb.append("</");
        sb.append("button> <button id = \"resetButton\" class=\"button\" type=\"button\" onClick=\"reset");
        sb.append("()");
        sb.append("\"");
        sb.append(">");
        sb.append("Reset");
        sb.append("</");
        sb.append("button>");
        sb.append("</span>");
        sb.append("<span id=\"audio\" style=\"\">");
        sb.append("<a href=\"\" title=\"Turns Text-to-Speech Output On or Off\" class=\"menulink\" style=\"text-decoration: none;\">");
        sb.append("<img id=\"bg\" src=\"${pageContext.request.contextPath}/static/images/audioOff.png\" height=\"30\" width=\"30\" style=\"margin-bottom:-10px; padding-bottom:-20px;\">");
        sb.append("</a>");
        sb.append("</span>");
        sb.append("\n\t\t</body>\n</html>\n");
        sb.append("");
        sb.append("<script type=\"text/javascript\">");
        sb.append("$(init);");
        sb.append("$( window ).unload(function() {");
        sb.append("removeStorage.removeItem(\"someVarKey1\");");
        sb.append("});");
        sb.append("function reset() {");
        sb.append("  var someVarName = true;");
        sb.append("sessionStorage.setItem(\"someVarKey1\", someVarName);");
        sb.append("window.location.reload();");
        sb.append("}");
        sb.append("function init() {");
        sb.append("	document.getElementById(\"resetButton\").style.display = \"none\";");
        sb.append("document.getElementById(\"resetButton\").style.visibility = \"hidden\";");
        sb.append("if (false && sessionStorage.getItem(\"someVarKey1\"))");
        sb.append("$(\"#one\").focus();");
        System.out.println("var numbers = [");
        sb.append("var numbers = [");
        // for (let i = numberOfInputs; i < dlArray.length+numberOfInputs; i++){
        //     footer += dlArrayNumbers[i-numberOfInputs].replace ( /[^\d.]/g, "" );
        //     console.log(dlArrayNumbers[i-numberOfInputs].replace ( /[^\d.]/g, "" ))
        //     footer += ",";
        //     console.log(",")
        // }
        System.out.println("];");
        sb.append("];");
        sb.append("initialize(numbers);");
        sb.append("}");
        sb.append("</script>");
        sb.append("  <script>");
        sb.append("  answer = ");
        sb.append("\"");
        // answer = "";
        // for (let i = numberOfInputs; i < dlArray.length+numberOfInputs; i++) {
        //     answer += elArray[i-numberOfInputs];
        //     answer += ":";
        //     answer += dlArray[i-numberOfInputs];
        //     answer  += " "
        // }
        // footer += answer
        // console.log(answer)
        sb.append("\"");
        sb.append(";");
        // footer += "\n"
        // footer += " Iteration: is one time execution of the loop body."
        // footer += "\n"
        // footer += "Loop Continuation Condition: is a Boolean expression that controls the execution of the loop."
        // footer += "\n"
        // footer += "Infinite Loop: is a loop that runs forever due to an error in the code."
        // footor += "\n"
        // footer += "Off-by-one: is an error in the program that causes the loop body to be executed one more or less time.""
        sb.append("  function show_answer() {");
        sb.append("	  jAlert(answer, \"Correct Match\");");
        sb.append("  }");
        sb.append("</script>");
        sb.append(" ");
        sb.append("<script type=\"text/javascript\" src=\"${pageContext.request.contextPath}/static/js/GetElementPosition3.js\"></script>");
        sb.append(" <script>");
        sb.append("    $(function(){");
        sb.append("  if (\"speechSynthesis\" in window) {");
        sb.append("    speechSynthesis.onvoiceschanged = function() {");
        sb.append("      var $voicelist = $(\"#voices\");");
        sb.append("");
        sb.append("      if($voicelist.find(\"option\").length == 0) {");
        sb.append("        speechSynthesis.getVoices().forEach(function(voice, index) {");
        sb.append("          var $option = $(\"<option>\")");
        sb.append("          .val(index)");
        sb.append("          .html(voice.name + (voice.default ? \" (default)\" :\"\"));");
        sb.append("          $voicelist.append($option);");
        sb.append("        });");
        sb.append("");
        sb.append("        $voicelist.form_select();");
        sb.append("      }");
        sb.append("    }");
        sb.append("  } ");
        sb.append("});     ");
        sb.append("audioOn = false;");
        sb.append("$(function() {");
        sb.append("$(\".menulink\").click(function(){");
        sb.append("  if (audioOn) {");
        sb.append("	$(\"#bg\").attr(\"src\",\"${pageContext.request.contextPath}/static/images/audioOff.png\");  ");
        sb.append("	audioOn = false;");
        sb.append("  }");
        sb.append("  else {");
        sb.append("	$(\"#bg\").attr(\"src\",\"${pageContext.request.contextPath}/static/images/audioOn.png\");");
        sb.append("	audioOn = true; speak(\" \");");
        sb.append("  }");
        sb.append("  return false;");
        sb.append("});");
        sb.append("});");
        sb.append(" </script>   ");
    }

    // read file from resource's folder.
    private static InputStream readXmlFileIntoInputStream(final String fileName) {
        return ReadXmlDomParser.class.getClassLoader().getResourceAsStream(fileName);
    }

}
