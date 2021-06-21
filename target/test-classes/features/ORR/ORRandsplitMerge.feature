@ORRBookingandSplitandCombine
Feature: Processing ORR booking

@ORRcombine01
Scenario Outline: To check the creation ORR combine booking 
When user create a BOL for ORR with "<Event>" and "<Messagetype>" for "ORRcombine"
Examples:
	|Event|Messagetype|
	|Shipment_Merge_or_Split|mergeSplitORRCombineMaingenerate|
	|Issue_Verify_Copy_of_TPDOC_Closed|mergeSplitORRCombineSEC|
	|Issue_Verify_Copy_of_TPDOC_Closed|mergeSplitORRCombineMain|
	
	
@ORRcombine02
Scenario Outline: To check the creation ORR combine booking 
When user create a BOL for ORR with "<Event>" and "<Messagetype>" for "ORRcombine"
Examples:
	|Event|Messagetype|
	|Issue_Verify_Copy_of_TPDOC_Closed|mergeSplitORRCombineSECgenerate|



	
	