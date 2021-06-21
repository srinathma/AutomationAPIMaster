package utils;

import static io.restassured.RestAssured.given;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
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

import org.junit.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;
import com.azure.storage.blob.BlobServiceClientBuilder;

import apiTest.UserTest;
import complianceVerification.GetComplianceVerification;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class ResponseBLOB {
	
	public static void main(String a[]) throws Exception
	
	{
		ResponseBLOB rblob=new ResponseBLOB();
		rblob.createXMLREsponse();
		//rblob.UploadToBlob();
	}
	
	
	
	/*
	 * public void UploadToBlob() throws InterruptedException {
	 * 
	 * 
	 * String file="C:\\Vijay\\GCD\\GCDAPITEST\\AUT_"+UserTestAVRO.bol+".xml";
	 * //String file="C:\\Vijay\\GCD\\GCDAPITEST\\Response.xml";
	 * 
	 * BlobClient blobClient = null;
	 * 
	 * try {
	 * 
	 * String
	 * com="DefaultEndpointsProtocol=https;AccountName=gcdeventhub;AccountKey=" +
	 * "347Df7vaqgaDZBSApMY5CsWlNIYCeUmo5CKmpA06okaWABzrX6/lZfLEwwXAH9YsfKLnwG9srqgoHFcnTfDDSQ==;EndpointSuffix=core.windows.net";
	 * 
	 * // Create a BlobServiceClient object which will be used to create a container
	 * BlobServiceClient blobServiceClient = new
	 * BlobServiceClientBuilder().connectionString(com).buildClient();
	 * 
	 * 
	 * // Create a unique name for the container String containerName =
	 * "customsinbound";
	 * 
	 * // a container client object
	 * 
	 * BlobContainerClient containerClient =
	 * blobServiceClient.getBlobContainerClient(containerName);
	 * 
	 * 
	 * // Get a reference to a blob blobClient =
	 * containerClient.getBlobClient("AUT_"+UserTest.bol+".xml");
	 * 
	 * System.out.println("Uploading to Blob storage as blob:\t" +
	 * blobClient.getBlobUrl());
	 * 
	 * // Upload the blob
	 * 
	 * blobClient.uploadFromFile(file); }
	 * 
	 * catch(Exception e) {}
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
	public void createXMLREsponse() throws IOException
	{
		String bol="VJ1234567";
		 String filepath="C:\\Vijay\\GCD\\GCDAPITEST\\GCDAPITEST\\Response.xml";
		 
		File xmlFile = new File(filepath);
		StringBuffer sb = new StringBuffer();
				BufferedReader br = new BufferedReader(new FileReader(xmlFile));
				String line = null;
				while((line = br.readLine())!= null)
				{
				    if(line.contains("IDCHECK"))
				        line = line.replaceAll("IDCHECK","EDI1234567");
				    if(line.contains("BOL"))
				        line = line.replaceAll("BOL",bol);
				            
				    sb.append(line+"\n");                
				}
				br.close();

				BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Vijay\\GCD\\GCDAPITEST\\AUT_"+bol+".xml"));
				bw.write(sb.toString());
				bw.close();
		
			}
	
	
	
	public void createXMLREsponse(String icn)
	{
		 try {
			   String filepath="C:\\Vijay\\GCD\\GCDAPITEST\\AUT"+UserTest.bol+".xml";
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(filepath);
			Node node1=doc.getElementsByTagName(icn).item(0);
			node1.setTextContent(GetComplianceVerification.EDI);

			
			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File(filepath));
			transformer.transform(source, result);
			
			
			System.out.println("Done");

		   } catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		   } catch (TransformerException tfe) {
			tfe.printStackTrace();
		   } catch (IOException ioe) {
			ioe.printStackTrace();
		   } catch (SAXException sae) {
			sae.printStackTrace();
		   }
	}

	public void DownloadFromBlob() {
		BlobClient blobClient = null;

		try {
			
			String com="DefaultEndpointsProtocol=https;AccountName=gcdeventhub;AccountKey="
					+ "347Df7vaqgaDZBSApMY5CsWlNIYCeUmo5CKmpA06okaWABzrX6/lZfLEwwXAH9YsfKLnwG9srqgoHFcnTfDDSQ==;EndpointSuffix=core.windows.net";

		// Create a BlobServiceClient object which will be used to create a container
		BlobServiceClient blobServiceClient = new BlobServiceClientBuilder().connectionString(com).buildClient();
		
		
		// Create a unique name for the container
		String containerName = "gcdinboundcontainer";

		// a container client object
		
		BlobContainerClient containerClient = blobServiceClient.getBlobContainerClient(containerName);
		
	
		// Get a reference to a blob
		 blobClient = containerClient.getBlobClient("EXP2063405180007022709.xml");

		System.out.println("Uploading to Blob storage as blob:\t" + blobClient.getBlobUrl());

		// Upload the blob
		
		blobClient.downloadToFile("EXP2063405180007022709.xml");
		
		//blobClient.uploadFromFile("DK_ResponseAns27_Amendment.xml");	
	
		}

		catch(Exception e) {}

		
	}
	
	//yuva code
	
	/*
	 * public void ValidateResponse() {
	 * 
	 * 
	 * 
	 * String filepath="C:\\Users\\ych139\\Downloads\\"+UserTest.EDI+".xml"; File
	 * xmlFile = new File(filepath); DocumentBuilderFactory documentBuilderFactory =
	 * DocumentBuilderFactory.newInstance(); DocumentBuilder documentBuilder =
	 * documentBuilderFactory.newDocumentBuilder(); Document document =
	 * documentBuilder.parse(filepath);
	 * 
	 * String messageFunction =
	 * document.getElementsByTagName("messageFunction").item(0).getTextContent(); //
	 * System.out.println(messageFunction); String messageReference =
	 * document.getElementsByTagName("messageReference").item(0).getTextContent();
	 * String sendersReferenceNumber =
	 * document.getElementsByTagName("sendersReferenceNumber").item(0).
	 * getTextContent(); String carriersIDType =
	 * document.getElementsByTagName("carriersIDType").item(0).getTextContent();
	 * String cargoCarriersSCAC =
	 * document.getElementsByTagName("cargoCarriersSCAC").item(0).getTextContent();
	 * try { assertEquals("ORI", messageFunction);
	 * assertEquals(usertest.msgREF,messageReference );
	 * assertEquals(UserTest.cmpID,sendersReferenceNumber );
	 * assertEquals("EORI",carriersIDType ); assertEquals("MAEU",cargoCarriersSCAC);
	 * } catch(AssertionError e) { System.out.println("invalid data"); throw e; }
	 * System.out.println("valid data"); }
	 */
			

	public void UploadToBlobthroughService() {
		// TODO Auto-generated method stub
//		given().
//        multiPart("file", new File("/path/to/file")).
//when().
//        post("/upload"); 
		
		
		
		
		
		
//		 RestAssured resp=
//				 given()
//         .header(new Header("content-type", "multipart/form-data"))
//         .multiPart("file",new File( "C:\\\\Vijay\\\\GCD\\\\GCDAPITEST\\\\ISH000152_test.xml"))
//         .formParam("description", "This is my doc")
//         .when()
//         .post("https://gcd-operations-dev.maersk-digital.net/v1/responsefile/upload");
//        
//		
//		
		
		
//		//long before = getAllCount();
//      //  System.out.println(before);
//        File file = new File("omod-1.9/src/test/resources/formResourcefile.txt");
//        Assert.assertTrue(file.exists());
//
//        MockMultipartFile toUpload = new MockMultipartFile("value", "formresource.txt", "text/plain",
//                OpenmrsUtil.getFileAsBytes(file));
//
//        MockMultipartHttpServletRequest request = new MockMultipartHttpServletRequest();
//        request.setRequestURI(getBaseRestURI()+getURI());
//        request.setMethod(RequestMethod.POST.name());
//        request.setContentType("multipart/form-data");
//        request.addHeader("Content-Type", "multipart/form-data");
//
//        request.addFile(toUpload);    
//        MockHttpServletResponse response = handle(request);
		
		
		
		
		
		
		
		
		
		
		
		
		
		Response resp= 
				given().
				contentType("multipart/form-data").
		 header("content-type", "multipart/form-data").
				 multiPart("file", new File("C:\\Vijay\\GCD\\GCDAPITEST\\ISH000152_test.xml")).
				 when()
				.post("https://gcd-operations-dev.maersk-digital.net/v1//responsefile/upload");
		
		System.out.println(resp.getStatusCode());
	}
	
	
	
	}
