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
    - begin route with Processor bean, declared in Camel Context as a ref, not a URI 
    - your Message body should now consist of java object 
    - transform body here with Processor bean, declared in Camel Context as a ref, not a URI 
    - exit transform with body as a string 
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - FTP this to a named folder, using the file name of 'Important', suffixed with a timestamp, and '.txt'
FOR EXTRA CREDIT:
    - modify to use spring for your camel context, if not already in spring
    - write your routes in xml, unless you already did in your first pass



