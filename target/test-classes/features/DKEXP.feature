@DKEXPDQE
Feature: Processing DQE

@DQE04PackageTypeCargo @Packagetype
Scenario Outline:  DQE-Package Type is missing on cargo level
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|packageStyleAltText||N_TPDOC|
	|Schedule_Shipment_Closed|packageStyleAltText|box|N_TPDOC|
	|Issue_Verify_Copy_of_TPDOC_Closed|packageStyleAltText|box|Y_TPDOC|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|packageStyleAltText|boxbox|N_TPDOC|	
	
@DQE04PackageTypeCarg
Scenario Outline:  DQE-Package Type is missing on cargo level
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>"
Then BOL data is post using post call
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|
	|CREATE|packageStyleAltText||N|
	|Schedule_Shipment_Closed|packageStyleAltText|box|N|
	|Issue_Verify_Copy_of_TPDOC_Closed|packageStyleAltText|box|Y|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|packageStyleAltText|boxbox|N|	