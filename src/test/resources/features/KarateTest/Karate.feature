@ORRBookingandSplitandCombine
Feature: Processing ORR booking

@testKarate
Scenario: Testing valid GET endpoint
Given header X-API-KEY = '69ba14f0-2edb-4b87-96ca-789125790b09'
    And header X-APP-ID = 'GCD'
    When url 'https://gcd-billoflading-qa.maersk-digital.net/v1/billoflading/getBolById/VJJ427119'
	When method GET
	Then status 200



	
	