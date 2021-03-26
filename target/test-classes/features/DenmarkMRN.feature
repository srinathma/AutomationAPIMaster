@DenmarkImportsMRN
Feature: DK_Imports MRN
@MRNBooking
Scenario Outline: Adding MRN for Non-EU countries
When user Add MRN number for "<country>","<tpdoc>","<vesselcode>","<arrivalvoyageno>","<receiverport>","<mrncustomsno>","<departurevoyageno>","<dischargeport>","<compstatus>","<comploadstatus>","<customsresp>","<senttime>","<entryportETA>","<attached>"

Examples:
	|country|tpdoc|vesselcode|arrivalvoyageno|receiverport|mrncustomsno|departurevoyageno|dischargeport|compstatus|comploadstatus|customsresp|senttime|entryportETA|attached|
	|DKIMP|507311283|F6M|042E|DKAARPT|20FI000001117448I6|042E|DEBRVTM|Ok|Ok|Ok|2020-10-25 15:20:43|2020-10-27 04:00:00|Y|