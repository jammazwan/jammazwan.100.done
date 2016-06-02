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
    - transform the string using a Processor, but alter the string to the OUT message, leaving the IN message as is
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - use the Routing Slip EIPattern to create dispatch(s) by some kind of reasonable logic
    - AND use body of your message as part of this 'reasonable logic
FOR EXTRA CREDIT:
    - modify to create your camel contex in java
    - write your routes in java, unless you already did in your first pass



