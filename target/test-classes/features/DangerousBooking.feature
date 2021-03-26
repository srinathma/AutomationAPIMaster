@DangerousBookingFinland
Feature: Dangerous Booking for Finland

@DangerousBooking
Scenario Outline:Finland import compliance for DangerousBooking
When user create booking information dangerous booking for "<Event>" with "<operatorcode>" ,"<scaccode>", "<isoog>", "<containertype>" ,"<undgnumber>", "<param2value>"
Then call Get Bol service to validate
When call GETComplianceObject service to validate using compliance ID for "<Event>" for "<containertype>"
Then BOL submitted automatically falls in submission timeline for "<Event>"

Examples:
		|Event|operatorcode|scaccode|isoog|containertype|undgnumber|param2value|complaincestatus|
		|CREATE|MSL|MAEU|Y|BULK|1122|Shipper Seal|Awaiting SI Processing|
		|Schedule_Shipment_Closed|MSL|MAEU|Y|BULK|1122|Shipper Seal|Awaiting SI Processing|
		|Issue_Verify_Copy_of_TPDOC_Closed|MSL|MAEU|Y|BULK|1122|Shipper Seal|Ready For Submission|
		|Issue_Verify_Copy_of_TPDOC_Closed|MSL|MAEU|Y|BULK|1122|Shipper Seal|Approved|
		
@Cargolines
Scenario Outline:Finland import compliance for Cargolines
When user create booking information dangerous booking for "<Event>" with "<operatorcode>" ,"<scaccode>"
Then call Get Bol service to validate
When call GETComplianceObject service to validate using compliance ID for "<Event>" for "<containertype>"
Then BOL submitted automatically falls in submission timeline for "<Event>"

Examples:
		|Event|operatorcode|scaccode|complaincestatus|
		|CREATE|MSL|MAEU|Awaiting SI Processing|
		|Issue_Verify_Copy_of_TPDOC_Closed|MSL|MAEU|Ready For Submission|
		|Issue_Verify_Copy_of_TPDOC_Closed|MSL|MAEU|Approved|	
		

@BB
Scenario Outline:Finland import compliance for BB Booking
When user create booking information dangerous booking for BB "<Event>" with "<operatorcode>" ,"<scaccode>","<cargomode>"
Then call Get Bol service to validate
When call GETComplianceObject service to validate using compliance ID for "<Event>" for "<containertype>"
Then BOL submitted automatically falls in submission timeline for "<Event>"

Examples:
		|Event|operatorcode|scaccode|complaincestatus|cargomode|
		|CREATE|MSL|MAEU|Awaiting SI Processing|BB|
		|Issue_Verify_Copy_of_TPDOC_Closed|MSL|MAEU|Ready For Submission|BB|
		|Issue_Verify_Copy_of_TPDOC_Closed|MSL|MAEU|Approved|BB|
		
@CC
Scenario Outline:Finland import compliance for CC Booking
When user create booking information dangerous booking for CC "<Event>" with "<operatorcode>" ,"<scaccode>","<cargomode>"
Then call Get Bol service to validate
When call GETComplianceObject service to validate using compliance ID for "<Event>" for "<containertype>"
Then BOL submitted automatically falls in submission timeline for "<Event>"

Examples:
		|Event|operatorcode|scaccode|complaincestatus|cargomode|
		|CREATE|MSL|MAEU|Awaiting SI Processing|CC|
		|Issue_Verify_Copy_of_TPDOC_Closed|MSL|MAEU|Ready For Submission|CC|
		|Issue_Verify_Copy_of_TPDOC_Closed|MSL|MAEU|Approved|CC|		
		
		
		
		