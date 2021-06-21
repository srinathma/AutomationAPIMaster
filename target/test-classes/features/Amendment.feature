@Amendment
Feature: Amendment Creation,Submission and Validation

@ContainerNoChange
Scenario Outline: Amendment Validation for Container no. change
When user amends booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|utyyututu|UPDT12|AMD|general|
	
@PackageKindChange
Scenario Outline: Amendment Validation for package kind change
When user amends booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|PKG_KND|boxess|AMD|general|	
	
@PackageCountChange
Scenario Outline: Amendment Validation for package count change
When user amends booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|PKG_COUNT|234|AMD|general|	
	
	
@VolumeChange
Scenario Outline: Amendment Validation for volume cbm change
When user amends booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|VOLUME|789|AMD|general|
	
@ModeOfTransportChange
Scenario Outline: Amendment Validation for mode of transport change
When user amends booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|MOD_OF_TRANS|FEO|AMD|general|			
	
@ReefTempChange
Scenario Outline: Amendment Validation for reefer temperature change flash pointdanger
When user amends booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|TEMP_C|-4|AMD|Reefer|
	
@BillTypeChange
Scenario Outline: Amendment Validation for bill type change
When user amends booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|BILL_TYPE|negotiable|AMD|Reefer|
	
@LoadPortChange
Scenario Outline: Amendment Validation for bill type change
When user amends booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|LD_PORT|DEBRV|AMD|general|	
	
@CargoDescChange
Scenario Outline: Amendment Validation for cargo description change
When user amends booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|CARGO_DESC_DOC|234|AMD|general|	
	
@MarksnoChange
Scenario Outline: Amendment Validation for marks and no change change
When user amends booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|MARKS_DESC_DOC|234|AMD|general|	
	
@ContainerTypeChange
Scenario Outline: Amendment Validation for Container type change
When user amends booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|CON_TYPE|CONT12332|AMD|general|	
	

@ContainerSizeChange
Scenario Outline: Amendment Validation for Container size change
When user amends booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|CON_SIZE|CONT12332|AMD|general|
	
@SealNoChange
Scenario Outline: Amendment Validation for seal no. change
When user amends booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
Examples:
	|Event|parameter|value|dqeApplicable|type|
	|Issue_Amended_Verify_Copy_of_TPDOC_Closed|SEAL_NUMBER|CONT12332|AMD|general|		
	
@DichargePortAmendment
Scenario Outline: Amendment validation for Discharge Port
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
|Event|parameter|value|dqeApplicable|type|
|Issue_Amended_Verify_Copy_of_TPDOC_Closed|DP_PORT|DKAAR|AMD|general|

@HSCodeAmendment
Scenario Outline: Amendment validation for HSCODE Amendment
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
|Event|parameter|value|dqeApplicable|type|
|Issue_Amended_Verify_Copy_of_TPDOC_Closed|HS_CODE|220022|AMD|general|

@DangerousUNNoAmendment
Scenario Outline: Amendment validation for HSCODE Amendment
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
|Event|parameter|value|dqeApplicable|type|
|Issue_Amended_Verify_Copy_of_TPDOC_Closed|UN_NO|111|AMD|dang|

@ChangeTareWeightAmendment
Scenario Outline: Amendment validation for TareWeight Amendment
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
|Event|parameter|value|dqeApplicable|type|
|Issue_Amended_Verify_Copy_of_TPDOC_Closed|Tare_Wt_Kgs|1440.000|AMD|general|






	
@MovementtypeAmendment
Scenario Outline: Amendment validation for Movement type
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
|Event|parameter|value|dqeApplicable|type|
|Issue_Amended_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|general|	


@SealtypeAmendment
Scenario Outline: Amendment validation for Seal type
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
|Event|parameter|value|dqeApplicable|type|
|Issue_Amended_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|general|	
	
@DangerouscontainernumberAmendment
Scenario Outline: Amendment validation for Dangeorus container number
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
|Event|parameter|value|dqeApplicable|type|
|Issue_Amended_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|general|	
	
	
@DangerousunnumberAmendment
Scenario Outline: Amendment validation for Dangeorus Unnumber
When user create booking information for "<Event>" with "<parameter>" having "<value>" with "<dqeApplicable>" for "<type>"
#Then call "getBOLService" for "<Event>" to validate with "<dqeApplicable>"
#Then call "getComplianceUsingTpdocandBOL" for "<Event>" to validate with "<dqeApplicable>"
Examples:
|Event|parameter|value|dqeApplicable|type|
|Issue_Amended_Verify_Copy_of_TPDOC_Closed|PACKGE|carton|N|general|		