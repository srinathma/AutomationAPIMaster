@regGCDDRegsubmission
Feature: Processing DQE

@regDQE06BBbookingreg
Scenario Outline: submission for BB booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test|N|BB|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|BB|	

@regDQE07CCbooking
Scenario Outline: submission for CC booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|1|N|CC|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|CC|	


@regDQE09Refbooking
Scenario Outline: submission for Refer non DG booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test12|N|REF|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|REF|
	
	
@regDQE10OOGbooking
Scenario Outline: submission for OOG booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test12|N|OOG|
	|Schedule_Shipment_Closed|PACKGE|N||OOG|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|OOG|
	
@DQE11SealUpdate @special
Scenario Outline: submission after seal update event
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|SEALNO|seal12|N|Multiple|
	|Issue_Verify_Copy_of_TPDOC_Closed|SEALNO|seal12|N|Multiple|
	|Related_Seal_Number_Changed|SEALNO|sealchanged|N|Multiple|
	

@DQE12TpdocRemovalReg @special
Scenario Outline: BOL cancellation check
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|TPDOC_Removed|SEALNO|sealchanged|N|Multiple|
	

@regresDQE13Drycontreg
Scenario Outline: submission for multiple cargo line with Dry container
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|SEALNO|seal12|N|Multiple|
	|Issue_Verify_Copy_of_TPDOC_Closed|SEALNO|seal12|N|Multiple|





@regDQE09Refbooking
Scenario Outline: submission for Refer non DG booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test12|N|REF|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|REF|
	
		
