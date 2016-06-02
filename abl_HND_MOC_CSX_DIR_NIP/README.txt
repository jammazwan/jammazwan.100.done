Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area, catch exceptions and deal with them with a handler
    - use mocks to confirm that recipients and/or messages conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from cxf.[contract first cxf bean]
    - your Message body should now consist of java object 
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - unmarshal object(s) into CSV format
    - FTP into named folder
FOR EXTRA CREDIT:
    - modify to create your camel contex in java
    - add a script, or manually if only option, deploying to a Docker engine
    - write your routes in java, unless you already did in your first pass



