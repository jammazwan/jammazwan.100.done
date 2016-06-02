Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - in at least one area or process, utilize the Dead Letter approach
    - use the "act surprised method" and do no testing of any sort
PSEUDOCODE FOR ROUTES
    [1st route]
    - from file:XML_MENU
    - your Message body should now consist of XML file contents 
    - transform body here with Processor bean, declared in Camel Context as a ref, not a URI 
    - exit transform with body as a java object 
    - to JMS endpoint
    [2nd route]
    - from JMS endpoint
    - unmarshal object(s) into CSV format
    - FTP into named folder
FOR EXTRA CREDIT:
    - modify to use spring for your camel context, if not already in spring
    - add a script, or manually if only option, deploying to a Docker engine
    - write your routes in java, unless you already did in your first pass



