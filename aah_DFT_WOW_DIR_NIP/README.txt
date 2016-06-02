Goals:
- push your skills past your Camel comfort zone
- increase your speed and agility through reps
- provide minimal example boilerplate so you can focus on value-add skills
	
PROJECT REQUIREMENTS
    - default to the normal exception handling provided
    - use the "act surprised method" and do no testing of any sort
PSEUDOCODE FOR ROUTES
    [1st route]
    - from timer... with appropriate attributes
    - begin route with Processor bean, declared in Camel Context as a ref, not a URI 
    - your Message body should now consist of java object 
    - transform body here with Processor bean, declared in Camel Context as a ref, not a URI 
    - exit transform with body as JSON 
    - to direct endpoint
    [2nd route]
    - from direct endpoint
    - FTP file to a specified folder
    - log as FTP'd to a folder and identify name of file in the log
FOR EXTRA CREDIT:
    - modify to create your camel contex in blueprint.xml
    - write your routes in xml, unless you already did in your first pass



