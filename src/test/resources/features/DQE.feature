@GCDDQEGeneric
Feature: Processing DQE

	
@DQE02CargoDesc
Scenario Outline: DQE-cargo description is is less than 3 and greater than 250 characters
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|cargoDescText|ab|N|
	|Schedule_Shipment_Closed|cargoDescText|ab|N|
	|Issue_Verify_Copy_of_TPDOC_Closed|cargoDescText|ab|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|cargoDescText|abcd|N|	
	
@DQE01CargoDesc
Scenario Outline: DQE-cargo description is is less than 3 and greater than 250 characters
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|cargoDescText|ab|N|
	|Schedule_Shipment_Closed|cargoDescText|ab|N|	
	|Issue_Verify_Copy_of_TPDOC_Closed|cargoDescText|abcdfghjklkjhgrtyuiutyhghhjklkujyhghjklkyuioiuyttyuioiuytrtyuiopoiuytrtyuiooiuytrtyuioiuytrtyuioiuytrtyuioiuyrtyuiouytrtyuioiuyrtyuioiuyrtyupoiuyrtyuiiuytrtyioiuytrtyuioiuyrtyuioiuyrtyuiuytrtyuioiuytrtyiouytrtyuiouyertyuioiuytyuiooiuytrtyuiuyttyuiuytr|Y|	
      
	
@DQE03PackageTypeTpdoc @Packagetype
Scenario Outline: DQE-Package Type is missing on tpdoc level
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|packageStyleAltText||N_TPDOC|
	|Schedule_Shipment_Closed|packageStyleAltText||N_TPDOC|
	|Issue_Verify_Copy_of_TPDOC_Closed|packageStyleAltText||Y_TPDOC|
	
	
@DQE04PackageTypeCargo @Packagetype
Scenario Outline:  DQE-Package Type is missing on cargo level
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|packageStyleAltText||N|
	|Schedule_Shipment_Closed|packageStyleAltText||N|
	|Issue_Verify_Copy_of_TPDOC_Closed|packageStyleAltText||Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|packageStyleAltText|box|N|	
	
@DQE05PackageType6charactersTpdoc @Packagetype
Scenario Outline: DQE-Package Type is not of 6 character on tpdoc level 
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|packageStyleAltText|box|N_TPDOC|
	|Schedule_Shipment_Closed|packageStyleAltText|box|N_TPDOC|
	|Issue_Verify_Copy_of_TPDOC_Closed|packageStyleAltText|box|Y_TPDOC|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|packageStyleAltText|boxasd|N_TPDOC|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|packageStyleAltText|boxasdrty|Y_TPDOC|	
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|packageStyleAltText|boxasd|N_TPDOC|	
		
@DQE06PackageType6charactersCargo @Packagetype
Scenario Outline: DQE-Package Type is not of 6 character on cargo level
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|packageStyleAltText|box|N|
	|Schedule_Shipment_Closed|packageStyleAltText|box|N|
	|Issue_Verify_Copy_of_TPDOC_Closed|packageStyleAltText|box|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|packageStyleAltText|boxasd|N|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|packageStyleAltText|boxasdrty|Y|	
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|packageStyleAltText|boxasd|N|	   

@DQE07PackageCount
Scenario Outline:DQE-package count exceeds 99999
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|packageCount|999|N|
	|Schedule_Shipment_Closed|packageCount|999|N|
	|Issue_Verify_Copy_of_TPDOC_Closed|packageCount|100000|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|packageCount|999|N|


		
	
	

#finland additional DQE

@DQE10PackageCount
Scenario Outline:DQE-package count exceeds 99999
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|packageCount|9999999|N|
	|Schedule_Shipment_Closed|packageCount|9999999|N|
	|Issue_Verify_Copy_of_TPDOC_Closed|packageCount|9999999|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|packageCount|999|N|

		
@DQE11SealDuplicate
Scenario Outline: DQE-Seal Number is duplicate
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|sealNumber|Asd001|N|
	|Schedule_Shipment_Closed|sealNumber|Asd001|N|
	|Issue_Verify_Copy_of_TPDOC_Closed|sealNumber|Asd001|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|sealNumber|Asd001|N|	



@DQE13SealNumberMissing
Scenario Outline: DQE-Seal Number is missing
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|sealNumber||N|
	|Schedule_Shipment_Closed|sealNumber||N|
	|Issue_Verify_Copy_of_TPDOC_Closed|sealNumber||Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|sealNumber|ASD001|N|		
				
@DQE14SealNumberValues
Scenario Outline: DQE-Seal Number has N/A, NA, NONE, NS, or UNKNOWN values
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|sealNumber|NA|N|
	|Schedule_Shipment_Closed|sealNumber|NA|N|
	|Issue_Verify_Copy_of_TPDOC_Closed|sealNumber|NA|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|sealNumber|ASD001|N|		
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|sealNumber|N/A|Y|		
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|sealNumber|ASD001|N|	
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|sealNumber|NONE|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|sealNumber|ASD001|N|	
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|sealNumber|NS|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|sealNumber|ASD001|N|	
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|sealNumber|UNKNOWN|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|sealNumber|ASUNKNOWNDE|N|			
									
							
#Additional DQE
@DQE15DocaddConsgineeSpecialCharacter
Scenario Outline: DQE-Parties doc address has special character for highest priortized consginee_only Consignee
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|ConsigneedocAddress||N|
	|Schedule_Shipment_Closed|ConsigneedocAddress||N|
	|Issue_Verify_Copy_of_TPDOC_Closed|ConsigneedocAddress||Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|ConsigneedocAddress|Denmark|N|	
	
@DQE16DocaddShipperSpecialCharacter
Scenario Outline: DQE-Parties doc address has special character for highest priortized shipper_only shipper
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|shipperdocAddress||N|
	|Schedule_Shipment_Closed|shipperdocAddress||N|
	|Issue_Verify_Copy_of_TPDOC_Closed|shipperdocAddress||Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|shipperdocAddress|Denmark|N|	
	
@DQE07SOCEmpty
Scenario Outline: DQE-cargo description  has special character for tpdoc print level
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|SOC|002306-11-Empty Keg|N|
	|Schedule_Shipment_Closed|SOC|002306-11-Empty Keg|N|
	|Issue_Verify_Copy_of_TPDOC_Closed|SOC|002306-11-Empty Keg|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|SOC|002306-11-Empty Keg|N|
	



@Testfeature
Scenario: To describe how this works
When we try to learn cucumber stepdef
Then we create stepdefenitions using "java"

 	

		

							


			