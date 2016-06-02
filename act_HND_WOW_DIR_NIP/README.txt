Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area, catch exceptions and deal with them with a handler
    - use the "act surprised method" and do no testing of any sort
PSEUDOCODE FOR ROUTES
    [1st route]
    - from timer... with appropriate attributes
    - begin route with Processor bean, declared in Camel Context as a URI, not a ref 
    - your Message body should now consist of java object 
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - use JPA to persist object into database
FOR EXTRA CREDIT:
    - modify to create your camel contex in java, within your testt
    - modify to use a remote or embedded db, whichever you did not use for your first pass
    - add a script, or manually if only option, deploying to Fabric8
    - write your routes in xml, unless you already did in your first pass



