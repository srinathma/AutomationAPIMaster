@regDQE
Feature: Processing DQE


@DQE01HSCodeUsingGDS
Scenario Outline:DQe-cargo for special characters
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then BOL data is post using post call for four wall testing for "<Event>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
    |Event|parameter|value|dqeApplicable|type|
    |Confirm_Shipment_Closed_TPDOC|CARGO|test@vij|N|NA|
    |Issue_Verify_Copy_of_TPDOC_Closed|CARGO|test@vij|N|NA|
    |Issue_Amended_Verify_Copy_of_TPDOC_Closed|CARGO|testvij|N|NA|
    
   
    

@DQE02HSCode
Scenario Outline:DQe-HS code invalid
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	  |Event|parameter|value|dqeApplicable|type|
    |Confirm_Shipment_Closed_TPDOC|HSCODE|test@vij|N|NA|
    |Issue_Verify_Copy_of_TPDOC_Closed|HSCODE|12|Y|NA|
    |Issue_Amended_Verify_Copy_of_TPDOC_Closed|HSCODE|123456|N|NA|
    
	
@DQE03HSCodeMissing
Scenario Outline:DQE-HS code is missing
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	  |Event|parameter|value|dqeApplicable|type|
    |Confirm_Shipment_Closed_TPDOC|HSCODE||N|NA|
    |Issue_Verify_Copy_of_TPDOC_Closed|HSCODE||Y|NA|
    |Issue_Amended_Verify_Copy_of_TPDOC_Closed|HSCODE|123456|N|NA|
	


	
@DQE05PackageTypeTpdoc
Scenario Outline: DQE-Package Type is missing on Cargo level
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test@vij|N|NA|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE||Y|NA|
