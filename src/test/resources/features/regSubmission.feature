@GCDDRegsubmission
Feature: Processing Submission

@AVROchangegeneral
Scenario Outline: submission for general
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
|Event|parameter|value|dqeApplicable|type|
|Confirm_Shipment_Closed_TPDOC|PACKGE|test|N|csMulticargo|
|Issue_Verify_Copy_of_TPDOC_Closed|PKG_KND|ishaan|N|ivcmultiCargoLine|

@AVROchange12
Scenario Outline: submission for BB booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
|Event|parameter|value|dqeApplicable|type|
|Confirm_Shipment_Closed_TPDOC|PACKGE|test|N|csBseg|
|Issue_Verify_Copy_of_TPDOC_Closed|PKG_KND|ishaan|N|general|
	
@AVROchangeAidCargo
Scenario Outline: submission for MilitaryCargo booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test|N|csBseg|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|aidCargoIVC|
	
@AVROchangeMilCargo1
Scenario Outline: submission for MilitaryCargo booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test|N|csBseg|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|milCargo|
	
	


@AVROchangeAMD
Scenario Outline: submission for BB booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|IVCReefNONDG|
		
@AVROchangeAMD1
Scenario Outline: submission for BB booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|TPDOC_Removed|HSCODE|993456|N|removal|	


@DQE06BBbookingreg11 @special
Scenario Outline: submission for BB booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test|N|IVCBB|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|IVCBB|	


@DQE07CCbooking @special
Scenario Outline: submission for CC booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|1|N|CC|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|CC|	


@DQE09Refbooking @special
Scenario Outline: submission for Refer non DG booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test12|N|REF|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|REF|
	
	
@DQE10OOGbooking11 @special
Scenario Outline: submission for OOG booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE||N|OOG|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|OOG|
	

@DQE11SealUpdate1 @special
Scenario Outline: submission after seal update event
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|SEALNO|seal12|N|Multiple|
	|Issue_Verify_Copy_of_TPDOC_Closed|SEALNO|seal12|N|Multiple|
	
	

@DQE12TpdocRemovalReg @special
Scenario Outline: BOL cancellation check
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|SEALNO|seal12|N|Multiple|
	|Issue_Verify_Copy_of_TPDOC_Closed|SEALNO|seal12|N|Multiple|
	|TPDOC_Removed|SEALNO|sealchanged|N|Multiple|
	

@DQE13Drycontreg1 @special
Scenario Outline: submission for multiple cargo line with Dry container
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|SEALNO|NA|N|Multiple|
	|Issue_Verify_Copy_of_TPDOC_Closed|SEALNO|NA|N|Multiple|
	

@DQE13Drycontreg1 @special
Scenario Outline: submission for multiple cargo line with Dry container
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|SEALNO|NA|N|Multiple|
	|Issue_Verify_Copy_of_TPDOC_Closed|SEALNO|NA|N|Multiple|
	
@DQE13Drycontreg1 @special
Scenario Outline: submission for multiple cargo line with Dry container
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|SEALNO|NA|N|Multiple|
	|Issue_Verify_Copy_of_TPDOC_Closed|SEALNO|NA|N|Multiple|




@DQE09Refbooking @special
Scenario Outline: submission for Refer non DG booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test12|N|REF|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|REF|
	
		
