Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area or process, utilize the Dead Letter approach
    - use the "act surprised method" and do no testing of any sort
PSEUDOCODE FOR ROUTES
    [1st route]
    - from file:CSV_TRANS
    - unmarshall to [java object model] with bindy 
    - your Message body should now consist of java object 
    - to JMS endpoint
    [2nd route]
    - from JMS endpoint
    - use JPA to persist object into database
FOR EXTRA CREDIT:
    - modify to create your camel contex in java
    - modify to use a remote or embedded db, whichever you did not use for your first pass
    - write your routes in java, unless you already did in your first pass



