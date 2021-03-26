@DQERFS
Feature: DQE_RFS
@DQERFS
Scenario Outline:DQE-HS code is missing
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
	  |Event|parameter|value|dqeApplicable|type|
    |Confirm_Shipment_Closed_TPDOC|HSCODE||N|NA|
    |Issue_Verify_Copy_of_TPDOC_Closed|HSCODE||Y|NA|
    |Issue_Amended_Verify_Copy_of_TPDOC_Closed|HSCODE|123456|N|NA|