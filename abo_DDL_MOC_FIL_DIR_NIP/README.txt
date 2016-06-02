Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area or process, utilize the Dead Letter approach
    - use mocks to confirm that recipients and/or messages conform to expectations
PSEUDOCODE FOR ROUTES
    [1st route]
    - from file:JSON_ZIP
    - your Message body should now consist of JSON file contents 
    - transform body here with anonymous inner class Processor 
    - exit transform with body as a java object 
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - use JPA to persist object into database
FOR EXTRA CREDIT:
    - modify to create your camel contex in java
    - modify to use a remote or embedded db, whichever you did not use for your first pass
    - add a script, or manually if only option, deploying to a Docker engine
    - write your routes in java, unless you already did in your first pass



