Feature:Test the KSRTC applicaton
Scenario Outline:Test the login page with valid details
Given Open chrome browser and url of the application
When Enter "<Username>" , "<Password>" and click on login button
Then Success in login

Examples:
|Username					|Password				|
|abcdefghi				|HCL123					|
|jklmnopqr				|HCL123					|
|stuvwxyz					|HCL123					|