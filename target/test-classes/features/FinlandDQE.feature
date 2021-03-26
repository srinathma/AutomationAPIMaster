@GCDDQEFinland
Feature: Processing DQE


@DQE06BBbooking @special
Scenario Outline: submission for BB booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test12|N|BB|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|BB|	

@DQE01HSCodeUsingGDS1
Scenario Outline:DQe-cargo for special characters
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then BOL data is post using post call for four wall testing for "<Event>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
    |Event|parameter|value|dqeApplicable|type|
    |Confirm_Shipment_Closed_TPDOC|CARGO|test@vij|N|NA|
    |Issue_Verify_Copy_of_TPDOC_Closed|CARGO|IAVCdata|N|NA|
    |Confirm_Shipment_Closed_TPDOC|CARGO|test@vij|N|NA|
    |Confirm_Shipment_Closed_TPDOC|CARGO|test@vij|N|NA|
    
   
    

@DQE02HSCode
Scenario Outline:DQe-HS code invalid
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	  |Event|parameter|value|dqeApplicable|type|
    |Confirm_Shipment_Closed_TPDOC|HSCODE|test@vij|N|NA|
    |Issue_Verify_Copy_of_TPDOC_Closed|HSCODE|12|Y|NA|
    |Issue_Amended_Verify_Copy_of_TPDOC_Closed|HSCODE|123456|N|NA|
    
	
@DQE03HSCodeMissing
Scenario Outline:DQE-HS code is missing
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	  |Event|parameter|value|dqeApplicable|type|
    |Confirm_Shipment_Closed_TPDOC|HSCODE||N|NA|
    |Issue_Verify_Copy_of_TPDOC_Closed|HSCODE||Y|NA|
    |Issue_Amended_Verify_Copy_of_TPDOC_Closed|HSCODE|123456|N|NA|
	

@DQE04CargoDescTpdoclevel
Scenario Outline:_ DQE-cargo description is is less than 3 and greater than 250 characters for tpdoc level
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then BOL data is post using post call for four wall testing for "<Event>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
    |Event|parameter|value|dqeApplicable|type|
    |Confirm_Shipment_Closed_TPDOC|CARGO|test@vij|N|NA|
    |Issue_Verify_Copy_of_TPDOC_Closed|CARGO|test@vij|N|NA|
    |Issue_Amended_Verify_Copy_of_TPDOC_Closed|CARGO|IAVCdata|N|NA|
    |Issue_Amended_Verify_Copy_of_TPDOC_Closed|CARGO|abcdfghjklkjhgrtyuiutyhghhjklkujyhghjklkyuioiuyttyuioiuytrtyuiopoiuytrtyuiooiuytrtyuioiuytrtyuioiuytrtyuioiuyrtyuiouytrtyuioiuyrtyuioiuyrtyupoiuyrtyuiiuytrtyioiuytrtyuioiuyrtyuioiuyrtyuiuytrtyuioiuytrtyiouytrtyuiouyertyuioiuytyuiooiuytrtyuiuyttyuiuytr|Y|NA|	
   	



	
@DQE05PackageTypeTpdoc
Scenario Outline: DQE-Package Type is missing on Cargo level
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test@vij|N|NA|
	|Schedule_Shipment_Closed|PACKGE||N_TPDOC|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE||Y|
	

@DQE06BBbooking @special
Scenario Outline: submission for BB booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test|N|BB|
	|Schedule_Shipment_Closed|PACKGE|123|N|BB|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|BB|	

@DQE07CCbooking @special
Scenario Outline: submission for CC booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|1|N|CC|
	|Schedule_Shipment_Closed|PACKGE||N|CC|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|CC|
		
@DQE08Transbooking
Scenario Outline: submission for Transhipment booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test12|N|Trans|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|Trans|

@DQE09Refbooking @special
Scenario Outline: submission for Refer non DG booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test12|N|REF|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|REF|
	
@DQE10OOGbooking @special
Scenario Outline: submission for OOG booking
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Confirm_Shipment_Closed_TPDOC|PACKGE|test12|N|OOG|
	|Schedule_Shipment_Closed|PACKGE|N||OOG|
	|Issue_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|OOG|
	