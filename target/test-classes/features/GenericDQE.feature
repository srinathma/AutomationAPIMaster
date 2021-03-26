@GGenericDQE
Feature: Processing DQE

@DQE01PackageCount
Scenario Outline: DQE-package count is 0 or blank
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|packageCount|0|N|
	|Schedule_Shipment_Closed|packageCount|0|N|
	|Issue_Verify_Copy_of_TPDOC_Closed|packageCount|0|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|packageCount|33|N|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|packageCount||Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|packageCount|33|N|
	
	
@DQE13HSCodeMissing
Scenario Outline:DQE-HS code is missing
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|hsCode||N|
	|Schedule_Shipment_Closed|hsCode||N|
	|Issue_Verify_Copy_of_TPDOC_Closed|hsCode||Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|hsCode|333000|N|
	
@DQE14CargoDesc
Scenario Outline:DQE-cargo description is more than xx characters
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|cargoDescText|cargodescriptiontext123|N|
	|Schedule_Shipment_Closed|cargoDescText|cargodescriptiontext123|N|
	|Issue_Verify_Copy_of_TPDOC_Closed|cargoDescText|cargodescriptiontext123|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|cargoDescText|cargo|N|	
	
@DQE15CargoDescRestrictedkeywordcargolevel
Scenario Outline:DQE-cargo description is more than xx characters
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|cargoDescText|cargodescriptionRestrictedKeywords|N|
	|Schedule_Shipment_Closed|cargoDescText|cargodescriptionRestrictedKeywords|N|
	|Issue_Verify_Copy_of_TPDOC_Closed|cargoDescText|cargodescriptionRestrictedKeywords|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|cargoDescText|cargo|N|	
	
@DQE15CargoDescRestrictedkeywordtpdoclevel
Scenario Outline:DQE-cargo description is more than xx characters
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|cargoDescText|cargodescriptionRestrictedKeywords|N|
	|Schedule_Shipment_Closed|cargoDescText|cargodescriptionRestrictedKeywords|N|
	|Issue_Verify_Copy_of_TPDOC_Closed|cargoDescText|cargodescriptionRestrictedKeywords|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|cargoDescText|cargo|N|	
@DQE16marksandNumbercargo
Scenario Outline:DQE-cargo description is more than xx characters
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|cargoDescText||N|
	|Schedule_Shipment_Closed|cargoDescText||N|
	|Issue_Verify_Copy_of_TPDOC_Closed|cargoDescText||Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|marks|cargo|N|	
@DQE17marksandNumbertpdoc
Scenario Outline:DQE-cargo description is more than xx characters
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|cargoDescText||N|
	|Schedule_Shipment_Closed|cargoDescText||N|
	|Issue_Verify_Copy_of_TPDOC_Closed|cargoDescText||Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|marks|cargo|N|										