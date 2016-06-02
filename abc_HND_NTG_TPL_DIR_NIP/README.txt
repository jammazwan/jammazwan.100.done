Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area, catch exceptions and deal with them with a handler
    - in at least one area, use an integration test to confirm that actual message or recipients conform to expectations
PSEUDOCODE FOR ROUTES
    - template.sendBody([some String by you]) FROM INSIDE JUNIT TEST
    [1st route]
    - your message body is now a simple string
    - transform the string using a Processor, by modifying the existing string in the IN message
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - FTP this to a named folder, using the file name of 'Important', suffixed with a timestamp, and '.txt'
FOR EXTRA CREDIT:
    - modify to create your camel contex in java
    - add a script, or manually if only option, deploying to a EAP
    - write your routes in xml, unless you already did in your first pass



