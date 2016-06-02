Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area or process, utilize the Dead Letter approach
    - use mocks to confirm that recipients and/or messages conform to expectations
PSEUDOCODE FOR ROUTES
    - template.sendBody([some String by you]) FROM INSIDE JUNIT TEST
    [1st route]
    - your message body is now a simple string
    - transform the string using a Processor, by modifying the existing string in the IN message
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - use the Routing Slip EIPattern to create dispatch(s) by some kind of reasonable logic
    - AND use body of your message as part of this 'reasonable logic
FOR EXTRA CREDIT:
    - modify to create your camel contex in blueprint.xml
    - add a script, or manually if only option, deploying to Fabric8
    - write your routes in xml, unless you already did in your first pass



