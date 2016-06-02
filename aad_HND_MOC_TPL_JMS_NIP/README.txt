Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area, catch exceptions and deal with them with a handler
    - use mocks to confirm that recipients and/or messages conform to expectations
PSEUDOCODE FOR ROUTES
    - template.sendBody([some String by you]) FROM INSIDE JUNIT TEST
    [1st route]
    - your message body is now a simple string
    - to JMS endpoint
    [2nd route]
    - from JMS endpoint
    - send this message via JMS to something that sounds important
FOR EXTRA CREDIT:
    - modify to use spring for your camel context, if not already in spring
    - add a script, or manually if only option, deploying to a EAP
    - write your routes in java, unless you already did in your first pass



