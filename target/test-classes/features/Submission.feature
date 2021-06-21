@SubmissionGenericScenarios
Feature: Submission for Finland

@Maerskoperator0111
Scenario Outline:Finland import compliance _ Maersk line operator/OOG Booking/Shipper Seal
When user create booking information for "<Event>" with "<operatorcode>" ,"<param1>" ,"<param1Value>","<param2>", "<param2value>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "N"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "N"
#Then Verify "staus" for the manifest for "<Event>"
Then BOL submitted automatically falls in submission timeline for "<Event>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "Approved"
Then Download the submission file from the container "<Event>" with "<operatorcode>"
Examples:
	|Event|operatorcode|param1|param1Value|param2|param2value|
	|CREATE|MSL|OOG|Y|Seal|Shipper Seal|
	|Schedule_Shipment_Closed|MSL|OOG|Y|Seal|Shipper Seal|
	|Issue_Verify_Copy_of_TPDOC_Closed|MSL|OOG|Y|Seal|Shipper Seal|

	
@SAFoperator02
Scenario Outline:Finland import compliance _Safmarine operator and port is transhipment/Dry container/Veterinarian seal
When user create booking information for "<Event>" with "<operatorcode>" ,"<param1>" ,"<param1Value>","<param2>", "<param2value>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "N"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "N"
Then BOL submitted automatically falls in submission timeline for "<Event>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "DKEXP"
Examples:
	|Event|operatorcode|param1|param1value|param2|param2value|
	|CREATE|SAF|containertype|DRY|Seal|Veterinarian Seal|
	|Schedule_Shipment_Closed|SAF|containertype|DRY|Seal|Veterinarian Seal|
	|Issue_Verify_Copy_of_TPDOC_Closed|SAF|containertype|DRY|Seal|Veterinarian Seal|
	
	
@Sealandoperator03
Scenario Outline:Finland import compliance _Sealand operator/Carrier Seal/Marks & Number more than 35 characters
When user create booking information for "<Event>" with "<operatorcode>" ,"<param1>" ,"<param1Value>","<param2>", "<param2value>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "N"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "N"
Then BOL submitted automatically falls in submission timeline for "<Event>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "DKEXP"
Examples:
	|Event|operatorcode|param1|param1Value|param2|param2value|
	|CREATE|SEA|Marksandnumber|marksandnumber123456678899998767898754567998765|Seal|Carrier|
	|Schedule_Shipment_Closed|SEA|Marksandnumber|marksandnumber123456678899998767898754567998765|Seal|Carrier|
	|Issue_Verify_Copy_of_TPDOC_Closed|SEA|Marksandnumber|marksandnumber123456678899998767898754567998765|Seal|Carrier|
	
@MaerskLimitedoperator04
Scenario Outline:Finland import compliance _Maersk Limited Inc/Customs Seal
When user create booking information for "<Event>" with "<operatorcode>" ,"<param1>" ,"<param1Value>","<param2>", "<param2value>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "N"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "N"
Then BOL submitted automatically falls in submission timeline for "<Event>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "DKEXP"
Examples:
	|Event|operatorcode|param1|param1Value|param2|param2value|
	|CREATE|MLL|Marksandnumber|marksandnumber123456678899998767898754567998765|Seal|Custom|
	|Schedule_Shipment_Closed|MLL|Marksandnumber|marksandnumber123456678899998767898754567998765|Seal|Custom|
	|Issue_Verify_Copy_of_TPDOC_Closed|MLL|Marksandnumber|marksandnumber123456678899998767898754567998765|Seal|Custom|
	
@MSegolineoperator05
Scenario Outline:_Finland import compliance _Seagoline Operator
When user create booking information for "<Event>" with "<operatorcode>" ,"<param1>" ,"<param1Value>","<param2>", "<param2value>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "N"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "N"
Then BOL submitted automatically falls in submission timeline for "<Event>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "DKEXP"
Examples:
	|Event|operatorcode|param1|param1Value|param2|param2value|
	|CREATE|SGL|OOG|Y|Seal|Shipper Seal|
	|Schedule_Shipment_Closed|SGL|OOG|Y|Seal|Shipper Seal|
	|Issue_Verify_Copy_of_TPDOC_Closed|SGL|OOG|Y|Seal|Shipper Seal|	
	
	
	
@BB05 @specialScenarios
Scenario Outline:Finland break bulk compliance
When user create booking information for "<Event>" for "<type>" 
Then call "getBOLService" for "<Event>" to validate with "N"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "N"
Then BOL submitted automatically falls in submission timeline for "<Event>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "DKEXP"
Examples:
	|Event|type|
	|CREATE|BB|
	|Schedule_Shipment_Closed|BB|
	|Issue_Verify_Copy_of_TPDOC_Closed|BB|
	
@CC05 @specialScenarios
Scenario Outline:Finland CC cargo compliance
When user create booking information for "<Event>" for "<type>" 
Then call "getBOLService" for "<Event>" to validate with "N"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "N"
Then BOL submitted automatically falls in submission timeline for "<Event>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "DKEXP"
Examples:
	|Event|type|
	|CREATE|CC|
	|Schedule_Shipment_Closed|CC|
	|Issue_Verify_Copy_of_TPDOC_Closed|CC|
	
@downloadFile
Scenario: Finland import compliance _ Maersk line operator/OOG Booking/Shipper Seal
Then download the file



