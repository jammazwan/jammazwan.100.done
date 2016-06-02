Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - default to the normal exception handling provided
    - in at least one area, use an integration test to confirm that actual message or recipients conform to expectations
PSEUDOCODE FOR ROUTES
    - template.sendBody([some String by you]) FROM INSIDE JUNIT TEST
    [1st route]
    - your message body is now a simple string
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - use the Dynamic Route EIPattern to create dispatch(s) by some kind of reasonable logic
    - consume or modify headers of your message as part of this 'reasonable logic'
FOR EXTRA CREDIT:
    - modify to use spring for your camel context, if not already in spring
    - add a script, or manually if only option, deploying to a Docker engine
    - write your routes in java, unless you already did in your first pass



