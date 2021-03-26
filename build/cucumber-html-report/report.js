$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("japancompliance.feature");
formatter.feature({
  "line": 2,
  "name": "Processing Japan Advance compliances in GMS",
  "description": "",
  "id": "processing-japan-advance-compliances-in-gms",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@GCDBOLAPI"
    }
  ]
});
formatter.before({
  "duration": 831523000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "To check the creation BOL using post call",
  "description": "",
  "id": "processing-japan-advance-compliances-in-gms;to-check-the-creation-bol-using-post-call",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@APIcall01"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#When BOL data is post using post call"
    }
  ],
  "line": 7,
  "name": "call Get Bol service to validate",
  "keyword": "Then "
});
formatter.match({
  "location": "APItestStepDef.call_Get_Bol_service_to_validate()"
});
formatter.result({
  "duration": 191746400,
  "error_message": "java.lang.NullPointerException\r\n\tat apiTest.UserTest.GetRequestBilloflading(UserTest.java:55)\r\n\tat stepdefs.APItestStepDef.call_Get_Bol_service_to_validate(APItestStepDef.java:36)\r\n\tat ✽.Then call Get Bol service to validate(japancompliance.feature:7)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 884400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "To check the creation BOL using post call",
  "description": "",
  "id": "processing-japan-advance-compliances-in-gms;to-check-the-creation-bol-using-post-call",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@APIcall01"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#When BOL data is post using post call"
    }
  ],
  "line": 7,
  "name": "call Get Bol service to validate",
  "keyword": "Then "
});
formatter.match({
  "location": "APItestStepDef.call_Get_Bol_service_to_validate()"
});
formatter.result({
  "duration": 252000,
  "error_message": "java.lang.NullPointerException\r\n\tat apiTest.UserTest.GetRequestBilloflading(UserTest.java:55)\r\n\tat stepdefs.APItestStepDef.call_Get_Bol_service_to_validate(APItestStepDef.java:36)\r\n\tat ✽.Then call Get Bol service to validate(japancompliance.feature:7)\r\n",
  "status": "failed"
});
});