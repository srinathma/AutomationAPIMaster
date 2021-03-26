@FinlandRegression011
Feature: Submission for Finland

@Maerskoperator011
Scenario Outline:Finland import compliance _ Maersk line operator/OOG Booking/Shipper Seal
When user create booking information for "<Event>" with "<operatorcode>" ,"<param1>" ,"<param1Value>","<param2>", "<param2value>"
Then BOL data is post using post call
Then call Get Bol service for "<Event>" to validate
Then BOL submitted automatically falls in submission timeline for "<Event>"
Examples:
	|Event|operatorcode|param1|param1Value|param2|param2value|
	|CREATE|MLL|OOG|Y|Seal|Shipper Seal|
	|Schedule_Shipment_Closed|MLL|OOG|Y|Seal|Shipper Seal|
	|Issue_Verify_Copy_of_TPDOC_Closed|MLL|OOG|Y|Seal|Shipper Seal|

	
				
@DQE10PackageCount11
Scenario Outline:DQE-package count exceeds 99999
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call Get Bol service for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|packageCount|9999999|N|
	|Schedule_Shipment_Closed|packageCount|9999999|N|
	|Issue_Verify_Copy_of_TPDOC_Closed|packageCount|9999999|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|packageCount|999|N|
	
	
@DQE13SealNumberMissing033
Scenario Outline: DQE-Seal Number is missing
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call Get Bol service for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|sealNumber||N|
	|Schedule_Shipment_Closed|sealNumber||N|
	|Issue_Verify_Copy_of_TPDOC_Closed|sealNumber||Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|sealNumber|ASD001|N|		

@GetDataFromJSON
Scenario Outline: DQE-Seal Number is missing
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Then BOL submitted automatically falls in submission timeline for "<Event>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|packageCount|999|N|
	|Schedule_Shipment_Closed|packageCount|999|N|
	|Issue_Verify_Copy_of_TPDOC_Closed|packageCount|999|N|
	
@Upload
Scenario: DQE-Seal Number is missing
When user upload "Approved" response