Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area or process, utilize the Dead Letter approach
    - use mocks to confirm that recipients and/or messages conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from cxf.[code first cxf bean]
    - your Message body should now consist of java object 
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - use JPA to persist object into database
FOR EXTRA CREDIT:
    - modify to create your camel contex in blueprint.xml
    - modify to use a remote or embedded db, whichever you did not use for your first pass
    - add a script, or manually if only option, deploying to a EAP
    - write your routes in xml, unless you already did in your first pass



