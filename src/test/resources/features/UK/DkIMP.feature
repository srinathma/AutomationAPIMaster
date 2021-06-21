@FROBcmpCreation
Feature: Veryfy the compliance creation on frob port

@DQE01frobGB
Scenario Outline: sCreation of GB frob compliance MSL
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test|N|BB|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|BB|	
