Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - default to the normal exception handling provided
    - use mocks to confirm that recipients and/or messages conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from cxf.[contract first cxf bean]
    - your Message body should now consist of java object 
    - to JMS endpoint
    [2nd route]
    - from JMS endpoint
    - use JPA to persist object into database
FOR EXTRA CREDIT:
    - modify to create your camel contex in java
    - modify to use a remote or embedded db, whichever you did not use for your first pass
    - write your routes in java, unless you already did in your first pass



