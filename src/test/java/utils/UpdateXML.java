package utils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import apiTest.UserTest;

public class UpdateXML {

	public static void main(String argv[]) throws IOException {
		

		 String filepath="C:\\Vijay\\GCD\\GCDAPITEST\\Response.xml";
		File xmlFile = new File(filepath);
		StringBuffer sb = new StringBuffer();
				BufferedReader br = new BufferedReader(new FileReader(xmlFile));
				String line = null;
				while((line = br.readLine())!= null)
				{
				    
				        line = line.replaceAll("EDI","vijay");
				        line = line.replaceAll("BOL","Vijay");
				            
				        sb.append(line+"\n");                 
				}
				br.close();

				BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Vijay\\GCD\\GCDAPITEST\\AUT"+898+".xml"));
				bw.write(sb.toString());
				bw.close();
		
		
		
	}

//	   try {
//		   String filepath="C:\\Vijay\\GCD\\GCDAPITEST\\AUT_test1.xml";
//		DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
//		DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
//		Document doc = docBuilder.parse(filepath);
//		Node node1=doc.getElementsByTagName("ediTransmissionNumber").item(0);
//		node1.setTextContent("VIJAY");
//
//		// Get the staff element by tag name directly
//		Node staff = doc.getElementsByTagName("responseData").item(0);
//
//			NodeList list = staff.getChildNodes();
//
//		for (int i = 0; i < list.getLength(); i++) {
//
//                   Node node = list.item(i);
//                   System.out.println(node.getNodeName());
//
//		   // get the salary element, and update the value
//		   if ("billOfLadingNumber".equals(node.getNodeName())) {
//			node.setTextContent("2000001");
//		   }
//
//          
//		  
//		}
//
//		// write the content into xml file
//		TransformerFactory transformerFactory = TransformerFactory.newInstance();
//		Transformer transformer = transformerFactory.newTransformer();
//		DOMSource source = new DOMSource(doc);
//		StreamResult result = new StreamResult(new File(filepath));
//		transformer.transform(source, result);
//
//		System.out.println("Done");
//
//	   } catch (ParserConfigurationException pce) {
//		pce.printStackTrace();
//	   } catch (TransformerException tfe) {
//		tfe.printStackTrace();
//	   } catch (IOException ioe) {
//		ioe.printStackTrace();
//	   } catch (SAXException sae) {
//		sae.printStackTrace();
//	   }
//	}
}