@GCDDRegsubmissionDKimp
Feature: Processing DQE

@DQE06BBbookingreg @special
Scenario Outline: submission for BB booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test|N|BB|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|BB|	

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
	
	
@DQE10OOGbooking @special
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
	

@DQE13DrycontregDKimp
Scenario Outline: submission for multiple cargo line with Dry container
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|SEALNO|seal12|N|Multiple|
	|Issue_Verify_Copy_of_TPDOC_Closed|SEALNO|seal12|N|Multiple|





@DQE09Refbooking @special
Scenario Outline: submission for Refer non DG booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test12|N|REF|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|REF|
	
		
#need to add one scenarion for dry container --- use multiple one	
#seal update plus   ---  Seal Number Changed  +multiple cargo      --- done   
#dangerous -- db.bookingSegment.find( { "referenceNumber" : "AAAISHRWT08KB"} )    200099520  
#ORR     
#Tpdoc cancelation    ---- TPDOC_Removed    done
#MRN   NA for TZ
#TZ vehicle cargo   -- missing reference   EKTA
